package com.infore.csep.restful.service;


import com.alibaba.fastjson.JSONObject;
import com.infore.csep.common.netty.dto.FactleachSyspPPack;
import com.infore.csep.restful.VO.ActionResponseVO;
import com.infore.csep.restful.VO.AlarmReqVO;
import com.infore.csep.restful.VO.AsyncResultVO;
import com.infore.csep.restful.VO.ResultVO;
import lombok.extern.slf4j.Slf4j;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class Send2BusinessServiceTest {

    @Autowired
    private Send2BusinessService send2BusinessService;

    @Test
    public void sendAlarm() throws Exception {

        AlarmReqVO alarmReqVO = new AlarmReqVO();
        alarmReqVO.setEquipmentNo("123");
        alarmReqVO.setBytes("aaa");
        alarmReqVO.setValue("1");
        alarmReqVO.setAlarmTime("2018-03-13 15:39:00");

        List<AlarmReqVO> alarmReqVOS = new ArrayList<>();
        alarmReqVOS.add(alarmReqVO);

        ResultVO result = send2BusinessService.sendAlarm(alarmReqVOS);
        log.info("result: {}", result);


    }

    @Test
    public void sendActionResponse() {

        ActionResponseVO actionResponseVO = new ActionResponseVO();
        actionResponseVO.setSid("1111222");
        actionResponseVO.setCommand("abc");
        actionResponseVO.setEqumNo("");
        actionResponseVO.setData("1");


        ResultVO result = send2BusinessService.sendActionResponse(actionResponseVO);
        log.info("result: {}", result);

    }

    @Test
    public void sendAsyncResult() {

        AsyncResultVO asyncResultVO = new AsyncResultVO();
        FactleachSyspPPack syspPPack = new FactleachSyspPPack();
        syspPPack.setSyspSrcBy(110);
        syspPPack.setSyspClnBy(210);
        syspPPack.setEqumSeq(123456);

        asyncResultVO.setSid("11122");
        asyncResultVO.setCommand("dx11");
        asyncResultVO.setEqumNo("112233");
        asyncResultVO.setData(syspPPack);

        //asyncResultVO.setData(JSONObject.toJSONString(syspPPack));


        ResultVO result = send2BusinessService.sendAsyncResult(asyncResultVO);
        log.info("result: {}", result);

    }

}