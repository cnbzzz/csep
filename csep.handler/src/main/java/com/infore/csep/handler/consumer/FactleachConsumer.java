package com.infore.csep.handler.consumer;

import com.github.cnbzzz.spring.boot.starter.rocketmq.annotation.RocketMQMessageListener;
import com.github.cnbzzz.spring.boot.starter.rocketmq.core.RocketMQListener;
import com.google.common.base.Preconditions;
import com.infore.csep.common.netty.dto.FactleachPack;
import com.infore.csep.pojo.rocketmq.TopicName;
import com.infore.csep.common.service.IFactleachService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This file is part of csep Project
 * Created by cnbzzz (cnbzzz@126.com) on 2018/4/17 16:36
 * Copyright (c) 2018 github.com/cnbzzz
 */

@Slf4j
@Service
@RocketMQMessageListener(topic = TopicName.PLC_20, consumerGroup = TopicName.PLC_20)
public class FactleachConsumer implements RocketMQListener<FactleachPack> {

    @Autowired
    private IFactleachService factLeachService;


    @Override
    public void onMessage(FactleachPack pack) throws Exception {
        boolean bool = factLeachService.handle(pack);
        Preconditions.checkState(bool);
    }
}
