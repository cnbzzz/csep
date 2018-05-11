package com.infore.csep.common.netty.dto;

import com.infore.csep.common.netty.annotation.Unpack;
import lombok.Data;

import java.util.Date;

/**
 * This file is part of csep Project
 * Created by cnbzzz (cnbzzz@126.com) on 2018/4/24 16:34
 * Copyright (c) 2018 github.com/cnbzzz
 */
@Data
public class FactleachSyspPPack extends FactleachBasePack {

    @Unpack(index = 10, length = 2)
    private Integer syspSrcBy; //原水罐PH设定值BY02221


    @Unpack(index = 12, length = 2)
    private Integer syspClnBy; //清水罐PH设定值BY09721


    @Unpack(index = 14, length = 2)
    private Integer syspSpumpBls; //潜水泵启动液位M02411


    @Unpack(index = 16, length = 2)
    private Integer syspSpumpBle; //潜水泵停止液位M02411


    @Unpack(index = 18, length = 2)
    private Integer syspSrcpumpBls; //原水泵启动液位M02211


    @Unpack(index = 20, length = 2)
    private Integer syspSrcpumpBle; //原水泵停止液位M02211


    @Unpack(index = 22, length = 2)
    private Integer syspAcpumpBls; //酸泵启动液位M00111


    @Unpack(index = 24, length = 2)
    private Integer syspClnpumpBls; //清水泵启动液位M09711


    @Unpack(index = 26, length = 2)
    private Integer syspClnpumpBle; //清水泵停止液位M09711


    @Unpack(index = 28, length = 2)
    private Integer syspClnoutBlo; //QV09711开启排水液位


    @Unpack(index = 32, length = 2)
    private Integer syspClnoutBlc; //QV09711关闭排水液位


    @Unpack(index = 34, length = 2)
    private Integer syspSrcByl; //原水罐PH值低限


    @Unpack(index = 38, length = 2)
    private Integer syspSrcByldelay; //原水罐BY02221PH低限_报警延时


    @Unpack(index = 40, length = 2)
    private Integer syspSrcByh; //原水罐PH值高限BY02221


    @Unpack(index = 44, length = 2)
    private Integer syspSrcByhdelay; //原水罐BY02221PH高限_报警延时


    @Unpack(index = 46, length = 2)
    private Integer syspClnByl; //清水罐PH值低限BY09721


    @Unpack(index = 50, length = 2)
    private Integer syspClnByldelay; //清水罐BY09721PH低限_报警延时


    @Unpack(index = 52, length = 2)
    private Integer syspClnByh; //清水罐PH值高限BY09721


    @Unpack(index = 54, length = 2)
    private Integer syspClnByhdelay; //清水罐BY09721PH高限_报警延时


    @Unpack(index = 56, length = 2)
    private Integer syspSrcBll; //原水罐液位BL02211低报警 


    @Unpack(index = 60, length = 2)
    private Integer syspSrcBlh; //原水罐液位BL02211高报警


    @Unpack(index = 62, length = 2)
    private Integer syspClnBll; //清水罐液位BL09711低


    @Unpack(index = 64, length = 2)
    private Integer syspClnBlh; //清水罐液位BL09711高


    @Unpack(index = 66, length = 2)
    private Integer syspAirpresldelay; //空压机供气压力低报警延时BP00811


    @Unpack(index = 82, length = 2)
    private Integer cout; //计数


    @Unpack(index = 84, length = 12)
    private String equipmentNo; //设备编码


    @Unpack(index = 96, length = 1)
    private Integer plcComm; //PLC通讯类型


}
