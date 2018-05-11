package com.infore.csep.handler.consumer;

import com.github.cnbzzz.spring.boot.starter.rocketmq.annotation.RocketMQMessageListener;
import com.github.cnbzzz.spring.boot.starter.rocketmq.core.RocketMQListener;
import com.google.common.base.Preconditions;
import com.infore.csep.common.netty.dto.FactleachSysaPPack;
import com.infore.csep.common.service.IFactleachsysaphisService;
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
@RocketMQMessageListener(topic = TopicName.PLC_23, consumerGroup = TopicName.PLC_23)
public class FactleachSysaConsumer implements RocketMQListener<FactleachSysaPPack> {

    @Autowired
    private IFactleachsysaphisService service;

    @Override
    public void onMessage(FactleachSysaPPack pack) throws Exception {
        boolean b = service.hander(pack);
        Preconditions.checkState(b);
    }
}
