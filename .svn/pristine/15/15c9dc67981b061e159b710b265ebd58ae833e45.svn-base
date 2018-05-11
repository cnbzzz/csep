package com.infore.csep.restful.ctrl;


import com.github.cnbzzz.spring.boot.starter.rocketmq.core.RocketMQTemplate;
import com.infore.csep.pojo.rocketmq.TopicName;
import com.infore.csep.restful.VO.ActionReqVO;
import com.infore.csep.restful.VO.ResultVO;
import com.infore.csep.restful.enums.ResultEnum;
import com.infore.csep.restful.exception.BsdException;
import com.infore.csep.restful.utils.CheckParamUtil;
import com.infore.csep.restful.utils.ResultVOUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by steven ma
 * 2018/4/9 14:43
 */

@RestController
@RequestMapping("/api")
@Slf4j
public class ApiCtrl {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @RequestMapping("/hello")
    public ResultVO SayHello() {

        return ResultVOUtil.success(10);
    }

    @RequestMapping("/error")
    public ResultVO error() {
        throw new BsdException(ResultEnum.PARAM_ERROR);
    }

    public static final String GpsPlatform = "gps";
    public static final String FactPlatform = "fact";

    @PostMapping("/action")
    public ResultVO action(@RequestBody @Valid ActionReqVO reqVO, BindingResult br) {

        log.debug("request: {}", reqVO);
        CheckParamUtil.check(br);

        switch (reqVO.getPlatformType()) {
            //GPS业务
            case GpsPlatform:
                break;

            //厂站业务
            case FactPlatform:
                doFactPlatForm(reqVO);
                break;

            //平台类型错误
            default:
                throw new BsdException(ResultEnum.PARAM_PLATFORM_ERROR);
        }


        return ResultVOUtil.success(reqVO);
    }

    /**
     * 厂站反控处理逻辑
     * @param reqVO
     */
    private void doFactPlatForm(ActionReqVO reqVO) {
        log.debug("doFactPlatForm ...");
        rocketMQTemplate.convertAndSend(TopicName.PLC_ACTION, reqVO);
    }


}
