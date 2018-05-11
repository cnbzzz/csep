package com.infore.csep.common.netty.dto;

import lombok.Data;

import java.util.Date;

/**
 * This file is part of csep Project
 * Created by cnbzzz (cnbzzz@126.com) on 2018/4/24 17:13
 * Copyright (c) 2018 github.com/cnbzzz
 */
@Data
public class FactleachBasePack {


    //1层包命令
    private Integer command; //C1、C2、C3


    //当前时间
    private Date revTime = new Date(); //接收到消息包的系统时间


    //1层包流水号
    private Integer equmSeq; //原始流水号,可能会存在不同设备之间重复


    //1层包终端id
    private String equmID; //估计是只有4位的一个数字


    //2层包设备类型
    private Integer equmType = 40; //固定是40，留作扩展


    //2层包厂站编号
    private Integer factNum; //估计是数字


    //2层包设备出厂编号
    private String equmNum; //应该是一串字符


    //2层包数据类型
    private Integer dataType; //固定是22,留作扩展

}
