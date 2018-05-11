package com.infore.csep.restful.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {

    UNKNOW(-1, "未知错误"),
    INTERNAL_SERVER_ERROR(50000, "内部服务错误"),
    USER_EXIST(10001, "用户已存在"),
    USER_NOT_LOGIN(10002, "用户未登录"),
    USER_NOT_EXIST(10003, "用户名或密码错误"),
    PARAM_ERROR(90001,"参数错误"),

    PARAM_PLATFORM_ERROR(10004,"平台类型错误"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
