package com.infore.csep.pojo.entity;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author bzzz
 * @since 2018-04-23
 */
public class Gpssewa extends Model<Gpssewa> {

    private static final long serialVersionUID = 1L;

    private Long id;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date revTime;
    private Integer equmType;
    private String factNum;
    private Integer valRunHour;
    private Integer valPower;
    private Integer valWal;
    private String allFlag;
    private Integer valCln;
    private Integer valPip;
    private Integer valTankL;
    private Integer setSubBlowS;
    private Integer setSubBlowE;
    private Integer setPiPumpS;
    private Integer setPiPumpR;
    private Integer setPiPumpE;
    private Integer setAgit1R;
    private Integer setAgit1E;
    private Integer setAgit2R;
    private Integer setAgit2E;
    private Integer setLiPumpS;
    private Integer setMvR;
    private Integer setMvE;
    private Integer setPiPumpPH;
    private Integer setPiPumpPHH;
    private Integer setTankLL;
    private Integer setTankLLdelay;
    private Integer setPiPumpPdelay;
    private Integer setPiPumpOldelay;
    private Integer setLiPumpdelay;
    private Integer setTankldelay;
    private Integer setPiPumpP2delay;
    private Integer setSubBlowOldelay;
    private Integer setUvOldelay;
    private Integer setAgit1Oldelay;
    private Integer setAgit2Oldelay;
    private String equmNum;
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

    public String getFactNum() {
        return factNum;
    }

    public void setFactNum(String factNum) {
        this.factNum = factNum ;
    }

    public Integer getValRunHour() {
        return valRunHour;
    }

    public void setValRunHour(Integer valRunHour) {
        this.valRunHour = valRunHour;
    }

    public Integer getValPower() {
        return valPower;
    }

    public void setValPower(Integer valPower) {
        this.valPower = valPower;
    }

    public Integer getValWal() {
        return valWal;
    }

    public void setValWal(Integer valWal) {
        this.valWal = valWal;
    }

    public String getAllFlag() {
        return allFlag;
    }

    public void setAllFlag(String allFlag) {
        this.allFlag = allFlag;
    }

    public Integer getValCln() {
        return valCln;
    }

    public void setValCln(Integer valCln) {
        this.valCln = valCln;
    }

    public Integer getValPip() {
        return valPip;
    }

    public void setValPip(Integer valPip) {
        this.valPip = valPip;
    }

    public Integer getValTankL() {
        return valTankL;
    }

    public void setValTankL(Integer valTankL) {
        this.valTankL = valTankL;
    }

    public Integer getSetSubBlowS() {
        return setSubBlowS;
    }

    public void setSetSubBlowS(Integer setSubBlowS) {
        this.setSubBlowS = setSubBlowS;
    }

    public Integer getSetSubBlowE() {
        return setSubBlowE;
    }

    public void setSetSubBlowE(Integer setSubBlowE) {
        this.setSubBlowE = setSubBlowE;
    }

    public Integer getSetPiPumpS() {
        return setPiPumpS;
    }

    public void setSetPiPumpS(Integer setPiPumpS) {
        this.setPiPumpS = setPiPumpS;
    }

    public Integer getSetPiPumpR() {
        return setPiPumpR;
    }

    public void setSetPiPumpR(Integer setPiPumpR) {
        this.setPiPumpR = setPiPumpR;
    }

    public Integer getSetPiPumpE() {
        return setPiPumpE;
    }

    public void setSetPiPumpE(Integer setPiPumpE) {
        this.setPiPumpE = setPiPumpE;
    }

    public Integer getSetAgit1R() {
        return setAgit1R;
    }

    public void setSetAgit1R(Integer setAgit1R) {
        this.setAgit1R = setAgit1R;
    }

    public Integer getSetAgit1E() {
        return setAgit1E;
    }

    public void setSetAgit1E(Integer setAgit1E) {
        this.setAgit1E = setAgit1E;
    }

    public Integer getSetAgit2R() {
        return setAgit2R;
    }

    public void setSetAgit2R(Integer setAgit2R) {
        this.setAgit2R = setAgit2R;
    }

    public Integer getSetAgit2E() {
        return setAgit2E;
    }

    public void setSetAgit2E(Integer setAgit2E) {
        this.setAgit2E = setAgit2E;
    }

    public Integer getSetLiPumpS() {
        return setLiPumpS;
    }

    public void setSetLiPumpS(Integer setLiPumpS) {
        this.setLiPumpS = setLiPumpS;
    }

    public Integer getSetMvR() {
        return setMvR;
    }

    public void setSetMvR(Integer setMvR) {
        this.setMvR = setMvR;
    }

    public Integer getSetMvE() {
        return setMvE;
    }

    public void setSetMvE(Integer setMvE) {
        this.setMvE = setMvE;
    }

    public Integer getSetPiPumpPH() {
        return setPiPumpPH;
    }

    public void setSetPiPumpPH(Integer setPiPumpPH) {
        this.setPiPumpPH = setPiPumpPH;
    }

    public Integer getSetPiPumpPHH() {
        return setPiPumpPHH;
    }

    public void setSetPiPumpPHH(Integer setPiPumpPHH) {
        this.setPiPumpPHH = setPiPumpPHH;
    }

    public Integer getSetTankLL() {
        return setTankLL;
    }

    public void setSetTankLL(Integer setTankLL) {
        this.setTankLL = setTankLL;
    }

    public Integer getSetTankLLdelay() {
        return setTankLLdelay;
    }

    public void setSetTankLLdelay(Integer setTankLLdelay) {
        this.setTankLLdelay = setTankLLdelay;
    }

    public Integer getSetPiPumpPdelay() {
        return setPiPumpPdelay;
    }

    public void setSetPiPumpPdelay(Integer setPiPumpPdelay) {
        this.setPiPumpPdelay = setPiPumpPdelay;
    }

    public Integer getSetPiPumpOldelay() {
        return setPiPumpOldelay;
    }

    public void setSetPiPumpOldelay(Integer setPiPumpOldelay) {
        this.setPiPumpOldelay = setPiPumpOldelay;
    }

    public Integer getSetLiPumpdelay() {
        return setLiPumpdelay;
    }

    public void setSetLiPumpdelay(Integer setLiPumpdelay) {
        this.setLiPumpdelay = setLiPumpdelay;
    }

    public Integer getSetTankldelay() {
        return setTankldelay;
    }

    public void setSetTankldelay(Integer setTankldelay) {
        this.setTankldelay = setTankldelay;
    }

    public Integer getSetPiPumpP2delay() {
        return setPiPumpP2delay;
    }

    public void setSetPiPumpP2delay(Integer setPiPumpP2delay) {
        this.setPiPumpP2delay = setPiPumpP2delay;
    }

    public Integer getSetSubBlowOldelay() {
        return setSubBlowOldelay;
    }

    public void setSetSubBlowOldelay(Integer setSubBlowOldelay) {
        this.setSubBlowOldelay = setSubBlowOldelay;
    }

    public Integer getSetUvOldelay() {
        return setUvOldelay;
    }

    public void setSetUvOldelay(Integer setUvOldelay) {
        this.setUvOldelay = setUvOldelay;
    }

    public Integer getSetAgit1Oldelay() {
        return setAgit1Oldelay;
    }

    public void setSetAgit1Oldelay(Integer setAgit1Oldelay) {
        this.setAgit1Oldelay = setAgit1Oldelay;
    }

    public Integer getSetAgit2Oldelay() {
        return setAgit2Oldelay;
    }

    public void setSetAgit2Oldelay(Integer setAgit2Oldelay) {
        this.setAgit2Oldelay = setAgit2Oldelay;
    }

    public String getEqumNum() {
        return equmNum;
    }

    public void setEqumNum(String equmNum) {
        this.equmNum = equmNum;
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
        return "Gpssewa{" +
        "id=" + id +
        ", revTime=" + revTime +
        ", equmType=" + equmType +
        ", factNum=" + factNum +
        ", valRunHour=" + valRunHour +
        ", valPower=" + valPower +
        ", valWal=" + valWal +
        ", allFlag=" + allFlag +
        ", valCln=" + valCln +
        ", valPip=" + valPip +
        ", valTankL=" + valTankL +
        ", setSubBlowS=" + setSubBlowS +
        ", setSubBlowE=" + setSubBlowE +
        ", setPiPumpS=" + setPiPumpS +
        ", setPiPumpR=" + setPiPumpR +
        ", setPiPumpE=" + setPiPumpE +
        ", setAgit1R=" + setAgit1R +
        ", setAgit1E=" + setAgit1E +
        ", setAgit2R=" + setAgit2R +
        ", setAgit2E=" + setAgit2E +
        ", setLiPumpS=" + setLiPumpS +
        ", setMvR=" + setMvR +
        ", setMvE=" + setMvE +
        ", setPiPumpPH=" + setPiPumpPH +
        ", setPiPumpPHH=" + setPiPumpPHH +
        ", setTankLL=" + setTankLL +
        ", setTankLLdelay=" + setTankLLdelay +
        ", setPiPumpPdelay=" + setPiPumpPdelay +
        ", setPiPumpOldelay=" + setPiPumpOldelay +
        ", setLiPumpdelay=" + setLiPumpdelay +
        ", setTankldelay=" + setTankldelay +
        ", setPiPumpP2delay=" + setPiPumpP2delay +
        ", setSubBlowOldelay=" + setSubBlowOldelay +
        ", setUvOldelay=" + setUvOldelay +
        ", setAgit1Oldelay=" + setAgit1Oldelay +
        ", setAgit2Oldelay=" + setAgit2Oldelay +
        ", equmNum=" + equmNum +
        ", count=" + count +
        "}";
    }
}
