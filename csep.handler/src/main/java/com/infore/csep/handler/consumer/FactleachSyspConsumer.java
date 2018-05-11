package com.infore.csep.handler.consumer;

import com.github.cnbzzz.spring.boot.starter.rocketmq.annotation.RocketMQMessageListener;
import com.github.cnbzzz.spring.boot.starter.rocketmq.core.RocketMQListener;
import com.google.common.base.Preconditions;
import com.infore.csep.common.netty.dto.FactleachSyspPPack;
import com.infore.csep.common.service.IFactleachsyspphisService;
import com.infore.csep.pojo.rocketmq.TopicName;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This file is part of csep Project
 * Created by cnbzzz (cnbzzz@126.com) on 2018/4/24 18:26
 * Copyright (c) 2018 github.com/cnbzzz
 */
@Slf4j
@Service
@RocketMQMessageListener(topic = TopicName.PLC_22, consumerGroup = TopicName.PLC_22)
public class FactleachSyspConsumer implements RocketMQListener<FactleachSyspPPack> {

    @Autowired
    private IFactleachsyspphisService service;

    @Override
    public void onMessage(FactleachSyspPPack pack) throws Exception {
        boolean b = service.hander(pack);
        Preconditions.checkState(b);
    }
}
