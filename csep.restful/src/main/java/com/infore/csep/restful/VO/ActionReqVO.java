package com.infore.csep.restful.VO;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Created by steven ma
 * 2018/4/9 15:29
 */

@Data
public class ActionReqVO {

    //流水号
    @NotBlank(message = "流水号 {constraint.sid.not.empty}")
    //@Size(min=6, max=6, message="密码长度应为{min} - {max}位")
    private String sid;

    //设备编号(网关)
    @NotBlank(message = "设备编号(网关) {constraint.clientId.not.empty}")
    private String clientId;

    //控制指令
    @NotBlank(message = "设备编号(网关) {constraint.clientId.not.empty}")
    private String command;

    //PLC IP地址
    @NotBlank(message = "设PLC IP地址 {constraint.clientId.not.empty}")
    private String plcIP;

    //PLC寄存器地址
    @NotBlank(message = "PLC寄存器地址 {constraint.clientId.not.empty}")
    private String plcAdress;

    //命令内容
    @NotBlank(message = "命令内容 {constraint.clientId.not.empty}")
    private String value;

    //设备类型
    @NotBlank(message = "设备类型 {constraint.clientId.not.empty}")
    private String equmType;

    //平台类型： GPS=gps 厂站=fact
    @NotBlank(message = "平台类型 {constraint.clientId.not.empty}")
    private String platformType;
}
