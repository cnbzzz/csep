package com.infore.csep.restful;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Maps;
import com.infore.csep.restful.VO.ActionReqVO;
import com.infore.csep.restful.VO.AlarmReqVO;
import com.infore.csep.restful.VO.ResultVO;
import com.infore.csep.restful.utils.HttpClientUitl;
import com.infore.csep.restful.utils.JsonUtil;
import lombok.Data;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by steven ma
 * 2018/4/9 17:43
 */
@Data
public class TestRestTemplate {


//      private   int code;
//      private   String msg;
//      private   Object data;





    public static void main(String[] args) throws JsonProcessingException {

        alarmTest();

    }



    private static void alarmTest() {

        //  请求地址
        String url = "http://120.78.188.52:8450/api/alarm";

        AlarmReqVO alarmReqVO = new AlarmReqVO();
        alarmReqVO.setEquipmentNo("123");
        alarmReqVO.setBytes("aaa");
        alarmReqVO.setValue("1");
        alarmReqVO.setAlarmTime("2018-03-13 15:39:00");

        List<AlarmReqVO> alarmReqVOS = new ArrayList<>();
        alarmReqVOS.add(alarmReqVO);

        ResultVO result = HttpClientUitl.send(url, alarmReqVOS);


        System.out.println(result);
//        System.out.println(result.getMsg());
//        System.out.println(result.getData());
//
//        String tmp = JsonUtil.toJson(result.getData());
//        System.out.println(tmp);

    }

    private static void actionTest() {
        //  请求地址
        String url = "http://127.0.0.1:9191/api/action";
        RestTemplate client = new RestTemplate();
        //  一定要设置header
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        //  将提交的数据转换为String
        //  最好通过bean注入的方式获取ObjectMapper
//        ObjectMapper mapper = new ObjectMapper();
//        Map<String, String> params= Maps.newHashMap();
//        params.put("sid", "国米");
//        params.put("password", "123456");
//        String value = mapper.writeValueAsString(params);

        ActionReqVO actionReqVO = new ActionReqVO();
        actionReqVO.setSid("112233");
        actionReqVO.setCommand("c22");
        actionReqVO.setClientId("e33");
        actionReqVO.setPlcAdress("d44");
        actionReqVO.setPlcIP("127.0.0.1");
        actionReqVO.setEqumType("t11");
        actionReqVO.setValue("kk");
        actionReqVO.setPlatformType("gps");
        String value = JsonUtil.toJson(actionReqVO);

        HttpEntity<String> requestEntity = new HttpEntity<String>(value, headers);
        //  执行HTTP请求
        ResponseEntity<String> response = client.postForEntity(url, requestEntity , String.class );
        System.out.println(response.getBody());


        ResultVO result = JsonUtil.toObject(response.getBody(), ResultVO.class);
        System.out.println(result.getCode());
        System.out.println(result.getMsg());
        System.out.println(result.getData());

        String tmp = JsonUtil.toJson(result.getData());
        System.out.println(tmp);


        ActionReqVO data = JsonUtil.toObject(tmp, ActionReqVO.class);
        System.out.println(data);

        if (data instanceof  ActionReqVO) {
            System.out.println(data.getCommand());
        }
    }
}
