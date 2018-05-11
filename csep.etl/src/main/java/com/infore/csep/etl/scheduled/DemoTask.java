package com.infore.csep.etl.scheduled;

import com.infore.csep.etl.TaskService.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by steven ma
 * 2018/4/17 17:33
 */
@Component
@Slf4j
public class DemoTask {


    @Autowired
    private FactLeachHisHourTaskService factLeachHisHourTaskService;

    @Autowired
    private FactLeachHisDayTaskService factLeachHisDayTaskService;

    @Autowired
    private GPSSewaHisHourTaskService gpsSewaHisHourTaskService;

    @Autowired
    private GPSSewaHisDayTaskService gpsSewaHisDayTaskService;

    @Autowired
    private FactSewaHisHourTaskService factSewaHisHourTaskService;

    @Autowired
    private FactSewaHisDayTaskService factSewaHisDayTaskService;

    /**
     * 按配置时间定时唤醒一次
     */
    @Scheduled(fixedDelayString = "${jobs.fixedDelay}")
    public void reportFixed(){
        log.info("reportFixed!");

        //渗滤液
        factLeachHisHourTaskService.runTask();
        factLeachHisDayTaskService.runTask();

        //GPS污水
        gpsSewaHisHourTaskService.runTask();
        gpsSewaHisDayTaskService.runTask();

        //厂站
        factSewaHisHourTaskService.runTask();
        factSewaHisDayTaskService.runTask();

    }

    @Scheduled(cron = "${jobs.cron}")
    public void reportCron() {

        log.info("reportCron!");

    }
}
