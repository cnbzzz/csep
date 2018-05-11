package com.infore.csep.restful.utils;

import com.infore.csep.restful.VO.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Created by steven ma
 * 2018/5/8 14:48
 */

@Slf4j
public class HttpClientUitl {

    public static ResultVO send(String url, Object request) {

        RestTemplate client = new RestTemplate();
        //  一定要设置header
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);

        String params = JsonUtil.toJson(request);
        log.debug("params: {}", params);

        HttpEntity<String> requestEntity = new HttpEntity<>(params, headers);
        //  执行HTTP请求
        ResponseEntity<String> response = client.postForEntity(url, requestEntity , String.class );
        log.debug("response body: {}", response.getBody());


        ResultVO result = JsonUtil.toObject(response.getBody(), ResultVO.class);


        return result;
    }
}
