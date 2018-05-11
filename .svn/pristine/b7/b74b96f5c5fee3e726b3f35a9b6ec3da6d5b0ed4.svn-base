package com.infore.csep.handler.consumer;

import com.github.cnbzzz.spring.boot.starter.rocketmq.annotation.RocketMQMessageListener;
import com.github.cnbzzz.spring.boot.starter.rocketmq.core.RocketMQListener;
import com.github.cnbzzz.spring.boot.starter.rocketmq.core.RocketMQTemplate;
import com.infore.csep.common.netty.dto.CsepPack;
import com.infore.csep.pojo.rocketmq.TopicName;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.infore.csep.common.netty.dto.CsepPack.Commond.GETWAY_LOGIN_RESP;

/**
 * This file is part of csep Project
 * Created by cnbzzz (cnbzzz@126.com) on 2018/3/23 20:56
 * Copyright (c) 2018 github.com/cnbzzz
 */
@Slf4j
@Service
@RocketMQMessageListener(topic = TopicName.GETWAY_LOGIN, consumerGroup = TopicName.GETWAY_LOGIN)
public class GetwayLoginConsumer implements RocketMQListener<CsepPack> {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    public void onMessage(CsepPack pack) {
        int resp = GETWAY_LOGIN_RESP.value();
        pack.setCommond(resp);
        byte[] b = new byte[]{0x14, 0x00};
        pack.setContent(b);
        rocketMQTemplate.convertAndSend(TopicName.GETWAY_LOGIN_RESP, pack);
        log.info(this.getClass().getSimpleName() + " {}", pack);
    }

}
