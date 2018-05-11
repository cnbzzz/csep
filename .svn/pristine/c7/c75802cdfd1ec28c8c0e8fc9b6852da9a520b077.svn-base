package com.infore.csep.restful.service;

import com.alibaba.fastjson.JSONObject;
import com.infore.csep.restful.VO.ActionResponseVO;
import com.infore.csep.restful.VO.AlarmReqVO;
import com.infore.csep.restful.VO.AsyncResultVO;
import com.infore.csep.restful.VO.ResultVO;
import com.infore.csep.restful.utils.HttpClientUitl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by steven ma
 * 2018/5/8 14:47
 */
@Slf4j
@Service
public class Send2BusinessService {

    @Value("${business.serverurl}")
    private String serverUrl;


    private static final String ALARM_PATH = "/api/alarm";

    private static final String ACTION_RESPONSE = "/api/action_response";

    private static final String ASYNC_RESULT = "/api/async_resut";


    /**
     * 发送异步返回结果
     * @param asyncResultVO
     * @return
     */
    public ResultVO sendAsyncResult(AsyncResultVO asyncResultVO) {

        log.info("sendAsyncResult: {}", asyncResultVO);
        asyncResultVO.setData(JSONObject.toJSONString(asyncResultVO.getData()));

        return send(ASYNC_RESULT, asyncResultVO);
    }


    /**
     * 发送操作类接口响应
     * @param actionResponseVO
     * @return
     */
    public ResultVO sendActionResponse(ActionResponseVO actionResponseVO) {

        log.info("sendActionResponse: {}", actionResponseVO);

        return send(ACTION_RESPONSE, actionResponseVO);
    }

    /**
     * 发送报警请求
     * @param alarmReqs
     * @return
     */
    public ResultVO sendAlarm(List<AlarmReqVO> alarmReqs) {

        log.info("sendAlarm: {}", alarmReqs);

        return send(ALARM_PATH, alarmReqs);
    }

    /**
     * 封装一下发送函数
     * @param path
     * @param request
     * @return
     */
    private ResultVO send(String path, Object request) {

        String url = serverUrl + path;
        log.debug("send url: {}", url);

        return HttpClientUitl.send(url, request);
    }

}
