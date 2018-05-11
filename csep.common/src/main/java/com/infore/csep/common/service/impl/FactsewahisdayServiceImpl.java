package com.infore.csep.common.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.infore.csep.common.MyDateUtils;
import com.infore.csep.common.service.IFactsewahisdayService;
import com.infore.csep.pojo.entity.Factsewahisday;
import com.infore.csep.pojo.entity.Factsewahishour;
import com.infore.csep.pojo.mapper.FactsewahisdayMapper;

import com.infore.csep.pojo.mapper.FactsewahishourMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author bzzz
 * @since 2018-04-23
 */
@Service
@Slf4j
public class FactsewahisdayServiceImpl extends ServiceImpl<FactsewahisdayMapper, Factsewahisday> implements IFactsewahisdayService {

    //数据源
    @Autowired
    private FactsewahishourMapper factsewahishourMapper;

    //目标
    @Autowired
    private FactsewahisdayMapper factsewahisdayMapper;


    @Override
    public Factsewahishour findOneByFactNumAndEqumNum(Integer factNum, String equmNum, Date beginTime, Date endTime) {

        Wrapper<Factsewahishour> wrapper = new EntityWrapper<Factsewahishour>()
                .eq("factNum", factNum).eq("equmNum", equmNum)
                .ge("revTime", beginTime).lt("revTime", endTime)
                .orderBy("revTime", false)
                .last("limit 1");

        List<Factsewahishour> factsewahis = factsewahishourMapper.selectList(wrapper);


        if (factsewahis.size() == 0) {
            return null;
        } else {
            return factsewahis.get(0);
        }
    }

    private String[] getIgnoreProperties() {

        String[] ignoreProperties = {
                "valCodMax", "valCodMin", "valCodAvg",
                "valNitrMax", "valNitrMin", "valNitrAvg",
                "valNihMax", "valNihMin", "valNihAvg",
                "valPhoMax", "valPhoMin", "valPhoAvg",
                "valOutssMax", "valOutssMin", "valOutssAvg",
                "valOutByMax", "valOutByMin", "valOutByAvg",
                "valOutTempMax", "valOutTempMin", "valOutTempAvg",
                "valRuntimeMax", "valRuntimeMin", "valRuntimeAvg",
                "valSrcMax", "valSrcMin", "valSrcAvg",
                "valPowptMax", "valPowptMin", "valPowptAvg",
                "valPowerMax", "valPowerMin", "valPowerAvg",
                "valMBR1Max", "valMBR1Min", "valMBR1Avg",
                "valMBR2Max", "valMBR2Min", "valMBR2Avg",
                "valMBR3Max", "valMBR3Min", "valMBR3Avg",
                "valMBR4Max", "valMBR4Min", "valMBR4Avg",
                "valMBR5Max", "valMBR5Min", "valMBR5Avg",
                "valMBR6Max", "valMBR6Min", "valMBR6Avg",
                "valMBR7Max", "valMBR7Min", "valMBR7Avg",
                "valMBR8Max", "valMBR8Min", "valMBR8Avg",
                "valMBR9Max", "valMBR9Min", "valMBR9Avg",
                "valMBR10Max", "valMBR10Min", "valMBR10Avg",
                "valMBRsum1Max", "valMBRsum1Min", "valMBRsum1Avg",
                "valMBRsum2Max", "valMBRsum2Min", "valMBRsum2Avg",
                "valMBRsum3Max", "valMBRsum3Min", "valMBRsum3Avg",
                "valMBRsum4Max", "valMBRsum4Min", "valMBRsum4Avg",
                "valMBRsum5Max", "valMBRsum5Min", "valMBRsum5Avg",
                "valMBRsum6Max", "valMBRsum6Min", "valMBRsum6Avg",
                "valMBRsum7Max", "valMBRsum7Min", "valMBRsum7Avg",
                "valMBRsum8Max", "valMBRsum8Min", "valMBRsum8Avg",
                "valMBRsum9Max", "valMBRsum9Min", "valMBRsum9Avg",
                "valMBRsum10Max", "valMBRsum10Min", "valMBRsum10Avg",
                "allFlagMax", "allFlagMin", "allFlagAvg",
                "valInBLMax", "valInBLMin", "valInBLAvg",
                "valPoolBLMax", "valPoolBLMin", "valPoolBLAvg",
                "valSandBLMax", "valSandBLMin", "valSandBLAvg",
                "valSdgBLMax", "valSdgBLMin", "valSdgBLAvg",
        };

        return ignoreProperties;
    }

    @Override
    @Transactional
    public void genData(Date beginTime, Date endTime) {

        //1.获取历史表在“时间范围内”各项指示的最大值，最小值，平均值
        List<Factsewahisday> factsewahishours = factsewahisdayMapper.findByTime(beginTime, endTime);

        for (Factsewahisday item : factsewahishours) {

            //2.根据厂站编码和设备编码，在时间范围内查询最新的一条记录
            Factsewahishour factleachhis = findOneByFactNumAndEqumNum(item.getFactNum(),
                    item.getEqumNum(), beginTime, endTime);

            if (factleachhis != null) {

                //3.根据1,2的结果生成小时表纪录
                //复制属性(列表的字段不复制)
                BeanUtils.copyProperties(factleachhis, item, getIgnoreProperties());
            } else {
                log.warn("findOneByFactNumAndEqumNum is null:{}|{}", item.getFactNum(),
                        item.getEqumNum());
            }


            //重新设置一些属性
            item.setId(null); //id重新生成
            //设置时间为结束时间（考虑重跑的情况，不然可以设置为当前时间)
            item.setRevTime(endTime);
            item.setGenCycle(MyDateUtils.Date2yyyyMMddHH(endTime)/100);

            //设置插入时间为当前时间
            item.setInsertTime(new Date());
        }

        for (Factsewahisday factDay : factsewahishours) {
            log.info("Factsewahisday: {}", factDay);
        }

        //4.插入小时表(批量提交)
        if (!factsewahishours.isEmpty()) {
            insertBatch(factsewahishours);
        }
    }


    @Override
    public List<Factsewahisday> findByFactNumAndEqumNum(Integer factNum, String equmNum, Date beginTime, Date endTime) {


        Wrapper<Factsewahisday> wrapper = new EntityWrapper<Factsewahisday>()
                .eq("factNum", factNum)
                .ge("revTime", beginTime).lt("revTime", endTime)
                .orderBy("revTime", true);

        if(!equmNum.isEmpty()) {
            wrapper.eq("equmNum", equmNum);
        }

        return  selectList(wrapper);

    }
}



