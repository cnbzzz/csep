package com.infore.csep.restful.utils;

import com.infore.csep.restful.enums.ResultEnum;
import com.infore.csep.restful.exception.BsdException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

/**
 * Created by steven ma
 * 2018/4/9 16:23
 */
@Slf4j
public class CheckParamUtil {

    public static void check(BindingResult br) {
        if(br.hasErrors()){
            String msg = "";
            for (int i = br.getFieldErrors().size() - 1; i >= 0; i--) {
                FieldError fe = br.getFieldErrors().get(i);
                msg += fe.getDefaultMessage() + ", ";
            }
            log.error("err params: {}", msg);
            throw new BsdException(ResultEnum.PARAM_ERROR);
        }
    }
}
