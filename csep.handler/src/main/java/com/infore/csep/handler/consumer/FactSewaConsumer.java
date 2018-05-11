package com.infore.csep.handler.consumer;

import com.github.cnbzzz.spring.boot.starter.rocketmq.annotation.RocketMQMessageListener;
import com.github.cnbzzz.spring.boot.starter.rocketmq.core.RocketMQListener;
import com.google.common.base.Preconditions;
import com.infore.csep.common.netty.dto.FactSewaPack;
import com.infore.csep.common.service.IFactsewaService;
import com.infore.csep.pojo.rocketmq.TopicName;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.IntStream;

/**
 * This file is part of csep Project
 * Created by cnbzzz (cnbzzz@126.com) on 2018/4/25 11:34
 * Copyright (c) 2018 github.com/cnbzzz
 */
@Slf4j
@Service
@RocketMQMessageListener(topic = TopicName.PLC_30, consumerGroup = TopicName.PLC_30)
public class FactSewaConsumer implements RocketMQListener<FactSewaPack> {

    @Autowired
    private IFactsewaService service;

//    long l = 0l;

    @Override
    public void onMessage(FactSewaPack pack) throws Exception {
        boolean bool = service.hander(pack);
        Preconditions.checkState(bool);
//        System.err.println(l++);
    }

    public static void main(String[] args) {
        int sum = IntStream
                .range(0, 1000).parallel().map(n -> n * n).sum();
        System.out.println(sum);
    }
}
