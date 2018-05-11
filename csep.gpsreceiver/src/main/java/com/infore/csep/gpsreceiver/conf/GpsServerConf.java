package com.infore.csep.gpsreceiver.conf;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by steven ma
 * 2018/4/26 19:01
 */
@Data
@Component
public class GpsServerConf {

    @Value("${GpsServer.apiuser}")
    private   String apiuser;
    @Value("${GpsServer.apiusermd5}")
    private  String apiusermd5;
    @Value("${GpsServer.serverurl}")
    private  String serverurl;//"http://127.0.0.1:8080/hjwulian/appservice";
//    @Value("${GpsServer.encryptserverurl}")
//    private  String encryptserverurl;//"http://127.0.0.1:8080/hjwulian/app3des";



    //返回数据加密key
    @Value("${GpsServer.KEY_3DESENCODE}")
    private  String KEY_3DESENCODE ;

    //接收数据解密key
    @Value("${GpsServer.KEY_3DESDECODE}")
    private  String KEY_3DESDECODE ;


}
