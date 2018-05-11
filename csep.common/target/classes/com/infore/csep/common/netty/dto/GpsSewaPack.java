package com.infore.csep.common.netty.dto;

import com.infore.csep.common.netty.annotation.Unpack;
import lombok.Data;

/**
 * Created by steven ma
 * 2018/5/2 16:59
 */
@Data
public class GpsSewaPack extends FactleachBasePack {


//    @Unpack(index =1, length =6)
//    private String factNum; //估计是数字

    @Unpack(index =10, length =2)
    private Integer valRunHour; //总运行时间（小时）


    @Unpack(index =12, length =4)
    private Integer valPower; //总用电量


    @Unpack(index =16, length =4)
    private Integer valWal; //总出水量


    @Unpack(index =20, length =7)
    private byte[] allFlag; //本地手动控制模式


    @Unpack(index =28, length =2)
    private Integer valCln; //清水产水实时流量BF09811


    @Unpack(index =30, length =2)
    private Integer valPip; //抽吸管道泵负压测量值BP09711


    @Unpack(index =32, length =2)
    private Integer valTankL; //箱体液位


    @Unpack(index =34, length =2)
    private Integer setSubBlowS; //风机开机连续运行时间设置


    @Unpack(index =36, length =2)
    private Integer setSubBlowE; //风机停机运行时间设置


    @Unpack(index =38, length =2)
    private Integer setPiPumpS; //抽吸管道泵延时启动时间设置


    @Unpack(index =40, length =2)
    private Integer setPiPumpR; //抽吸管道泵连续运行时间设置


    @Unpack(index =42, length =2)
    private Integer setPiPumpE; //抽吸管道泵停机运行时间设置


    @Unpack(index =44, length =2)
    private Integer setAgit1R; //推流器1#连续运行时间设置


    @Unpack(index =46, length =2)
    private Integer setAgit1E; //推流器1#停机运行时间设置


    @Unpack(index =48, length =2)
    private Integer setAgit2R; //推流器2#连续运行时间设置


    @Unpack(index =50, length =2)
    private Integer setAgit2E; //推流器2#停机运行时间设置


    @Unpack(index =52, length =2)
    private Integer setLiPumpS; //污水提升泵延时启动时间设置


    @Unpack(index =56, length =2)
    private Integer setMvR; //排泥阀连续运行时间设置


    @Unpack(index =58, length =2)
    private Integer setMvE; //排泥阀停机运行时间设置


    @Unpack(index =60, length =2)
    private Integer setPiPumpPH; //抽吸泵负压大预警设定值


    @Unpack(index =62, length =2)
    private Integer setPiPumpPHH; //抽吸泵负压过大报警设定值


    @Unpack(index =64, length =2)
    private Integer setTankLL; //箱内液位低于SL13111预警时间延时


    @Unpack(index =66, length =2)
    private Integer setTankLLdelay; //调节池液位低于SL02411报警时间延时


    @Unpack(index =68, length =2)
    private Integer setPiPumpPdelay; //抽吸泵负压压力BP09711预警时间延时


    @Unpack(index =70, length =2)
    private Integer setPiPumpOldelay; //抽吸泵过载报警时间延时


    @Unpack(index =72, length =2)
    private Integer setLiPumpdelay; //污水提升泵过载报警时间延时


    @Unpack(index =76, length =2)
    private Integer setTankldelay; //箱内液位低于SL13111报警时间延时


    @Unpack(index =78, length =2)
    private Integer setPiPumpP2delay; //抽吸泵负压压力BP09711报警时间延时


    @Unpack(index =80, length =2)
    private Integer setSubBlowOldelay; //风机过载报警时间延时


    @Unpack(index =82, length =2)
    private Integer setUvOldelay; //紫外线消毒管过载报警时间延时


    @Unpack(index =84, length =2)
    private Integer setAgit1Oldelay; //推流器1#过载报警时间延时


    @Unpack(index =86, length =2)
    private Integer setAgit2Oldelay; //推流器2#过载报警时间延时


    @Unpack(index =105, length =8)
    private String equmNum; //设备编码


    @Unpack(index =113, length =1)
    private Integer count; //计数



}
