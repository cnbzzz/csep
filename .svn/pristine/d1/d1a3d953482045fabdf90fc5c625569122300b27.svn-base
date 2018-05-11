package com.infore.csep.restful.VO;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * Created by steven ma
 * 2018/4/9 15:29
 */

/**
 * 实时数据请求接口
 */
@Data
public class RealTimeReqVO {

    //流水号
    @NotBlank(message = "流水号 {constraint.sid.not.empty}")
    //@Size(min=6, max=6, message="密码长度应为{min} - {max}位")
    private String sid;

    //厂站编码
    private String factNum;
    //设备编码
    private String equmNum;

}
