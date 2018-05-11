package com.infore.csep.common.netty.dto;

import com.infore.csep.common.netty.annotation.Unpack;
import lombok.Data;

import java.util.Date;

/**
 * This file is part of csep Project
 * Created by cnbzzz (cnbzzz@126.com) on 2018/4/24 16:48
 * Copyright (c) 2018 github.com/cnbzzz
 */
@Data
public class FactleachSysbPPack extends FactleachBasePack {

    @Unpack(index = 10, length = 2)
    private Integer sysbRec; //二级回收率UI28011

    @Unpack(index = 12, length = 2)
    private Integer sysbIncomedelay; //二级进水启动延时时间设置

    @Unpack(index = 14, length = 2)
    private Integer sysbHpumpadelay; //二级高压泵M12011启动延时时间设置


    @Unpack(index = 16, length = 2)
    private Integer sysbValvedelay; //PV26921关闭延时时间设置


    @Unpack(index = 18, length = 2)
    private Integer sysbValvesetdelay; //MV26921调节延时时间设置


    @Unpack(index = 20, length = 2)
    private Integer sysbSrcwTime; //二级系统原水冲洗时间设置


    @Unpack(index = 22, length = 2)
    private Integer sysbAutodelay; //二级系统切换自动阀时间设置


    @Unpack(index = 24, length = 2)
    private Integer sysbChemPTime; //二级系统清洗剂添加时间设置


    @Unpack(index = 26, length = 2)
    private Integer sysbWashBl; //二级清洗液位LIR11011


    @Unpack(index = 28, length = 2)
    private Integer sysbHpumpdelay; //二级高压泵M26011化洗启动延时时间设置


    @Unpack(index = 32, length = 2)
    private Integer sysbChemrec; //二级化洗循环清洗时间


    @Unpack(index = 34, length = 2)
    private Integer sysbChemimmtime; //二级化洗浸泡时间


    @Unpack(index = 38, length = 2)
    private Integer sysbChemTime; //二级化洗总时间


    @Unpack(index = 40, length = 2)
    private Integer sysbSrcByh; //清洗排空液位BL11011


    @Unpack(index = 44, length = 2)
    private Integer sysbPremBn; //二级透过液电导率BN28021直排限值


    @Unpack(index = 46, length = 2)
    private Integer sysbChemTempdelay; //二级化洗清洗水温度BT27021高报警延时


    @Unpack(index = 50, length = 2)
    private Integer sysbChemTemp; //二级化洗清洗水温度BT27021高限


    @Unpack(index = 52, length = 2)
    private Integer sysbRunTempl; //二级运行温度BT27021低限


    @Unpack(index = 54, length = 2)
    private Integer sysbRunTempldelay; //二级运行温度BT27021低报警延时


    @Unpack(index = 56, length = 2)
    private Integer sysbRunTemph; //二级运行温度BT27021高限


    @Unpack(index = 60, length = 2)
    private Integer sysbRunTemphdelay; //二级运行温度BT27021高报警延时


    @Unpack(index = 62, length = 2)
    private Integer sysbOutBnh; //二级产水电导率高报警


    @Unpack(index = 64, length = 2)
    private Integer sysbOutBnhdelay; //二级系统透过液电导率高预警_报警延时


    @Unpack(index = 66, length = 2)
    private Integer sysbPremBlldelay; //二级透过液流量低于设定值BF28021报警延时


    @Unpack(index = 68, length = 2)
    private Integer sysbPremBll; //二级透过液流量低于设定值BF28021


    @Unpack(index = 70, length = 2)
    private Integer sysbPremBlhdelay; //二级透过液流量高于设定值BF28021报警延时


    @Unpack(index = 72, length = 2)
    private Integer sysbPremBlh; //二级透过液流量高于设定值BF28021


    @Unpack(index = 74, length = 2)
    private Integer sysbInclosedelay; //二级运行时MV26921全闭报警延时


    @Unpack(index = 76, length = 2)
    private Integer sysbPressH; //二级运行压力上限


    @Unpack(index = 78, length = 2)
    private Integer sysbPremBpdelay; //二级透过液管道压力高BP28011报警延时


    @Unpack(index = 80, length = 2)
    private Integer sysbValveClose; //二级运行停机后时MV26921未全开报警延时


    @Unpack(index = 94, length = 2)
    private Integer cout; //计数


    @Unpack(index = 96, length = 12)
    private String equipmentNo; //设备编码


    @Unpack(index = 108, length = 1)
    private Integer plcComm; //PLC通讯类型

}
