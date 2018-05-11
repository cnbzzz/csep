package com.infore.csep.gpsreceiver.encrypt;

import com.infore.csep.gpsreceiver.param.BaseReqParam;
import com.infore.csep.gpsreceiver.protocol.DownRsp;
import com.infore.csep.gpsreceiver.protocol.ResultRsp;
import com.infore.csep.gpsreceiver.protocol.UpRsp;
import com.infore.csep.gpsreceiver.service.DownService;
import com.infore.csep.gpsreceiver.utils.HttpClientUtil;
import com.infore.csep.gpsreceiver.utils.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class DESWapperTest {

    @Autowired
    private DESWapper desWapper;

    @Autowired
    private BaseReqParam baseReqParam;

    @Test
    public void encode() throws Exception {
        String result = "c4a06df3ece21e35adc19c45489a5213a16c4abf19c38731807038b1108792cf375330cc5447af1f1d726f23053f3a5241bd456333902e0886e38473b2af7dc2330600932fe96d397391aefb9e3f4fc80246756a665fa80b33aa376ce230f8abf0479741ce32f37d1247e47cd9b33a6235e9de25202ae955d5e2a7bfcb66ddf5131362d904ba58256ca17e7cb34914794eb31fe37072ff467b33d548c66da810e83e9927293344cc18fc799c01b1e87ccb3798a4ec498237bf99171edc06a403";

        String reqStr = "downCurrentLocation?apiuser=openapi&snid=1524731302807&terminalid=541A914050115&cmdid=12&serialId=00000813&dataLen=0000002&dataBlock=0500&checkCode=80&token=6799161eefeec8f42a1d42654b65b5c3";

        String myResult = desWapper.encode(reqStr);

        log.info("encode result: {}", myResult);

        Assert.assertEquals(result, myResult);

    }

    @Test
    public void decode() throws Exception {

        //String reqStr = "8d1a886cfc28b952cc36d4b59bfab77aeab1cd5ef0042516b678be93dcc22c6896531dea890f86bda294b791dd6866e32bf2bb7a4a7f62bc9bc4164947533610fc33d9a0ef69b27c9d0b064ca83c6bb25eb874de6ad33235ceeddc9e03cbb3217ca252c5c1a9793660e5950cadb669e8e80b469b1ee395df76619c145000751eb52aeb32a601900e7c72a05355390b9103795aa9027b2b25bbc62d3d0298f61b80a6c1d763bf6d6298314181e8d76d3196a753e8bbced1d7053a039f2999594e03c1811d8c3dbe8cecd7eac24fcad33ba9d30f51cf48cf7486e4282b2c04a99cd1eb529dd717f42fe718fdd3d893d748ca0d3ef4bf1ac16981de6cf29cc7544b9a31431c381b8fa510b39dc90778c3528d873aa80a709e9d5564477fad162db703d1ad3253db077eed75197c7dab87baee74ac84c1d74b62f33d2c16b6ae01b95f199cbd4e8566ea6cb4a9477da874604bed380fba3743a6f88decd7590fb239291c98fc248aff7435cd66fdb39fc3c17641339a9daab44770f1139ddd8d9970a867f133734ea728";

        String reqStr = "8d1a886cfc28b952cc36d4b59bfab77aeab1cd5ef0042516b678be93dcc22c6896531dea890f86bda294b791dd6866e32bf2bb7a4a7f62bc9bc416494753361005a3403ae3ad922603c781e2c9f4341295dc718cf01fe002d49ad5cec5942adef691690292ddae134e2b176671ab4fc4dbe70c21ae436d220bb62c639aeea18c8f83e94cc77858430d2b6c3880e9eb4cd622f12c071b0224df40814eb81da3b457171f86aecb1030c0874a4d2acf71f8885a2cecb9fff1b6c994a880bf74bbff053a039f2999594e03c1811d8c3dbe8cecd7eac24fcad33ba9d30f51cf48cf7402693209891c04048b68306814bf2686cabb752dbbcc5506478a454ec85c6ad9a867f133734ea728";

        String ret = desWapper.decode(reqStr);

        log.info("Ret: {}", ret);


    }

//    public String getUrl(String reqUrl) throws IOException {
//
//        HttpURLConnection conn = (HttpURLConnection) (new URL(reqUrl).openConnection());
//        conn.connect();
//
//        BufferedReader reader = new BufferedReader(
//                new InputStreamReader(
//                        conn.getInputStream()));
//
//        return reader.readLine();
//
//    }


    @Test
    public void testReq() throws Exception {

        String serverurl = "http://113.247.222.46:9000/hjwulian/app3des/";
        String prefix = "downCurrentLocation?";
        String parms = baseReqParam.genBaseReqParam("1524731302807", "downCurrentLocation",
                "12", "541A914050115");
        String tail = "&serialId=00000813&dataLen=0000002&dataBlock=0500&checkCode=80";

        String reqParms = prefix + parms + tail;
        log.info("reqParms: {}", reqParms);
        String encode = desWapper.encode(reqParms);

        serverurl = serverurl + encode;

        log.info("Url: {}", serverurl);


        String result = HttpClientUtil.get(serverurl);
        log.info("Result: {}", result);

        ResultRsp reqRet = JsonUtil.toObject(result, ResultRsp.class);

        log.info("Decode: {}", desWapper.decode(reqRet.getEncrypt()));

    }

    @Autowired
    private DownService downService;

    @Test
    public void testDownCurrentLocationService() throws Exception {

//        serialId=00000813&dataLen=0000002&dataBlock=0500&checkCode=80

        downService.setSerialId("00000813");
        downService.setDataLen("0000002");
        downService.setDataBlock("0500");
        downService.setCheckCode("80");

        String serverurl = "http://113.247.222.46:9000/hjwulian/app3des/";
        String prefix = "downCurrentLocation?";
        String parms = downService.genBaseReqParam(
                "1524731302807",
                "downCurrentLocation",
                "12",
                "541A914050115");

        String reqParms = prefix + parms;
        log.info("reqParms: {}", reqParms);
        String encode = desWapper.encode(reqParms);

        serverurl = serverurl + encode;

        log.info("Url: {}", serverurl);


        String result = HttpClientUtil.get(serverurl);
        log.info("Result: {}", result);

        ResultRsp reqRet = JsonUtil.toObject(result, ResultRsp.class);

        log.info("Decode: {}", desWapper.decode(reqRet.getEncrypt()));


        log.info("parms: {}", parms);

    }

    @Test
    public void testSendDown() throws Exception {


        //downCurrentLocationService.setSnid("1524731302807");
        downService.setMethodName("downCurrentLocation");
        downService.setCmdid("123");
        downService.setTerminalid("541A914050115");

        downService.setSerialId("00000813");
        downService.setDataLen("0000002");
        downService.setDataBlock("0500");
        downService.setCheckCode("80");

        String ret = downService.SendReq();

        DownRsp downRsp = JsonUtil.toObject(ret, DownRsp.class);
        log.info("obj: {}", downRsp);
    }

    @Test
    public void testSendUp() throws Exception {

        //baseReqParam.setSnid("1524731302807");

        //baseReqParam.setMethodName("uploadCurrentLocation");

        baseReqParam.setMethodName("uploadCurrentConditionData");
        baseReqParam.setCmdid("15");
        baseReqParam.setTerminalid("541A914050115");

        String ret = baseReqParam.SendReq();
        ret = jsonString(ret);


        UpRsp upRsp = JsonUtil.toObject(ret, UpRsp.class);
        log.info("obj: {}", upRsp);


        log.info("Datacontent: {}", upRsp.getDatas().getDirectiveUpload().getDatacontent());
    }

    /**
     * 测试 上传--实时位置数据
     * @throws Exception
     */
    @Test
    public void testUploadCurrentLocation() throws Exception {
        //组装报文
        baseReqParam.setMethodName("uploadCurrentLocation");
        baseReqParam.setCmdid("18");
        baseReqParam.setTerminalid("541A914050115");

        //发送报文
        String ret = baseReqParam.SendReq();
        ret = jsonString(ret);

        //返回文本转为对象
        UpRsp upRsp = JsonUtil.toObject(ret, UpRsp.class);
        log.info("obj: {}", upRsp);

        //获取对象数据
        log.info("Datacontent: {}", upRsp.getDatas().getDirectiveUpload().getDatacontent());
    }



    /**
     * 暂时解决返回的json带有双引号的情况
     * @param s
     * @return
     */
    private static String jsonString(String s) {
        char[] temp = s.toCharArray();
        int n = temp.length;
        for (int i = 0; i < n; i++) {
            if (temp[i] == ':' && temp[i + 1] == '"') {
                for (int j = i + 2; j < n; j++) {
                    if (temp[j] == '"') {
                        if (temp[j + 1] != ',' && temp[j + 1] != '}') {
                            temp[j] = '”';
                        } else if (temp[j + 1] == ',' || temp[j + 1] == '}') {
                            break;
                        }
                    }
                }
            }
        }
        return new String(temp);
    }

}