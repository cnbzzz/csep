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
public class Factsewa extends Model<Factsewa> {

    private static final long serialVersionUID = 1L;

    private Long id;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date revTime;
    private Integer equmType;
    private Integer factNum;
    private String equmNum;
    private Integer dataType;
    private Integer valCod;
    private Integer valNitr;
    private Integer valNih;
    private Integer valPho;
    private Integer valOutss;
    private Integer valOutBy;
    private Integer valOutTemp;
    private Integer valRuntime;
    private Integer valSrc;
    private Integer valPowpt;
    private Integer valPower;
    private Integer valMBR1;
    private Integer valMBR2;
    private Integer valMBR3;
    private Integer valMBR4;
    private Integer valMBR5;
    private Integer valMBR6;
    private Integer valMBR7;
    private Integer valMBR8;
    private Integer valMBR9;
    private Integer valMBR10;
    private Integer valMBRsum1;
    private Integer valMBRsum2;
    private Integer valMBRsum3;
    private Integer valMBRsum4;
    private Integer valMBRsum5;
    private Integer valMBRsum6;
    private Integer valMBRsum7;
    private Integer valMBRsum8;
    private Integer valMBRsum9;
    private Integer valMBRsum10;
    private String allFlag;
    private Integer valInBL;
    private Integer valPoolBL;
    private Integer valSandBL;
    private Integer valSdgBL;
    private Integer setSubPumpHZ1;
    private Integer setSubPumpHZ2;
    private Integer setSubPumpHZ3;
    private Integer setAcHZ;
    private Integer setAlHZ;
    private Integer setReclnSdelay1;
    private Integer setReclnEdelay1;
    private Integer setReclnR1;
    private Integer setReclnSdelay2;
    private Integer setReclnEdelay2;
    private Integer setReclnR2;
    private Integer setPiPumpSdelay1;
    private Integer setPiPumpEdelay1;
    private Integer setPiPumpR1;
    private Integer setPiPumpSdelay2;
    private Integer setPiPumpEdelay2;
    private Integer setPiPumpR2;
    private Integer setConvSdelay;
    private Integer setConvEdelay;
    private Integer setConvR;
    private Integer setSplSdelay;
    private Integer setSplEdelay;
    private Integer setSplR;
    private Integer setAgitSdelay;
    private Integer setAgitEdelay;
    private Integer setAgitR;
    private Integer setSdgPumpSdelay;
    private Integer setSdgPumpEdelay;
    private Integer setSdgPumpR;
    private Integer setSubPumpSdelay1;
    private Integer setSubPumpEdelay1;
    private Integer setSubPumpR1;
    private Integer setSubPumpSdelay2;
    private Integer setSubPumpEdelay2;
    private Integer setSubPumpR2;
    private Integer setSubPumpSdelay3;
    private Integer setSubPumpEdelay3;
    private Integer setSubPumpR;
    private Integer setFltSdelay;
    private Integer setFltEdelay;
    private Integer setFltR;
    private Integer setRwPumpSdelay;
    private Integer setRwPumpEdelay;
    private Integer setRwPumpR;
    private Integer setAcPumpSdelay;
    private Integer setAcPumpEdelay;
    private Integer setAcpumpR;
    private Integer setAlPumpSdelay;
    private Integer setAlPumpEdelay;
    private Integer setAlPumpR;
    private Integer setPACagSdelay;
    private Integer setPACagEdelay;
    private Integer setPACagR;
    private Integer setPACpSdelay;
    private Integer setPACpEdelay;
    private Integer setPACpR;
    private Integer setRwQSdelay1;
    private Integer setRwQEdelay1;
    private Integer setRwQR1;
    private Integer setRwQSdelay2;
    private Integer setRwQEdelay2;
    private Integer setRwQR2;
    private Integer setRwQSdelay3;
    private Integer setRwQEdelay3;
    private Integer setRwQR3;
    private Integer setRwInQSdelay;
    private Integer setRwInQEdelay;
    private Integer setRwInR;
    private Integer setPACInQSdelay;
    private Integer setPACInQEdelay;
    private Integer setPACInQR;
    private Integer setInBLH;
    private Integer setINBLL;
    private Integer setPoolBLH;
    private Integer setPoolBLL;
    private Integer setSandBLH;
    private Integer SetSandBLL;
    private Integer setSdgBLH;
    private Integer setSdgBLL;
    private Integer count;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getRevTime() {
        return revTime;
    }

    public void setRevTime(Date revTime) {
        this.revTime = revTime;
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

    public Integer getValCod() {
        return valCod;
    }

    public void setValCod(Integer valCod) {
        this.valCod = valCod;
    }

    public Integer getValNitr() {
        return valNitr;
    }

    public void setValNitr(Integer valNitr) {
        this.valNitr = valNitr;
    }

    public Integer getValNih() {
        return valNih;
    }

    public void setValNih(Integer valNih) {
        this.valNih = valNih;
    }

    public Integer getValPho() {
        return valPho;
    }

    public void setValPho(Integer valPho) {
        this.valPho = valPho;
    }

    public Integer getValOutss() {
        return valOutss;
    }

    public void setValOutss(Integer valOutss) {
        this.valOutss = valOutss;
    }

    public Integer getValOutBy() {
        return valOutBy;
    }

    public void setValOutBy(Integer valOutBy) {
        this.valOutBy = valOutBy;
    }

    public Integer getValOutTemp() {
        return valOutTemp;
    }

    public void setValOutTemp(Integer valOutTemp) {
        this.valOutTemp = valOutTemp;
    }

    public Integer getValRuntime() {
        return valRuntime;
    }

    public void setValRuntime(Integer valRuntime) {
        this.valRuntime = valRuntime;
    }

    public Integer getValSrc() {
        return valSrc;
    }

    public void setValSrc(Integer valSrc) {
        this.valSrc = valSrc;
    }

    public Integer getValPowpt() {
        return valPowpt;
    }

    public void setValPowpt(Integer valPowpt) {
        this.valPowpt = valPowpt;
    }

    public Integer getValPower() {
        return valPower;
    }

    public void setValPower(Integer valPower) {
        this.valPower = valPower;
    }

    public Integer getValMBR1() {
        return valMBR1;
    }

    public void setValMBR1(Integer valMBR1) {
        this.valMBR1 = valMBR1;
    }

    public Integer getValMBR2() {
        return valMBR2;
    }

    public void setValMBR2(Integer valMBR2) {
        this.valMBR2 = valMBR2;
    }

    public Integer getValMBR3() {
        return valMBR3;
    }

    public void setValMBR3(Integer valMBR3) {
        this.valMBR3 = valMBR3;
    }

    public Integer getValMBR4() {
        return valMBR4;
    }

    public void setValMBR4(Integer valMBR4) {
        this.valMBR4 = valMBR4;
    }

    public Integer getValMBR5() {
        return valMBR5;
    }

    public void setValMBR5(Integer valMBR5) {
        this.valMBR5 = valMBR5;
    }

    public Integer getValMBR6() {
        return valMBR6;
    }

    public void setValMBR6(Integer valMBR6) {
        this.valMBR6 = valMBR6;
    }

    public Integer getValMBR7() {
        return valMBR7;
    }

    public void setValMBR7(Integer valMBR7) {
        this.valMBR7 = valMBR7;
    }

    public Integer getValMBR8() {
        return valMBR8;
    }

    public void setValMBR8(Integer valMBR8) {
        this.valMBR8 = valMBR8;
    }

    public Integer getValMBR9() {
        return valMBR9;
    }

    public void setValMBR9(Integer valMBR9) {
        this.valMBR9 = valMBR9;
    }

    public Integer getValMBR10() {
        return valMBR10;
    }

    public void setValMBR10(Integer valMBR10) {
        this.valMBR10 = valMBR10;
    }

    public Integer getValMBRsum1() {
        return valMBRsum1;
    }

    public void setValMBRsum1(Integer valMBRsum1) {
        this.valMBRsum1 = valMBRsum1;
    }

    public Integer getValMBRsum2() {
        return valMBRsum2;
    }

    public void setValMBRsum2(Integer valMBRsum2) {
        this.valMBRsum2 = valMBRsum2;
    }

    public Integer getValMBRsum3() {
        return valMBRsum3;
    }

    public void setValMBRsum3(Integer valMBRsum3) {
        this.valMBRsum3 = valMBRsum3;
    }

    public Integer getValMBRsum4() {
        return valMBRsum4;
    }

    public void setValMBRsum4(Integer valMBRsum4) {
        this.valMBRsum4 = valMBRsum4;
    }

    public Integer getValMBRsum5() {
        return valMBRsum5;
    }

    public void setValMBRsum5(Integer valMBRsum5) {
        this.valMBRsum5 = valMBRsum5;
    }

    public Integer getValMBRsum6() {
        return valMBRsum6;
    }

    public void setValMBRsum6(Integer valMBRsum6) {
        this.valMBRsum6 = valMBRsum6;
    }

    public Integer getValMBRsum7() {
        return valMBRsum7;
    }

    public void setValMBRsum7(Integer valMBRsum7) {
        this.valMBRsum7 = valMBRsum7;
    }

    public Integer getValMBRsum8() {
        return valMBRsum8;
    }

    public void setValMBRsum8(Integer valMBRsum8) {
        this.valMBRsum8 = valMBRsum8;
    }

    public Integer getValMBRsum9() {
        return valMBRsum9;
    }

    public void setValMBRsum9(Integer valMBRsum9) {
        this.valMBRsum9 = valMBRsum9;
    }

    public Integer getValMBRsum10() {
        return valMBRsum10;
    }

    public void setValMBRsum10(Integer valMBRsum10) {
        this.valMBRsum10 = valMBRsum10;
    }

    public String getAllFlag() {
        return allFlag;
    }

    public void setAllFlag(String allFlag) {
        this.allFlag = allFlag;
    }

    public Integer getValInBL() {
        return valInBL;
    }

    public void setValInBL(Integer valInBL) {
        this.valInBL = valInBL;
    }

    public Integer getValPoolBL() {
        return valPoolBL;
    }

    public void setValPoolBL(Integer valPoolBL) {
        this.valPoolBL = valPoolBL;
    }

    public Integer getValSandBL() {
        return valSandBL;
    }

    public void setValSandBL(Integer valSandBL) {
        this.valSandBL = valSandBL;
    }

    public Integer getValSdgBL() {
        return valSdgBL;
    }

    public void setValSdgBL(Integer valSdgBL) {
        this.valSdgBL = valSdgBL;
    }

    public Integer getSetSubPumpHZ1() {
        return setSubPumpHZ1;
    }

    public void setSetSubPumpHZ1(Integer setSubPumpHZ1) {
        this.setSubPumpHZ1 = setSubPumpHZ1;
    }

    public Integer getSetSubPumpHZ2() {
        return setSubPumpHZ2;
    }

    public void setSetSubPumpHZ2(Integer setSubPumpHZ2) {
        this.setSubPumpHZ2 = setSubPumpHZ2;
    }

    public Integer getSetSubPumpHZ3() {
        return setSubPumpHZ3;
    }

    public void setSetSubPumpHZ3(Integer setSubPumpHZ3) {
        this.setSubPumpHZ3 = setSubPumpHZ3;
    }

    public Integer getSetAcHZ() {
        return setAcHZ;
    }

    public void setSetAcHZ(Integer setAcHZ) {
        this.setAcHZ = setAcHZ;
    }

    public Integer getSetAlHZ() {
        return setAlHZ;
    }

    public void setSetAlHZ(Integer setAlHZ) {
        this.setAlHZ = setAlHZ;
    }

    public Integer getSetReclnSdelay1() {
        return setReclnSdelay1;
    }

    public void setSetReclnSdelay1(Integer setReclnSdelay1) {
        this.setReclnSdelay1 = setReclnSdelay1;
    }

    public Integer getSetReclnEdelay1() {
        return setReclnEdelay1;
    }

    public void setSetReclnEdelay1(Integer setReclnEdelay1) {
        this.setReclnEdelay1 = setReclnEdelay1;
    }

    public Integer getSetReclnR1() {
        return setReclnR1;
    }

    public void setSetReclnR1(Integer setReclnR1) {
        this.setReclnR1 = setReclnR1;
    }

    public Integer getSetReclnSdelay2() {
        return setReclnSdelay2;
    }

    public void setSetReclnSdelay2(Integer setReclnSdelay2) {
        this.setReclnSdelay2 = setReclnSdelay2;
    }

    public Integer getSetReclnEdelay2() {
        return setReclnEdelay2;
    }

    public void setSetReclnEdelay2(Integer setReclnEdelay2) {
        this.setReclnEdelay2 = setReclnEdelay2;
    }

    public Integer getSetReclnR2() {
        return setReclnR2;
    }

    public void setSetReclnR2(Integer setReclnR2) {
        this.setReclnR2 = setReclnR2;
    }

    public Integer getSetPiPumpSdelay1() {
        return setPiPumpSdelay1;
    }

    public void setSetPiPumpSdelay1(Integer setPiPumpSdelay1) {
        this.setPiPumpSdelay1 = setPiPumpSdelay1;
    }

    public Integer getSetPiPumpEdelay1() {
        return setPiPumpEdelay1;
    }

    public void setSetPiPumpEdelay1(Integer setPiPumpEdelay1) {
        this.setPiPumpEdelay1 = setPiPumpEdelay1;
    }

    public Integer getSetPiPumpR1() {
        return setPiPumpR1;
    }

    public void setSetPiPumpR1(Integer setPiPumpR1) {
        this.setPiPumpR1 = setPiPumpR1;
    }

    public Integer getSetPiPumpSdelay2() {
        return setPiPumpSdelay2;
    }

    public void setSetPiPumpSdelay2(Integer setPiPumpSdelay2) {
        this.setPiPumpSdelay2 = setPiPumpSdelay2;
    }

    public Integer getSetPiPumpEdelay2() {
        return setPiPumpEdelay2;
    }

    public void setSetPiPumpEdelay2(Integer setPiPumpEdelay2) {
        this.setPiPumpEdelay2 = setPiPumpEdelay2;
    }

    public Integer getSetPiPumpR2() {
        return setPiPumpR2;
    }

    public void setSetPiPumpR2(Integer setPiPumpR2) {
        this.setPiPumpR2 = setPiPumpR2;
    }

    public Integer getSetConvSdelay() {
        return setConvSdelay;
    }

    public void setSetConvSdelay(Integer setConvSdelay) {
        this.setConvSdelay = setConvSdelay;
    }

    public Integer getSetConvEdelay() {
        return setConvEdelay;
    }

    public void setSetConvEdelay(Integer setConvEdelay) {
        this.setConvEdelay = setConvEdelay;
    }

    public Integer getSetConvR() {
        return setConvR;
    }

    public void setSetConvR(Integer setConvR) {
        this.setConvR = setConvR;
    }

    public Integer getSetSplSdelay() {
        return setSplSdelay;
    }

    public void setSetSplSdelay(Integer setSplSdelay) {
        this.setSplSdelay = setSplSdelay;
    }

    public Integer getSetSplEdelay() {
        return setSplEdelay;
    }

    public void setSetSplEdelay(Integer setSplEdelay) {
        this.setSplEdelay = setSplEdelay;
    }

    public Integer getSetSplR() {
        return setSplR;
    }

    public void setSetSplR(Integer setSplR) {
        this.setSplR = setSplR;
    }

    public Integer getSetAgitSdelay() {
        return setAgitSdelay;
    }

    public void setSetAgitSdelay(Integer setAgitSdelay) {
        this.setAgitSdelay = setAgitSdelay;
    }

    public Integer getSetAgitEdelay() {
        return setAgitEdelay;
    }

    public void setSetAgitEdelay(Integer setAgitEdelay) {
        this.setAgitEdelay = setAgitEdelay;
    }

    public Integer getSetAgitR() {
        return setAgitR;
    }

    public void setSetAgitR(Integer setAgitR) {
        this.setAgitR = setAgitR;
    }

    public Integer getSetSdgPumpSdelay() {
        return setSdgPumpSdelay;
    }

    public void setSetSdgPumpSdelay(Integer setSdgPumpSdelay) {
        this.setSdgPumpSdelay = setSdgPumpSdelay;
    }

    public Integer getSetSdgPumpEdelay() {
        return setSdgPumpEdelay;
    }

    public void setSetSdgPumpEdelay(Integer setSdgPumpEdelay) {
        this.setSdgPumpEdelay = setSdgPumpEdelay;
    }

    public Integer getSetSdgPumpR() {
        return setSdgPumpR;
    }

    public void setSetSdgPumpR(Integer setSdgPumpR) {
        this.setSdgPumpR = setSdgPumpR;
    }

    public Integer getSetSubPumpSdelay1() {
        return setSubPumpSdelay1;
    }

    public void setSetSubPumpSdelay1(Integer setSubPumpSdelay1) {
        this.setSubPumpSdelay1 = setSubPumpSdelay1;
    }

    public Integer getSetSubPumpEdelay1() {
        return setSubPumpEdelay1;
    }

    public void setSetSubPumpEdelay1(Integer setSubPumpEdelay1) {
        this.setSubPumpEdelay1 = setSubPumpEdelay1;
    }

    public Integer getSetSubPumpR1() {
        return setSubPumpR1;
    }

    public void setSetSubPumpR1(Integer setSubPumpR1) {
        this.setSubPumpR1 = setSubPumpR1;
    }

    public Integer getSetSubPumpSdelay2() {
        return setSubPumpSdelay2;
    }

    public void setSetSubPumpSdelay2(Integer setSubPumpSdelay2) {
        this.setSubPumpSdelay2 = setSubPumpSdelay2;
    }

    public Integer getSetSubPumpEdelay2() {
        return setSubPumpEdelay2;
    }

    public void setSetSubPumpEdelay2(Integer setSubPumpEdelay2) {
        this.setSubPumpEdelay2 = setSubPumpEdelay2;
    }

    public Integer getSetSubPumpR2() {
        return setSubPumpR2;
    }

    public void setSetSubPumpR2(Integer setSubPumpR2) {
        this.setSubPumpR2 = setSubPumpR2;
    }

    public Integer getSetSubPumpSdelay3() {
        return setSubPumpSdelay3;
    }

    public void setSetSubPumpSdelay3(Integer setSubPumpSdelay3) {
        this.setSubPumpSdelay3 = setSubPumpSdelay3;
    }

    public Integer getSetSubPumpEdelay3() {
        return setSubPumpEdelay3;
    }

    public void setSetSubPumpEdelay3(Integer setSubPumpEdelay3) {
        this.setSubPumpEdelay3 = setSubPumpEdelay3;
    }

    public Integer getSetSubPumpR() {
        return setSubPumpR;
    }

    public void setSetSubPumpR(Integer setSubPumpR) {
        this.setSubPumpR = setSubPumpR;
    }

    public Integer getSetFltSdelay() {
        return setFltSdelay;
    }

    public void setSetFltSdelay(Integer setFltSdelay) {
        this.setFltSdelay = setFltSdelay;
    }

    public Integer getSetFltEdelay() {
        return setFltEdelay;
    }

    public void setSetFltEdelay(Integer setFltEdelay) {
        this.setFltEdelay = setFltEdelay;
    }

    public Integer getSetFltR() {
        return setFltR;
    }

    public void setSetFltR(Integer setFltR) {
        this.setFltR = setFltR;
    }

    public Integer getSetRwPumpSdelay() {
        return setRwPumpSdelay;
    }

    public void setSetRwPumpSdelay(Integer setRwPumpSdelay) {
        this.setRwPumpSdelay = setRwPumpSdelay;
    }

    public Integer getSetRwPumpEdelay() {
        return setRwPumpEdelay;
    }

    public void setSetRwPumpEdelay(Integer setRwPumpEdelay) {
        this.setRwPumpEdelay = setRwPumpEdelay;
    }

    public Integer getSetRwPumpR() {
        return setRwPumpR;
    }

    public void setSetRwPumpR(Integer setRwPumpR) {
        this.setRwPumpR = setRwPumpR;
    }

    public Integer getSetAcPumpSdelay() {
        return setAcPumpSdelay;
    }

    public void setSetAcPumpSdelay(Integer setAcPumpSdelay) {
        this.setAcPumpSdelay = setAcPumpSdelay;
    }

    public Integer getSetAcPumpEdelay() {
        return setAcPumpEdelay;
    }

    public void setSetAcPumpEdelay(Integer setAcPumpEdelay) {
        this.setAcPumpEdelay = setAcPumpEdelay;
    }

    public Integer getSetAcpumpR() {
        return setAcpumpR;
    }

    public void setSetAcpumpR(Integer setAcpumpR) {
        this.setAcpumpR = setAcpumpR;
    }

    public Integer getSetAlPumpSdelay() {
        return setAlPumpSdelay;
    }

    public void setSetAlPumpSdelay(Integer setAlPumpSdelay) {
        this.setAlPumpSdelay = setAlPumpSdelay;
    }

    public Integer getSetAlPumpEdelay() {
        return setAlPumpEdelay;
    }

    public void setSetAlPumpEdelay(Integer setAlPumpEdelay) {
        this.setAlPumpEdelay = setAlPumpEdelay;
    }

    public Integer getSetAlPumpR() {
        return setAlPumpR;
    }

    public void setSetAlPumpR(Integer setAlPumpR) {
        this.setAlPumpR = setAlPumpR;
    }

    public Integer getSetPACagSdelay() {
        return setPACagSdelay;
    }

    public void setSetPACagSdelay(Integer setPACagSdelay) {
        this.setPACagSdelay = setPACagSdelay;
    }

    public Integer getSetPACagEdelay() {
        return setPACagEdelay;
    }

    public void setSetPACagEdelay(Integer setPACagEdelay) {
        this.setPACagEdelay = setPACagEdelay;
    }

    public Integer getSetPACagR() {
        return setPACagR;
    }

    public void setSetPACagR(Integer setPACagR) {
        this.setPACagR = setPACagR;
    }

    public Integer getSetPACpSdelay() {
        return setPACpSdelay;
    }

    public void setSetPACpSdelay(Integer setPACpSdelay) {
        this.setPACpSdelay = setPACpSdelay;
    }

    public Integer getSetPACpEdelay() {
        return setPACpEdelay;
    }

    public void setSetPACpEdelay(Integer setPACpEdelay) {
        this.setPACpEdelay = setPACpEdelay;
    }

    public Integer getSetPACpR() {
        return setPACpR;
    }

    public void setSetPACpR(Integer setPACpR) {
        this.setPACpR = setPACpR;
    }

    public Integer getSetRwQSdelay1() {
        return setRwQSdelay1;
    }

    public void setSetRwQSdelay1(Integer setRwQSdelay1) {
        this.setRwQSdelay1 = setRwQSdelay1;
    }

    public Integer getSetRwQEdelay1() {
        return setRwQEdelay1;
    }

    public void setSetRwQEdelay1(Integer setRwQEdelay1) {
        this.setRwQEdelay1 = setRwQEdelay1;
    }

    public Integer getSetRwQR1() {
        return setRwQR1;
    }

    public void setSetRwQR1(Integer setRwQR1) {
        this.setRwQR1 = setRwQR1;
    }

    public Integer getSetRwQSdelay2() {
        return setRwQSdelay2;
    }

    public void setSetRwQSdelay2(Integer setRwQSdelay2) {
        this.setRwQSdelay2 = setRwQSdelay2;
    }

    public Integer getSetRwQEdelay2() {
        return setRwQEdelay2;
    }

    public void setSetRwQEdelay2(Integer setRwQEdelay2) {
        this.setRwQEdelay2 = setRwQEdelay2;
    }

    public Integer getSetRwQR2() {
        return setRwQR2;
    }

    public void setSetRwQR2(Integer setRwQR2) {
        this.setRwQR2 = setRwQR2;
    }

    public Integer getSetRwQSdelay3() {
        return setRwQSdelay3;
    }

    public void setSetRwQSdelay3(Integer setRwQSdelay3) {
        this.setRwQSdelay3 = setRwQSdelay3;
    }

    public Integer getSetRwQEdelay3() {
        return setRwQEdelay3;
    }

    public void setSetRwQEdelay3(Integer setRwQEdelay3) {
        this.setRwQEdelay3 = setRwQEdelay3;
    }

    public Integer getSetRwQR3() {
        return setRwQR3;
    }

    public void setSetRwQR3(Integer setRwQR3) {
        this.setRwQR3 = setRwQR3;
    }

    public Integer getSetRwInQSdelay() {
        return setRwInQSdelay;
    }

    public void setSetRwInQSdelay(Integer setRwInQSdelay) {
        this.setRwInQSdelay = setRwInQSdelay;
    }

    public Integer getSetRwInQEdelay() {
        return setRwInQEdelay;
    }

    public void setSetRwInQEdelay(Integer setRwInQEdelay) {
        this.setRwInQEdelay = setRwInQEdelay;
    }

    public Integer getSetRwInR() {
        return setRwInR;
    }

    public void setSetRwInR(Integer setRwInR) {
        this.setRwInR = setRwInR;
    }

    public Integer getSetPACInQSdelay() {
        return setPACInQSdelay;
    }

    public void setSetPACInQSdelay(Integer setPACInQSdelay) {
        this.setPACInQSdelay = setPACInQSdelay;
    }

    public Integer getSetPACInQEdelay() {
        return setPACInQEdelay;
    }

    public void setSetPACInQEdelay(Integer setPACInQEdelay) {
        this.setPACInQEdelay = setPACInQEdelay;
    }

    public Integer getSetPACInQR() {
        return setPACInQR;
    }

    public void setSetPACInQR(Integer setPACInQR) {
        this.setPACInQR = setPACInQR;
    }

    public Integer getSetInBLH() {
        return setInBLH;
    }

    public void setSetInBLH(Integer setInBLH) {
        this.setInBLH = setInBLH;
    }

    public Integer getSetINBLL() {
        return setINBLL;
    }

    public void setSetINBLL(Integer setINBLL) {
        this.setINBLL = setINBLL;
    }

    public Integer getSetPoolBLH() {
        return setPoolBLH;
    }

    public void setSetPoolBLH(Integer setPoolBLH) {
        this.setPoolBLH = setPoolBLH;
    }

    public Integer getSetPoolBLL() {
        return setPoolBLL;
    }

    public void setSetPoolBLL(Integer setPoolBLL) {
        this.setPoolBLL = setPoolBLL;
    }

    public Integer getSetSandBLH() {
        return setSandBLH;
    }

    public void setSetSandBLH(Integer setSandBLH) {
        this.setSandBLH = setSandBLH;
    }

    public Integer getSetSandBLL() {
        return SetSandBLL;
    }

    public void setSetSandBLL(Integer SetSandBLL) {
        this.SetSandBLL = SetSandBLL;
    }

    public Integer getSetSdgBLH() {
        return setSdgBLH;
    }

    public void setSetSdgBLH(Integer setSdgBLH) {
        this.setSdgBLH = setSdgBLH;
    }

    public Integer getSetSdgBLL() {
        return setSdgBLL;
    }

    public void setSetSdgBLL(Integer setSdgBLL) {
        this.setSdgBLL = setSdgBLL;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Factsewa{" +
        "id=" + id +
        ", revTime=" + revTime +
        ", equmType=" + equmType +
        ", factNum=" + factNum +
        ", equmNum=" + equmNum +
        ", dataType=" + dataType +
        ", valCod=" + valCod +
        ", valNitr=" + valNitr +
        ", valNih=" + valNih +
        ", valPho=" + valPho +
        ", valOutss=" + valOutss +
        ", valOutBy=" + valOutBy +
        ", valOutTemp=" + valOutTemp +
        ", valRuntime=" + valRuntime +
        ", valSrc=" + valSrc +
        ", valPowpt=" + valPowpt +
        ", valPower=" + valPower +
        ", valMBR1=" + valMBR1 +
        ", valMBR2=" + valMBR2 +
        ", valMBR3=" + valMBR3 +
        ", valMBR4=" + valMBR4 +
        ", valMBR5=" + valMBR5 +
        ", valMBR6=" + valMBR6 +
        ", valMBR7=" + valMBR7 +
        ", valMBR8=" + valMBR8 +
        ", valMBR9=" + valMBR9 +
        ", valMBR10=" + valMBR10 +
        ", valMBRsum1=" + valMBRsum1 +
        ", valMBRsum2=" + valMBRsum2 +
        ", valMBRsum3=" + valMBRsum3 +
        ", valMBRsum4=" + valMBRsum4 +
        ", valMBRsum5=" + valMBRsum5 +
        ", valMBRsum6=" + valMBRsum6 +
        ", valMBRsum7=" + valMBRsum7 +
        ", valMBRsum8=" + valMBRsum8 +
        ", valMBRsum9=" + valMBRsum9 +
        ", valMBRsum10=" + valMBRsum10 +
        ", allFlag=" + allFlag +
        ", valInBL=" + valInBL +
        ", valPoolBL=" + valPoolBL +
        ", valSandBL=" + valSandBL +
        ", valSdgBL=" + valSdgBL +
        ", setSubPumpHZ1=" + setSubPumpHZ1 +
        ", setSubPumpHZ2=" + setSubPumpHZ2 +
        ", setSubPumpHZ3=" + setSubPumpHZ3 +
        ", setAcHZ=" + setAcHZ +
        ", setAlHZ=" + setAlHZ +
        ", setReclnSdelay1=" + setReclnSdelay1 +
        ", setReclnEdelay1=" + setReclnEdelay1 +
        ", setReclnR1=" + setReclnR1 +
        ", setReclnSdelay2=" + setReclnSdelay2 +
        ", setReclnEdelay2=" + setReclnEdelay2 +
        ", setReclnR2=" + setReclnR2 +
        ", setPiPumpSdelay1=" + setPiPumpSdelay1 +
        ", setPiPumpEdelay1=" + setPiPumpEdelay1 +
        ", setPiPumpR1=" + setPiPumpR1 +
        ", setPiPumpSdelay2=" + setPiPumpSdelay2 +
        ", setPiPumpEdelay2=" + setPiPumpEdelay2 +
        ", setPiPumpR2=" + setPiPumpR2 +
        ", setConvSdelay=" + setConvSdelay +
        ", setConvEdelay=" + setConvEdelay +
        ", setConvR=" + setConvR +
        ", setSplSdelay=" + setSplSdelay +
        ", setSplEdelay=" + setSplEdelay +
        ", setSplR=" + setSplR +
        ", setAgitSdelay=" + setAgitSdelay +
        ", setAgitEdelay=" + setAgitEdelay +
        ", setAgitR=" + setAgitR +
        ", setSdgPumpSdelay=" + setSdgPumpSdelay +
        ", setSdgPumpEdelay=" + setSdgPumpEdelay +
        ", setSdgPumpR=" + setSdgPumpR +
        ", setSubPumpSdelay1=" + setSubPumpSdelay1 +
        ", setSubPumpEdelay1=" + setSubPumpEdelay1 +
        ", setSubPumpR1=" + setSubPumpR1 +
        ", setSubPumpSdelay2=" + setSubPumpSdelay2 +
        ", setSubPumpEdelay2=" + setSubPumpEdelay2 +
        ", setSubPumpR2=" + setSubPumpR2 +
        ", setSubPumpSdelay3=" + setSubPumpSdelay3 +
        ", setSubPumpEdelay3=" + setSubPumpEdelay3 +
        ", setSubPumpR=" + setSubPumpR +
        ", setFltSdelay=" + setFltSdelay +
        ", setFltEdelay=" + setFltEdelay +
        ", setFltR=" + setFltR +
        ", setRwPumpSdelay=" + setRwPumpSdelay +
        ", setRwPumpEdelay=" + setRwPumpEdelay +
        ", setRwPumpR=" + setRwPumpR +
        ", setAcPumpSdelay=" + setAcPumpSdelay +
        ", setAcPumpEdelay=" + setAcPumpEdelay +
        ", setAcpumpR=" + setAcpumpR +
        ", setAlPumpSdelay=" + setAlPumpSdelay +
        ", setAlPumpEdelay=" + setAlPumpEdelay +
        ", setAlPumpR=" + setAlPumpR +
        ", setPACagSdelay=" + setPACagSdelay +
        ", setPACagEdelay=" + setPACagEdelay +
        ", setPACagR=" + setPACagR +
        ", setPACpSdelay=" + setPACpSdelay +
        ", setPACpEdelay=" + setPACpEdelay +
        ", setPACpR=" + setPACpR +
        ", setRwQSdelay1=" + setRwQSdelay1 +
        ", setRwQEdelay1=" + setRwQEdelay1 +
        ", setRwQR1=" + setRwQR1 +
        ", setRwQSdelay2=" + setRwQSdelay2 +
        ", setRwQEdelay2=" + setRwQEdelay2 +
        ", setRwQR2=" + setRwQR2 +
        ", setRwQSdelay3=" + setRwQSdelay3 +
        ", setRwQEdelay3=" + setRwQEdelay3 +
        ", setRwQR3=" + setRwQR3 +
        ", setRwInQSdelay=" + setRwInQSdelay +
        ", setRwInQEdelay=" + setRwInQEdelay +
        ", setRwInR=" + setRwInR +
        ", setPACInQSdelay=" + setPACInQSdelay +
        ", setPACInQEdelay=" + setPACInQEdelay +
        ", setPACInQR=" + setPACInQR +
        ", setInBLH=" + setInBLH +
        ", setINBLL=" + setINBLL +
        ", setPoolBLH=" + setPoolBLH +
        ", setPoolBLL=" + setPoolBLL +
        ", setSandBLH=" + setSandBLH +
        ", SetSandBLL=" + SetSandBLL +
        ", setSdgBLH=" + setSdgBLH +
        ", setSdgBLL=" + setSdgBLL +
        ", count=" + count +
        "}";
    }
}
