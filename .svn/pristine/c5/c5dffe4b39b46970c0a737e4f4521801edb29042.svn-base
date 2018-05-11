package com.infore.csep.gpsreceiver.encrypt;

import com.infore.csep.gpsreceiver.conf.GpsServerConf;
import com.infore.csep.gpsreceiver.utils.DESUtils;
import com.infore.csep.gpsreceiver.utils.HexUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by steven ma
 * 2018/4/26 19:27
 */
@Component
public class DESWapper {

    @Autowired
    private GpsServerConf conf;

    /**
     * 加密
     * @param data
     * @return
     */
    public String encode(String data) throws Exception {

        byte [] bytes = DESUtils.des3EncodeECB(conf.getKEY_3DESENCODE().getBytes("utf-8"),
                data.getBytes("utf-8"));

        return HexUtil.bytesToHexString(bytes);
    }

    /**
     * 解密
     * @param data
     * @return
     */
    public String decode(String data) throws Exception {

        byte [] bytes = DESUtils.des3DecodeECB(conf.getKEY_3DESDECODE().getBytes("utf-8"),
                HexUtil.hexStringToByte(data));

        return new String(bytes);
    }
}
