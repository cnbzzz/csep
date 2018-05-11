package com.infore.csep.common.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.google.common.base.Joiner;
import com.infore.csep.common.ByteUtils;
import com.infore.csep.common.CommonUtils;
import com.infore.csep.common.netty.dto.GpsSewaPack;
import com.infore.csep.common.service.*;
import com.infore.csep.pojo.entity.*;
import com.infore.csep.pojo.mapper.GpssewaMapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;


/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author bzzz
 * @since 2018-04-17
 */
@Service
@Slf4j
public class GpssewaServiceImpl extends ServiceImpl<GpssewaMapper, Gpssewa> implements IGpssewaService {


    @Autowired
    private IGpssewahisService gpssewahisService;

    @Autowired
    private IFactleachService factleachService;

    @Autowired
    private IGpssewatimeService gpssewatimeService;

    @Autowired
    private IGpssewarunhisService gpssewarunhisService;

    @Autowired
    private IGpssewaalarmService gpssewaalarmService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean handle(@NonNull GpsSewaPack pack) {

        boolean result = true;

        try {
            //1.状态表
            Gpssewa gpssewa = handleGpssewa(pack);

            //2.历史表
            handleGpssewahis(pack, gpssewa);

            //3.运行状态
            factleachService.handleRuntime(gpssewa, gpssewatimeService, Gpssewatime.class,
                    PROP_NAME_LIST, gpssewarunhisService, Gpssewarunhis.class);

            log.debug("gpssewa:{}", gpssewa);
            //4.报警处理
            handleFactsewaAlarm(gpssewa);


        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new RuntimeException(e.getMessage(), e);
        }


        return result;
    }

    /**
     * 处理历史表
     *
     * @param pack
     * @param gpssewa
     * @return
     * @throws Exception
     */
    private Gpssewahis handleGpssewahis(@NonNull GpsSewaPack pack, @NonNull Gpssewa gpssewa) throws Exception {
        Gpssewahis gpssewahis = new Gpssewahis();
        BeanUtils.copyProperties(gpssewahis, gpssewa);

        //添加一些状态表不关心的数据
        gpssewahis.setId(null); //必须重置才会再生成
        gpssewahis.setCommand(pack.getCommand());
        gpssewahis.setEqumSeq(pack.getEqumSeq());
        gpssewahis.setEqumID(Long.parseLong(pack.getEqumID()));

        gpssewahisService.insert(gpssewahis);

        return gpssewahis;
    }

    /**
     * 处理状态表
     *
     * @param pack
     * @return
     * @throws Exception
     */
    private Gpssewa handleGpssewa(@NonNull GpsSewaPack pack) throws Exception {

        Gpssewa gpssewa = new Gpssewa();

        //复制名字相同的那部分属性
        BeanUtils.copyProperties(gpssewa, pack);

        //获得标记位的属性们
        StringBuilder sb = new StringBuilder();
        byte[] bytes = pack.getAllFlag();
        for (int i = 0; i < bytes.length; i++) {
            sb.append(ByteUtils.byteToBit(bytes[i]));
        }
        String allFlag = sb.toString();
        gpssewa.setAllFlag(allFlag);

        //GPS厂站字段名称有变
        log.info("handleGpssewa: {}", gpssewa);

        //查询状态表是否存在记录，存在：update 不存在 insert
        Integer factNum = pack.getFactNum();
        String equmNum = pack.getEqumNum();
        Wrapper condition = new EntityWrapper<Gpssewa>()
                .eq("factNum", factNum).eq("equmNum", equmNum);

        Gpssewa one = selectOne(condition);
        if (one == null) {
            insert(gpssewa);
        } else {
            gpssewa.setId(one.getId());
            updateById(gpssewa);
            //update(gpssewa, condition);
        }

        return gpssewa;

    }

    /**
     * 调用JS根据360的数据生成告警数据
     *
     * @param gpssewa
     */
    private void handleFactsewaAlarm(Gpssewa gpssewa) {
        IJsWorker jsWorker = JsWorker.getJsWorker();
        List<Gpssewaalarm> list = jsWorker.gainGpssewaalarmArry(gpssewa);

        gpssewaalarmService.insertBatch(list);
    }

    private List<String> PROP_NAME_LIST = Arrays.asList("valMan", "valAuto", "setMan", "setAuto", "setStart", "setStop", "setTerm", "setRest", "setSubBlowMan", "setAgit1man", "setAgit2Man", "setPiPumpMan", "setLiPumpMan", "setUvMan", "setMudValve", "", "runSubBlow", "runSubBlowOL", "runAgit1", "runAgit1OL", "runAgit2", "runAgit2OL", "runPiPump", "runPipumpOL", "runLipump", "runLipumpOL", "runUv", "runUvOL", "runTankLl", "runTankL", "runTankH", "runMvC", "runMvO", "runLiL", "runTerm", "setSubBlow", "setAgit1", "setAgit2", "setPiPump", "setLiPump", "setUv", "setMvO", "setMvC", "setTScrn", "", "", "", "setLock");

    //以下测试代码主要是为了生成PROP_NAME_LIST(各个标志位在360中的位置)
    public static void main(String[] args) {

        List<Integer> ascIntArr = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 47);

        List<Integer> ignoreIndexList = CommonUtils.findNotContnumlist(ascIntArr);
        System.err.println(Joiner.on(",").join(ignoreIndexList));
        List<String> fieldList = CommonUtils.getFillFieldList(Gpssewatime.class, ignoreIndexList);
        System.err.println(fieldList.size());
        System.err.println(Joiner.on(", ").join(fieldList));

    }

}
