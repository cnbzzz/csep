package com.infore.csep.gendatatest.gendata;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class GenFactSewaHisTest {

    @Autowired
    private GenFactSewaHis genFactSewaHis;


    @Test
    public void genOneRecord() throws Exception {
       genFactSewaHis.genOneRecord();
    }

}