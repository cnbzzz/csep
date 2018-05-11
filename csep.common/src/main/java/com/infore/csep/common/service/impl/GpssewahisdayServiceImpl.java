package com.infore.csep.common.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.infore.csep.common.MyDateUtils;
import com.infore.csep.common.service.IGpssewahisdayService;
import com.infore.csep.pojo.entity.Gpssewahisday;
import com.infore.csep.pojo.entity.Gpssewahishour;
import com.infore.csep.pojo.mapper.GpssewahisdayMapper;

import com.infore.csep.pojo.mapper.GpssewahishourMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bzzz
 * @since 2018-04-23
 */
@Service
@Slf4j
public class GpssewahisdayServiceImpl extends ServiceImpl<GpssewahisdayMapper, Gpssewahisday> implements IGpssewahisdayService {

    //数据源
    @Autowired
    private GpssewahishourMapper hourMapper;

    //目标
    @Autowired
    private GpssewahisdayMapper dayMapper;

    /**
     * 查询源记录返回（为了填充）
     * @param factNum
     * @param equmNum
     * @param beginTime
     * @param endTime
     * @return
     */
    @Override
    public Gpssewahishour findOneByFactNumAndEqumNum(String factNum, String equmNum, Date beginTime, Date endTime) {

        Wrapper<Gpssewahishour> wrapper = new EntityWrapper<Gpssewahishour>()
                .eq("factNum", factNum).eq("equmNum", equmNum)
                .ge("revTime", beginTime).lt("revTime", endTime)
                .orderBy("revTime", false)
                .last("limit 1");

        List<Gpssewahishour> factsewahis = hourMapper.selectList(wrapper);


        if (factsewahis.size() == 0) {
            return null;
        } else {
            return factsewahis.get(0);
        }
    }


    private String[] getIgnoreProperties() {

        String[] ignoreProperties = {
                "valRunHourMax","valRunHourMin","valRunHourAvg",
                "valPowerMax","valPowerMin","valPowerAvg",
                "valWalMax","valWalMin","valWalAvg",
                "valClnMax","valClnMin","valClnAvg",
                "valPipMax","valPipMin","valPipAvg",
                "valTankLMax","valTankLMin","valTankLAvg",
        };

        return ignoreProperties;
    }

    @Override
    @Transactional
    public void genData(Date beginTime, Date endTime) {

        //1.获取历史表在“时间范围内”各项指示的最大值，最小值，平均值
        List<Gpssewahisday> factsewahishours = dayMapper.findByTime(beginTime, endTime);

        for (Gpssewahisday item : factsewahishours) {

            //2.根据厂站编码和设备编码，在时间范围内查询最新的一条记录
            Gpssewahishour factleachhis = findOneByFactNumAndEqumNum(item.getFactNum(),
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

        for (Gpssewahisday factDay : factsewahishours) {
            log.info("Gpssewahisday: {}", factDay);
        }

        //4.插入小时表(批量提交)
        if (!factsewahishours.isEmpty()) {
            insertBatch(factsewahishours);
        }
    }

    /**
     * 查询时间范围内天报表
     * @param factNum
     * @param equmNum
     * @param beginTime
     * @param endTime
     * @return
     */
    @Override
    public List<Gpssewahisday> findByFactNumAndEqumNum(String factNum, String equmNum, Date beginTime, Date endTime) {

        Wrapper<Gpssewahisday> wrapper = new EntityWrapper<Gpssewahisday>()
                .eq("factNum", factNum)
                .ge("revTime", beginTime).lt("revTime", endTime)
                .orderBy("revTime", true);

        if(!equmNum.isEmpty()) {
            wrapper.eq("equmNum", equmNum);
        }


        return  selectList(wrapper);

    }

}
