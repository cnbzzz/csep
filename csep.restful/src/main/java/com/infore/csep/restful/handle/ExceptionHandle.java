package com.infore.csep.restful.handle;


import com.infore.csep.restful.VO.ResultVO;
import com.infore.csep.restful.enums.ResultEnum;
import com.infore.csep.restful.exception.BsdException;
import com.infore.csep.restful.utils.ResultVOUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by steven ma
 * 2017/8/1 18:21
 */
@ControllerAdvice
@Slf4j
public class ExceptionHandle {

    //@ExceptionHandler(value = BsdException.class)
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultVO handle(Exception e) {
        if (e instanceof BsdException) {
            BsdException bsdException = (BsdException) e;
            return ResultVOUtil.error(bsdException.getCode(), bsdException.getMessage());
        } else {
            log.error("[System Error] {}", e);
            return ResultVOUtil.error(ResultEnum.INTERNAL_SERVER_ERROR.getCode(),
                    ResultEnum.INTERNAL_SERVER_ERROR.getMessage());
        }
    }
}
