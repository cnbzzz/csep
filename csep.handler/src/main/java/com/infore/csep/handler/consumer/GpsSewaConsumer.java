package com.infore.csep.handler.consumer;

import com.github.cnbzzz.spring.boot.starter.rocketmq.annotation.RocketMQMessageListener;
import com.github.cnbzzz.spring.boot.starter.rocketmq.core.RocketMQListener;
import com.google.common.base.Preconditions;
import com.infore.csep.common.netty.dto.GpsSewaPack;
import com.infore.csep.common.service.IGpssewaService;
import com.infore.csep.pojo.rocketmq.TopicName;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by steven ma
 * 2018/5/2 20:02
 */
@Slf4j
@Service
@RocketMQMessageListener(topic = TopicName.PLC_10, consumerGroup = TopicName.PLC_10)
public class GpsSewaConsumer implements RocketMQListener<GpsSewaPack> {

    @Autowired
    private IGpssewaService service;


    @Override
    public void onMessage(GpsSewaPack pack) throws Exception {
        boolean bool = service.handle(pack);
        Preconditions.checkState(bool);
    }
}
