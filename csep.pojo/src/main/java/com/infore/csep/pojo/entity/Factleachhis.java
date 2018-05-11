package com.infore.csep.pojo.entity;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author bzzz
 * @since 2018-04-23
 */
public class Factleachhis extends Model<Factleachhis> {

    private static final long serialVersionUID = 1L;

    private Long id;
    private Integer command;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date revTime;
    private Integer equmSeq;
    private Long equmID;
    private Integer equmType;
    private Integer factNum;
    private String equmNum;
    private Integer dataType;
    private String flagAll;
    private Integer syspInBy;
    private Integer syspSrcBy;
    private Integer syspClnBy;
    private Integer sysaEspBy;
    private Integer sysaPreSandBp;
    private Integer sysaPosSandBp;
    private Integer sysaHpumpPre;
    private Integer sysaHpumpPos;
    private Integer sysaOpumpP;
    private Integer sysaPremBp;
    private Integer sysbHpumpPos;
    private Integer syspSrcBl;
    private Integer syspBufBl;
    private Integer syspClnBl;
    private Integer syspSrcBn;
    private Integer sysaPreSandBn;
    private Integer sysaPremBn;
    private Integer sysaEspBn;
    private Integer sysbPremBn;
    private Integer sysbEspBn;
    private Integer sysaPremBf;
    private Integer sysbPremBf;
    private Integer sysaTemp;
    private Integer sysbTemp;
    private Integer sysaHpumpHz;
    private Integer sysbHpumpHz;
    private Integer syspAcpumpHz;
    private Integer syspAlpumpHz;
    private Integer reservV1;
    private Integer reservV2;
    private Integer reservV3;
    private Integer factRunHour;
    private Integer factOut;
    private Integer factPower;
    private Integer factIn;
    private Integer factSrc;
    private Integer factEsp;
    private Integer factCln;
    private Integer factCod;
    private Integer factNitr;
    private Integer reservV4;
    private Integer reservV5;
    private Integer reservV6;
    private Integer cout;
    private String equipmentNo;
    private Integer plcComm;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCommand() {
        return command;
    }

    public void setCommand(Integer command) {
        this.command = command;
    }

    public Date getRevTime() {
        return revTime;
    }

    public void setRevTime(Date revTime) {
        this.revTime = revTime;
    }

    public Integer getEqumSeq() {
        return equmSeq;
    }

    public void setEqumSeq(Integer equmSeq) {
        this.equmSeq = equmSeq;
    }

    public Long getEqumID() {
        return equmID;
    }

    public void setEqumID(Long equmID) {
        this.equmID = equmID;
    }

    public Integer getEqumType() {
        return equmType;
    }

    public void setEqumType(Integer equmType) {
        this.equmType = equmType;
    }

    public Integer getFactNum() {
        return factNum;
    }

    public void setFactNum(Integer factNum) {
        this.factNum = factNum;
    }

    public String getEqumNum() {
        return equmNum;
    }

    public void setEqumNum(String equmNum) {
        this.equmNum = equmNum;
    }

    public Integer getDataType() {
        return dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public String getFlagAll() {
        return flagAll;
    }

    public void setFlagAll(String flagAll) {
        this.flagAll = flagAll;
    }

    public Integer getSyspInBy() {
        return syspInBy;
    }

    public void setSyspInBy(Integer syspInBy) {
        this.syspInBy = syspInBy;
    }

    public Integer getSyspSrcBy() {
        return syspSrcBy;
    }

    public void setSyspSrcBy(Integer syspSrcBy) {
        this.syspSrcBy = syspSrcBy;
    }

    public Integer getSyspClnBy() {
        return syspClnBy;
    }

    public void setSyspClnBy(Integer syspClnBy) {
        this.syspClnBy = syspClnBy;
    }

    public Integer getSysaEspBy() {
        return sysaEspBy;
    }

    public void setSysaEspBy(Integer sysaEspBy) {
        this.sysaEspBy = sysaEspBy;
    }

    public Integer getSysaPreSandBp() {
        return sysaPreSandBp;
    }

    public void setSysaPreSandBp(Integer sysaPreSandBp) {
        this.sysaPreSandBp = sysaPreSandBp;
    }

    public Integer getSysaPosSandBp() {
        return sysaPosSandBp;
    }

    public void setSysaPosSandBp(Integer sysaPosSandBp) {
        this.sysaPosSandBp = sysaPosSandBp;
    }

    public Integer getSysaHpumpPre() {
        return sysaHpumpPre;
    }

    public void setSysaHpumpPre(Integer sysaHpumpPre) {
        this.sysaHpumpPre = sysaHpumpPre;
    }

    public Integer getSysaHpumpPos() {
        return sysaHpumpPos;
    }

    public void setSysaHpumpPos(Integer sysaHpumpPos) {
        this.sysaHpumpPos = sysaHpumpPos;
    }

    public Integer getSysaOpumpP() {
        return sysaOpumpP;
    }

    public void setSysaOpumpP(Integer sysaOpumpP) {
        this.sysaOpumpP = sysaOpumpP;
    }

    public Integer getSysaPremBp() {
        return sysaPremBp;
    }

    public void setSysaPremBp(Integer sysaPremBp) {
        this.sysaPremBp = sysaPremBp;
    }

    public Integer getSysbHpumpPos() {
        return sysbHpumpPos;
    }

    public void setSysbHpumpPos(Integer sysbHpumpPos) {
        this.sysbHpumpPos = sysbHpumpPos;
    }

    public Integer getSyspSrcBl() {
        return syspSrcBl;
    }

    public void setSyspSrcBl(Integer syspSrcBl) {
        this.syspSrcBl = syspSrcBl;
    }

    public Integer getSyspBufBl() {
        return syspBufBl;
    }

    public void setSyspBufBl(Integer syspBufBl) {
        this.syspBufBl = syspBufBl;
    }

    public Integer getSyspClnBl() {
        return syspClnBl;
    }

    public void setSyspClnBl(Integer syspClnBl) {
        this.syspClnBl = syspClnBl;
    }

    public Integer getSyspSrcBn() {
        return syspSrcBn;
    }

    public void setSyspSrcBn(Integer syspSrcBn) {
        this.syspSrcBn = syspSrcBn;
    }

    public Integer getSysaPreSandBn() {
        return sysaPreSandBn;
    }

    public void setSysaPreSandBn(Integer sysaPreSandBn) {
        this.sysaPreSandBn = sysaPreSandBn;
    }

    public Integer getSysaPremBn() {
        return sysaPremBn;
    }

    public void setSysaPremBn(Integer sysaPremBn) {
        this.sysaPremBn = sysaPremBn;
    }

    public Integer getSysaEspBn() {
        return sysaEspBn;
    }

    public void setSysaEspBn(Integer sysaEspBn) {
        this.sysaEspBn = sysaEspBn;
    }

    public Integer getSysbPremBn() {
        return sysbPremBn;
    }

    public void setSysbPremBn(Integer sysbPremBn) {
        this.sysbPremBn = sysbPremBn;
    }

    public Integer getSysbEspBn() {
        return sysbEspBn;
    }

    public void setSysbEspBn(Integer sysbEspBn) {
        this.sysbEspBn = sysbEspBn;
    }

    public Integer getSysaPremBf() {
        return sysaPremBf;
    }

    public void setSysaPremBf(Integer sysaPremBf) {
        this.sysaPremBf = sysaPremBf;
    }

    public Integer getSysbPremBf() {
        return sysbPremBf;
    }

    public void setSysbPremBf(Integer sysbPremBf) {
        this.sysbPremBf = sysbPremBf;
    }

    public Integer getSysaTemp() {
        return sysaTemp;
    }

    public void setSysaTemp(Integer sysaTemp) {
        this.sysaTemp = sysaTemp;
    }

    public Integer getSysbTemp() {
        return sysbTemp;
    }

    public void setSysbTemp(Integer sysbTemp) {
        this.sysbTemp = sysbTemp;
    }

    public Integer getSysaHpumpHz() {
        return sysaHpumpHz;
    }

    public void setSysaHpumpHz(Integer sysaHpumpHz) {
        this.sysaHpumpHz = sysaHpumpHz;
    }

    public Integer getSysbHpumpHz() {
        return sysbHpumpHz;
    }

    public void setSysbHpumpHz(Integer sysbHpumpHz) {
        this.sysbHpumpHz = sysbHpumpHz;
    }

    public Integer getSyspAcpumpHz() {
        return syspAcpumpHz;
    }

    public void setSyspAcpumpHz(Integer syspAcpumpHz) {
        this.syspAcpumpHz = syspAcpumpHz;
    }

    public Integer getSyspAlpumpHz() {
        return syspAlpumpHz;
    }

    public void setSyspAlpumpHz(Integer syspAlpumpHz) {
        this.syspAlpumpHz = syspAlpumpHz;
    }

    public Integer getReservV1() {
        return reservV1;
    }

    public void setReservV1(Integer reservV1) {
        this.reservV1 = reservV1;
    }

    public Integer getReservV2() {
        return reservV2;
    }

    public void setReservV2(Integer reservV2) {
        this.reservV2 = reservV2;
    }

    public Integer getReservV3() {
        return reservV3;
    }

    public void setReservV3(Integer reservV3) {
        this.reservV3 = reservV3;
    }

    public Integer getFactRunHour() {
        return factRunHour;
    }

    public void setFactRunHour(Integer factRunHour) {
        this.factRunHour = factRunHour;
    }

    public Integer getFactOut() {
        return factOut;
    }

    public void setFactOut(Integer factOut) {
        this.factOut = factOut;
    }

    public Integer getFactPower() {
        return factPower;
    }

    public void setFactPower(Integer factPower) {
        this.factPower = factPower;
    }

    public Integer getFactIn() {
        return factIn;
    }

    public void setFactIn(Integer factIn) {
        this.factIn = factIn;
    }

    public Integer getFactSrc() {
        return factSrc;
    }

    public void setFactSrc(Integer factSrc) {
        this.factSrc = factSrc;
    }

    public Integer getFactEsp() {
        return factEsp;
    }

    public void setFactEsp(Integer factEsp) {
        this.factEsp = factEsp;
    }

    public Integer getFactCln() {
        return factCln;
    }

    public void setFactCln(Integer factCln) {
        this.factCln = factCln;
    }

    public Integer getFactCod() {
        return factCod;
    }

    public void setFactCod(Integer factCod) {
        this.factCod = factCod;
    }

    public Integer getFactNitr() {
        return factNitr;
    }

    public void setFactNitr(Integer factNitr) {
        this.factNitr = factNitr;
    }

    public Integer getReservV4() {
        return reservV4;
    }

    public void setReservV4(Integer reservV4) {
        this.reservV4 = reservV4;
    }

    public Integer getReservV5() {
        return reservV5;
    }

    public void setReservV5(Integer reservV5) {
        this.reservV5 = reservV5;
    }

    public Integer getReservV6() {
        return reservV6;
    }

    public void setReservV6(Integer reservV6) {
        this.reservV6 = reservV6;
    }

    public Integer getCout() {
        return cout;
    }

    public void setCout(Integer cout) {
        this.cout = cout;
    }

    public String getEquipmentNo() {
        return equipmentNo;
    }

    public void setEquipmentNo(String equipmentNo) {
        this.equipmentNo = equipmentNo;
    }

    public Integer getPlcComm() {
        return plcComm;
    }

    public void setPlcComm(Integer plcComm) {
        this.plcComm = plcComm;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Factleachhis{" +
        "id=" + id +
        ", command=" + command +
        ", revTime=" + revTime +
        ", equmSeq=" + equmSeq +
        ", equmID=" + equmID +
        ", equmType=" + equmType +
        ", factNum=" + factNum +
        ", equmNum=" + equmNum +
        ", dataType=" + dataType +
        ", flagAll=" + flagAll +
        ", syspInBy=" + syspInBy +
        ", syspSrcBy=" + syspSrcBy +
        ", syspClnBy=" + syspClnBy +
        ", sysaEspBy=" + sysaEspBy +
        ", sysaPreSandBp=" + sysaPreSandBp +
        ", sysaPosSandBp=" + sysaPosSandBp +
        ", sysaHpumpPre=" + sysaHpumpPre +
        ", sysaHpumpPos=" + sysaHpumpPos +
        ", sysaOpumpP=" + sysaOpumpP +
        ", sysaPremBp=" + sysaPremBp +
        ", sysbHpumpPos=" + sysbHpumpPos +
        ", syspSrcBl=" + syspSrcBl +
        ", syspBufBl=" + syspBufBl +
        ", syspClnBl=" + syspClnBl +
        ", syspSrcBn=" + syspSrcBn +
        ", sysaPreSandBn=" + sysaPreSandBn +
        ", sysaPremBn=" + sysaPremBn +
        ", sysaEspBn=" + sysaEspBn +
        ", sysbPremBn=" + sysbPremBn +
        ", sysbEspBn=" + sysbEspBn +
        ", sysaPremBf=" + sysaPremBf +
        ", sysbPremBf=" + sysbPremBf +
        ", sysaTemp=" + sysaTemp +
        ", sysbTemp=" + sysbTemp +
        ", sysaHpumpHz=" + sysaHpumpHz +
        ", sysbHpumpHz=" + sysbHpumpHz +
        ", syspAcpumpHz=" + syspAcpumpHz +
        ", syspAlpumpHz=" + syspAlpumpHz +
        ", reservV1=" + reservV1 +
        ", reservV2=" + reservV2 +
        ", reservV3=" + reservV3 +
        ", factRunHour=" + factRunHour +
        ", factOut=" + factOut +
        ", factPower=" + factPower +
        ", factIn=" + factIn +
        ", factSrc=" + factSrc +
        ", factEsp=" + factEsp +
        ", factCln=" + factCln +
        ", factCod=" + factCod +
        ", factNitr=" + factNitr +
        ", reservV4=" + reservV4 +
        ", reservV5=" + reservV5 +
        ", reservV6=" + reservV6 +
        ", cout=" + cout +
        ", equipmentNo=" + equipmentNo +
        ", plcComm=" + plcComm +
        "}";
    }
}
