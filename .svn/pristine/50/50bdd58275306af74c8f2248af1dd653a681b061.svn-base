package com.infore.csep.common.netty.dto;

import com.infore.csep.common.netty.annotation.Unpack;
import lombok.Data;

/**
 * Created by steven ma
 * 2018/5/7 12:28
 */

/**
 * GPS位置信息
 */
@Data
public class GpsLocationPack {

//    @Unpack(index =0, length =20)
//    private String location;  //位置信息

    @Unpack(index =0, length =1)
    private Integer year; //年

    @Unpack(index =1, length =1)
    private Integer month; //月

    @Unpack(index =2, length =1)
    private Integer day; //日

    @Unpack(index =3, length =1)
    private Integer hour; //小时

    @Unpack(index =4, length =1)
    private Integer minute; //分

    @Unpack(index =5, length =1)
    private Integer second; //秒

    @Unpack(index =6, length =1)
    private Integer latDegree; //纬度：度

    @Unpack(index =7, length =1)
    private Integer latMinute; //纬度：分

    @Unpack(index =8, length =2)
    private Integer latPoint; //纬度：分小数

    @Unpack(index =10, length =1)
    private Integer lngDegree; //经度：度

    @Unpack(index =11, length =1)
    private Integer lngMinute; //经度：分

    @Unpack(index =12, length =2)
    private Integer lngPonit; //经度：分小数

    @Unpack(index =14, length =1)
    private Integer speed; //速度

    @Unpack(index =15, length =1)
    private Integer direction; //航向

    @Unpack(index =16, length =1)
    private Integer st1; //状态1

    @Unpack(index =17, length =1)
    private Integer st2; //状态2

    @Unpack(index =18, length =1)
    private Integer st3; //状态3

    @Unpack(index =19, length =1)
    private Integer st4; //状态4



    @Unpack(index =20, length =1)
    private Integer oilWear; //油耗 0-255

    @Unpack(index =21, length =4)
    private Integer totalMil; //总里程 : 米

    @Unpack(index =25, length =4)
    private Integer accOnTotalTime; //ACC ON总累计时间 ：分种

    @Unpack(index =29, length =2)
    private Integer currentMil; //当次点火后里程数: 米

    @Unpack(index =31, length =4)
    private Integer currentAccOnTime; //当次ACC ON累计时间： 分钟

    private Integer baseStationLen; //基站ID长度

    @Unpack(index =35, length =2)
    private Integer baseStationId; // 基站ID

}


