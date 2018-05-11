package com.infore.csep.common.netty.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * This file is part of csep Project
 * Created by cnbzzz (cnbzzz@126.com) on 2018/4/13 12:28
 * Copyright (c) 2018 github.com/cnbzzz
 */
@Data
public class PlcPack implements Serializable {

//    @Unpack(index = 0, length = 2)
    private int start; //起始符 2字节

//    @Unpack(index = 2, length = 1)
    private int deviceType; //设备类型 1字节 00保留；10渗滤液一体化设备；20乡镇污水一体化设备；40渗滤液处理厂站；50乡镇污水处理厂站；

//    @Unpack(index = 3, length = 4)
    private int factoryId; //厂站编号 4字节

//    @Unpack(index = 7, length = 12)
    private String deviceId; //设备出厂编号 12字节

//    @Unpack(index = 19, length = 1)
    private int commond; //命令号 00保留；01定时上传数据；02即时上传数据；03工况召回数据 ；

    //渗滤液一体化设备：工况数据=00、运营数据=01、罐系统参数=02、一级系统参数=03、二级系统参数=04 、保养显示与设置=05；
    //乡镇污水一体化设备：设备工况数据=10
    //渗滤液处理厂站：工况数据=20、运营数据=21、罐系统参数=22、一级系统参数=23、二级系	统参数=24 、保养显示与设置=25；外围系统数据1=26；外围系统数据2=27；
    //外围系统数据3=28；
    //乡镇污水处理厂站：设备工况数据=30、外围及运营数据=31；
//    @Unpack(index = 20, length = 1)
    private int dataType;

    private byte[] content;

    private int count;

    private int end;
}
