package com.infore.csep.gpsreceiver.service;

import com.infore.csep.common.UnpackUtils;
import com.infore.csep.common.netty.dto.CsepPack;
import com.infore.csep.common.netty.dto.FactleachPack;
import com.infore.csep.common.netty.dto.PlcPack4Gps;
import com.infore.csep.gpsreceiver.param.BaseReqParam;
import com.infore.csep.gpsreceiver.protocol.UpRsp;
import com.infore.csep.gpsreceiver.utils.HexUtil;
import com.infore.csep.gpsreceiver.utils.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created by steven ma
 * 2018/5/7 16:41
 */

/**
 * 处理上传数据业务
 */
@Slf4j
@Service
public class UpService extends BaseReqParam {

    /**
     * 公共发送函数，返回上传结果结构体
     * @return
     * @throws Exception
     */
    private UpRsp Send() throws Exception {

        //发送报文
        String response = SendReq();

        //返回文本转为对象
        UpRsp upRsp = JsonUtil.toObject(response, UpRsp.class);
        log.info("obj: {}", upRsp);

        //获取对象数据
        log.info("Datacontent: {}", upRsp.getDatas().getDirectiveUpload().getDatacontent());

        return upRsp;
    }

    /**
     * 上传--实时位置数据
     * @param terminalid
     * @throws Exception
     */
    public void uploadCurrentLocation(String terminalid) throws Exception {

        //组装报文
        this.setMethodName("uploadCurrentLocation");
        this.setCmdid("18");
        this.setTerminalid(terminalid);

        UpRsp upRsp = Send();

        //TODO: 位置信息业务逻辑
        handleResponse(upRsp);
    }

    /**
     *  上传-实时设备工况数据
     * @param terminalid
     * @throws Exception
     */
    public void uploadCurrentConditionData(String terminalid) throws Exception {

        //组装报文
        this.setMethodName("uploadCurrentLocation");
        this.setCmdid("15"); //暂时用15，文档为(0xCA、0xCB、0xCC)
        this.setTerminalid(terminalid);

        UpRsp upRsp = Send();

        //TODO: 工况业务逻辑
        handleResponse(upRsp);

    }


    /**
     * 解析16进制字符串
     * @param strHex
     * @return
     * @throws Exception
     */
    public static CsepPack getCsepPack(String strHex) throws Exception {

        byte[] bytes = HexUtil.hexStringToByte(strHex);

        CsepPack csepPack = UnpackUtils.unPack(bytes, CsepPack.class);

        return csepPack;
    }

    public void handleResponse(UpRsp upRsp) throws Exception {
        handleResponse(upRsp.getDatas().getDirectiveUpload().getDatacontent());
    }

    /**
     * 处理返回报文
     * @param contents
     * @throws Exception
     */
    public void handleResponse(String contents) throws Exception {

        if(contents == null) {
            log.error("handleResponse contents is null");
            return;
        }

        //解析第一层
        CsepPack csepPack = getCsepPack(contents);
        log.debug("CsepPack: {}", csepPack);

        handleLevel2(csepPack);

    }

    private static final int CURRENT_LOCATION = 0x18;
    private static final int CURRENT_CONDITION = 0x15;

    public void handleLevel2(CsepPack csepPack) throws Exception {

        switch (csepPack.getCommond()) {

            //上传--实时位置数据
            case CURRENT_LOCATION:
                log.debug("handle CURRENT_LOCATION");
                break;

            //上传-实时设备工况数据
            case CURRENT_CONDITION:
                log.debug("handle CURRENT_CONDITION");
                PlcPack4Gps plcPack4Gps = parseLV2(csepPack);
                parseV3(plcPack4Gps);
                break;

            default:
                log.error("Unknow commond!");
                break;

        }

    }

    public void parseV3(PlcPack4Gps plcPack4Gps) throws Exception {

        switch (plcPack4Gps.getDataType()) {

            case 00:  //渗滤液一体化设备：工况数据=00
                FactleachPack factleachPack= UnpackUtils.unPack(plcPack4Gps.getContent(), FactleachPack.class);
                log.info("factleachPack: {}", factleachPack);
                break;

            default:
                break;

        }


    }

    /**
     * 处理第二层包头
     * @param csepPack
     * @return
     * @throws Exception
     */
    public PlcPack4Gps parseLV2(CsepPack csepPack) throws Exception {
        PlcPack4Gps plcPack4Gps = new PlcPack4Gps();
        int otherLen = 2 + 2 + 1 + 4 + 1 + 2 + 1; //除数据区的长度
        int contentLen = csepPack.getContentLength() - otherLen;

        log.debug("ContenLen: {} otherLen: {}" ,contentLen ,otherLen);

        //必须设置
        plcPack4Gps.setContentLen(contentLen);

        plcPack4Gps = UnpackUtils.unPack(csepPack.getContent(), PlcPack4Gps.class, plcPack4Gps);
        log.debug("PlcPack4Gps: {}" , plcPack4Gps);


        return plcPack4Gps;

    }

}
