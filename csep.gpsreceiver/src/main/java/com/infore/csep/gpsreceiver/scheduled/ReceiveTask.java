package com.infore.csep.gpsreceiver.scheduled;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by steven ma
 * 2018/4/26 17:34
 */

@Slf4j
@Component
public class ReceiveTask {

    //每隔10秒执行一次
    @Scheduled(fixedDelayString = "${jobs.fixedDelay}")
    public void Recv(){
        log.info("Recv......");
    }
}
