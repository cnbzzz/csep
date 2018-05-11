package com.infore.csep.gpsreceiver.param;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class BaseReqParamTest {

    @Autowired
    private BaseReqParam baseReqParam;

    @Test
    public void genBaseReqParam() throws Exception {
        String str = baseReqParam.genBaseReqParam("1524731302807", "downCurrentLocation",
                "12", "541A914050115");

        log.info("Ret: {}", str);
    }

}