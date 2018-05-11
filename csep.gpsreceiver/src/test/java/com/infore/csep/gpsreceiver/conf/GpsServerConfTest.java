package com.infore.csep.gpsreceiver.conf;

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
public class GpsServerConfTest {

    @Autowired
    private GpsServerConf gpsServerConf;

    @Test
    public void PrintConf() {

        log.info("apiuer: {}", gpsServerConf.getApiuser());
        log.info("appiusermd5: {}", gpsServerConf.getApiusermd5());
        log.info("serverurl: {}", gpsServerConf.getServerurl());
        log.info("KEY_3DESENCODE {}", gpsServerConf.getKEY_3DESENCODE());
        log.info("KEY_3DESDECODE {}", gpsServerConf.getKEY_3DESDECODE());


    }

}