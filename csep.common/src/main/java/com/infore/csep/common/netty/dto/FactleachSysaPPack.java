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
public class FactleachSysaPPack extends FactleachBasePack {

    @Unpack(index = 10, length = 2)
    private Integer sysaTempl; //一级运行温度低限BT17021


    @Unpack(index = 12, length = 2)
    private Integer sysaTempldelay; //一级运行温度低BT17021报警延时


    @Unpack(index = 14, length = 2)
    private Integer sysaTemph; //一级运行温度高限BT17021


    @Unpack(index = 16, length = 2)
    private Integer sysaTemphdelay; //一级运行温度高BT17021报警延时


    @Unpack(index = 18, length = 2)
    private Integer sysaPressh; //一级运行压力上限BP16011


    @Unpack(index = 20, length = 2)
    private Integer sysaPremBnhdelay; //一级透过液电导率高BN18021报警延时


    @Unpack(index = 22, length = 2)
    private Integer sysaPremBnh; //一级透过液电导率高限BN18021


    @Unpack(index = 24, length = 2)
    private Integer sysaPremBfldelay; //一级透过液流量低于设定值BF18021报警延时


    @Unpack(index = 26, length = 2)
    private Integer sysaPremBfl; //一级透过液流量低于设定值BF18021


    @Unpack(index = 28, length = 2)
    private Integer sysaPremBfh; //一级透过液流量高于设定值BF18021报警延时


    @Unpack(index = 32, length = 2)
    private Integer sysaPremBfhdelay; //一级透过液流量高于设定值BF18021


    @Unpack(index = 34, length = 2)
    private Integer sysaSandBnh; //砂滤进水电导率高限BN13021


    @Unpack(index = 38, length = 2)
    private Integer sysaSandBlldelay; //砂滤前流量BL13011低报警延时


    @Unpack(index = 40, length = 2)
    private Integer sysaSandPreBph; //砂滤前压力高限BP13011


    @Unpack(index = 44, length = 2)
    private Integer sysaSandBphdelay; //一级砂滤压差高BP13011_BP14011报警延时


    @Unpack(index = 46, length = 2)
    private Integer sysaSandBph; //一级砂滤压差高限BP13011_BP14011


    @Unpack(index = 50, length = 2)
    private Integer sysaHpumpPrebpl; //一级高压泵前压力低限BP15011


    @Unpack(index = 52, length = 2)
    private Integer sysaFiltBph; //一级芯滤压差高限BP14011_BP15011


    @Unpack(index = 54, length = 2)
    private Integer sysaFiltBphdelay; //一级芯滤压差高BP14011_BP15011报警延时


    @Unpack(index = 56, length = 2)
    private Integer sysaColBphdelay; //一级模柱压差高BP16111_BP16011报警延时


    @Unpack(index = 60, length = 2)
    private Integer sysaColBph; //一级模柱压差高限BP16111_BP16011


    @Unpack(index = 62, length = 2)
    private Integer sysaChemByl; //一级化洗一级浓缩液PH值低限BY17021


    @Unpack(index = 64, length = 2)
    private Integer sysaChemByldelay; //一级化洗一级浓缩液PH值低BY17021报警延时


    @Unpack(index = 66, length = 2)
    private Integer sysaChemByh; //一级化洗一级浓缩液PH值高限BY17021


    @Unpack(index = 68, length = 2)
    private Integer sysaChemByhdelay; //一级化洗一级浓缩液PH值高BY17021报警延时


    @Unpack(index = 70, length = 2)
    private Integer sysaEspByl; //一级运行一级浓缩液PH值低限BY17021


    @Unpack(index = 72, length = 2)
    private Integer sysaEspByldelay; //一级运行一级浓缩液PH值低BY17021报警延时


    @Unpack(index = 74, length = 2)
    private Integer sysaEspByh; //一级运行一级浓缩液PH值高限BY17021


    @Unpack(index = 76, length = 2)
    private Integer sysaEspByhdelay; //一级运行一级浓缩液PH值高BY17021报警延时


    @Unpack(index = 78, length = 2)
    private Integer sysaChemBll; //一级化洗清洗罐液位低限BL11011


    @Unpack(index = 80, length = 2)
    private Integer sysaChemBlldelay; //一级化洗清洗罐液位低BL11011报警延时


    @Unpack(index = 82, length = 2)
    private Integer sysaChemBlh; //清洗罐液位高限BL11011


    @Unpack(index = 84, length = 2)
    private Integer sysaChemBthdelay; //一级化洗清洗水温度BT17021高报警延时


    @Unpack(index = 86, length = 2)
    private Integer sysaChemBth; //一级清洗时水温度高限BT17021


    @Unpack(index = 88, length = 2)
    private Integer sysaPremBphdelay; //一级透过液管道压力高BP18011报警延时


    @Unpack(index = 90, length = 2)
    private Integer sysaPremBph; //一级透过液管道压力高限BP18011


    @Unpack(index = 92, length = 2)
    private Integer sysaValveClose; //一级运行时MV16921全闭报警延时


    @Unpack(index = 94, length = 2)
    private Integer sysaHpumpsdelay; //一级高压泵M16011启动延时


    @Unpack(index = 96, length = 2)
    private Integer sysaHpumpedelay; //一级高压泵M16011停止延时


    @Unpack(index = 98, length = 2)
    private Integer sysaHpumpsBpl; //一级高压泵启动前压力BP15011最低值


    @Unpack(index = 100, length = 2)
    private Integer sysaChemimmtime; //一级化洗浸泡时间


    @Unpack(index = 102, length = 2)
    private Integer sysaChemrec; //一级化洗循环清洗时间


    @Unpack(index = 104, length = 2)
    private Integer sysaChemTime; //一级化洗总时间


    @Unpack(index = 106, length = 2)
    private Integer sysaStaticTime; //静置时间


    @Unpack(index = 108, length = 2)
    private Integer sysaAirwTime; //空气反洗时间


    @Unpack(index = 110, length = 2)
    private Integer sysaValveSetdelay; //MV16921调节延时


    @Unpack(index = 112, length = 2)
    private Integer sysaValvedelay; //PV16921关闭延时


    @Unpack(index = 114, length = 2)
    private Integer sysaWashtime; //清水冲洗时间


    @Unpack(index = 116, length = 2)
    private Integer sysaWashBlh; //一级清洗排空液位BL11011


    @Unpack(index = 118, length = 2)
    private Integer sysaWashBll; //一级清洗液位BL11011


    @Unpack(index = 120, length = 2)
    private Integer sysaPremBf; //一级透过液流量设定值BF18021


    @Unpack(index = 122, length = 2)
    private Integer sysaHpumpdelay; //一级系统高压泵M16011化洗启动延时


    @Unpack(index = 124, length = 2)
    private Integer sysaChemPTime; //一级系统清洗剂添加时间


    @Unpack(index = 126, length = 2)
    private Integer sysaSrcrewTime; //一级系统原水反洗时间


    @Unpack(index = 128, length = 2)
    private Integer sysaSrcwTime; //一级系统原水正洗时间


    @Unpack(index = 130, length = 2)
    private Integer sysaSrcwdelay; //原水冲洗延时


    @Unpack(index = 132, length = 2)
    private Integer sysaChemdelay; //在线泵M16111化洗启动延时


    @Unpack(index = 134, length = 2)
    private Integer sysaOpumpdelay; //在线泵M16111启动延时


    @Unpack(index = 136, length = 2)
    private Integer sysaPremBn; //一级透过液电导率BN18021直排限值


    @Unpack(index = 138, length = 2)
    private Integer sysaPpumpsdelay; //预增压泵M13011启动延时


    @Unpack(index = 140, length = 2)
    private Integer sysaPpumpedalay; //预增压泵M13011停止延时


    @Unpack(index = 154, length = 2)
    private Integer cout; //计数


    @Unpack(index = 156, length = 12)
    private String equipmentNo; //设备编码


    @Unpack(index = 168, length = 1)
    private Integer plcComm; //PLC通讯类型

}
