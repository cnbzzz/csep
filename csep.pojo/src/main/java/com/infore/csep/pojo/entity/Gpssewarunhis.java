package com.infore.csep.pojo.entity;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author bzzz
 * @since 2018-04-23
 */
public class Gpssewarunhis extends Model<Gpssewarunhis> {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String factNum;
    private String equmNum;
    private String setBitname;
    private Date sTime;
    private Date eTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public String getSetBitname() {
        return setBitname;
    }

    public void setSetBitname(String setBitname) {
        this.setBitname = setBitname;
    }

    public Date getsTime() {
        return sTime;
    }

    public void setsTime(Date sTime) {
        this.sTime = sTime;
    }

    public Date geteTime() {
        return eTime;
    }

    public void seteTime(Date eTime) {
        this.eTime = eTime;
    }

    public String getFactNum() {
        return factNum;
    }

    public void setFactNum(String factNum) {
        this.factNum = factNum;
    }

    public String getEqumNum() {
        return equmNum;
    }

    public void setEqumNum(String equmNum) {
        this.equmNum = equmNum;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Gpssewarunhis{" +
                "id=" + id +
                ", factNum='" + factNum + '\'' +
                ", equmNum='" + equmNum + '\'' +
                ", setBitname='" + setBitname + '\'' +
                ", sTime=" + sTime +
                ", eTime=" + eTime +
                '}';
    }
}
