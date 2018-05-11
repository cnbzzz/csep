package com.infore.csep.receiver.service;

/**
 * This file is part of csep Project
 * Created by cnbzzz (cnbzzz@126.com) on 2018/4/13 11:20
 * Copyright (c) 2018 github.com/cnbzzz
 */
public interface IDownChannelService extends IChannelService {

    //平台下发指令
    void sendPack(int commond, int fromNum, String clientId, byte[] content);

}
