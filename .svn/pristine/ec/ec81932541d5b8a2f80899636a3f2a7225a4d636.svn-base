package com.infore.csep.gendatatest.scheduled;

import com.infore.csep.gendatatest.gendata.GenFactLeachHis;
import com.infore.csep.gendatatest.gendata.GenFactSewaHis;
import com.infore.csep.gendatatest.gendata.GenGPSSewaHis;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by steven ma
 * 2018/4/20 16:42
 */

@Slf4j
@Component
public class GenTestDataTask {

    @Autowired
    private GenFactLeachHis genFactLeachHis;

    @Autowired
    private GenFactSewaHis genFactSewaHis;

    @Autowired
    private GenGPSSewaHis genGPSSewaHis;

    //每隔10秒执行一次
    @Scheduled(fixedDelayString = "${jobs.fixedDelay}")
    public void reportFixed(){
        log.info("Run Task: {}", genFactLeachHis.genOneRecord());
        log.info("Run Task: {}", genFactSewaHis.genOneRecord());
        log.info("Run Task: {}", genGPSSewaHis.genOneRecord());
    }
}
