package com.infore.csep.restful.VO;

import lombok.Data;

/**
 * Created by steven ma
 * 2018/5/8 15:53
 */

/**
 * 异步结果返回
 */
@Data
public class AsyncResultVO {

    //流水号
    private String sid;

    //设备编号(估计只能是网关id)
    private String equmNo;

    //控制指令(估计给不了)
    private String command;

    //结果(成功0/失败1)
    private Object data;

}
