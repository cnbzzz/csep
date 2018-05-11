package com.infore.csep.restful.VO;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * Created by steven ma
 * 2018/4/9 15:29
 */

/**
 * 历史数据请求接口
 */
@Data
public class HisReqVO {

    //流水号
    @NotBlank(message = "流水号 {constraint.sid.not.empty}")
    //@Size(min=6, max=6, message="密码长度应为{min} - {max}位")
    private String sid;

    //厂站编码
    private String factNum;
    //设备编码
    private String equmNum;

    //开始时间
    private String beginTime;

    //结束时间
    private String endTime;

}
