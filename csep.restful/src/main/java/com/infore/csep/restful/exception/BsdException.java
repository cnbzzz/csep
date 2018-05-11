package com.infore.csep.restful.exception;

import com.infore.csep.restful.enums.ResultEnum;
import lombok.Data;

/**
 * 异常处理
 * Created by steven ma
 * 2017/8/1 17:00
 */

@Data
public class BsdException extends  RuntimeException{
    private Integer code;

    public BsdException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }
}
