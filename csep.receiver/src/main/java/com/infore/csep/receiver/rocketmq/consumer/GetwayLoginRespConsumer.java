package com.infore.csep.receiver.rocketmq.consumer;

import com.github.cnbzzz.spring.boot.starter.rocketmq.annotation.RocketMQMessageListener;
import com.github.cnbzzz.spring.boot.starter.rocketmq.core.RocketMQListener;
import com.infore.csep.common.netty.dto.CsepPack;
import com.infore.csep.pojo.rocketmq.TopicName;
import com.infore.csep.receiver.service.IDownChannelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This file is part of csep Project
 * Created by cnbzzz (cnbzzz@126.com) on 2018/4/13 16:32
 * Copyright (c) 2018 github.com/cnbzzz
 */
@Slf4j
@Service
@RocketMQMessageListener(topic = TopicName.GETWAY_LOGIN_RESP, consumerGroup = TopicName.GETWAY_LOGIN_RESP)
public class GetwayLoginRespConsumer implements RocketMQListener<CsepPack> {

    @Autowired
    private IDownChannelService downChannelService;

    @Override
    public void onMessage(CsepPack pack) {
//        downChannelService.sendPack(GETWAY_LOGIN_RESP.value(), pack.getFromNum(), pack.getClientId(), new byte[]{0x19, 0x00});
        log.info(this.getClass().getSimpleName() + " {}", pack);
    }
}
