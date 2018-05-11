package com.infore.csep.gpsreceiver.service;

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
public class UpServiceTest {

    @Autowired
    private UpService upService;

    @Test
    public void uploadCurrentLocation() throws Exception {

        upService.uploadCurrentLocation("541A916090006");

    }

    @Test
    public void uploadCurrentConditionData() throws Exception {

//        upService.uploadCurrentConditionData("541A918049801");
        upService.uploadCurrentConditionData("541A916090006");
    }

    @Test
    public void handleResponse() throws Exception {
        String condition = "5A4C1500000D04541A91609000620100A702EE00A4000200000000000000980001800000000000000000000000000000000000F00000000000040000003F0034003F0032000000000000000027100000000000400000002D0000001C000000000000000000FA00000111010601E0002C00140000000000000000000000000000000000000000000000000000007D0000000000030000000000000000268B00000102574A465358440100002E070501030000000010006403B80D";

        upService.handleResponse(condition);
    }

}