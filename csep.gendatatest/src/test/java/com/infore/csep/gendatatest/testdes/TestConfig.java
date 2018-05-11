package com.infore.csep.gendatatest.testdes;

import com.infore.csep.gendatatest.utils.DESUtils;
import com.infore.csep.gendatatest.utils.HexUtil;
import com.infore.csep.gendatatest.utils.Md5Util;

public class TestConfig {
	public static final String apiuser = "appapi";
	public static final String apiusermd5 = "ed40065902934b4eb7f7bb12b20f1900";
	public static final String serverurl = "http://113.247.222.45:8088/hjwulian/appservice";//"http://127.0.0.1:8080/hjwulian/appservice";
	public static final String encryptserverurl = "http://113.247.222.45:8088/hjwulian/app3des";//"http://127.0.0.1:8080/hjwulian/app3des";
	public static final String accountid = "";
	public static final String usertoken = "";
	public static final String position = "112.876597,28.227214";
	public static final String appversion = "android-1.0";
	
	//返回数据加密kye
	public static final String KEY_3DESENCODE = "909bcf2b1b20235c74b2ffa1b93edf015f0c2682065376c531b4d4aa6d582ec45f0c2682065376c531b4d4aa6d582ec4dc483e80a7a0bd9ef71d8cf973673924";
	
	//接收数据解密key
	public static final String KEY_3DESDECODE = "5690dddfa28ae085d23518a035707282babd4a84418fb04015ac773f7459727ce9bc0e13a8a16cbb07b175d92a1131269554fadfa56c4e61a49d8edfdc6466e6";


	public static void test1() throws Exception {

		String url = "abc";

		byte[] decodekey = TestConfig.KEY_3DESDECODE.getBytes();
		String queryStr3des = HexUtil.bytesToHexString(DESUtils.des3EncodeECB(decodekey,
				url.getBytes("utf-8")));

		System.out.println("result: " + queryStr3des);
	}

	/**
	 * 解密请求的信息
	 * @throws Exception
	 */
	public static void test2() throws Exception {
		String reqStr = "c4a06df3ece21e35adc19c45489a5213a16c4abf19c38731807038b1108792cf375330cc5447af1f1d726f23053f3a5241bd456333902e0886e38473b2af7dc2330600932fe96d397391aefb9e3f4fc80246756a665fa80b33aa376ce230f8abf0479741ce32f37d1247e47cd9b33a6235e9de25202ae955d5e2a7bfcb66ddf5131362d904ba58256ca17e7cb34914794eb31fe37072ff467b33d548c66da810e83e9927293344cc18fc799c01b1e87ccb3798a4ec498237bf99171edc06a403";

		byte [] bytes = DESUtils.des3DecodeECB(KEY_3DESDECODE.getBytes(), HexUtil.hexStringToByte(reqStr));

		String str = new String(bytes);
		System.out.println("Result: " + str);
	}

	/**
	 * 解密服务器返回的消息
	 * @throws Exception
	 */
	public static void test3() throws Exception {
		String reqStr = "8d1a886cfc28b952cc36d4b59bfab77aeab1cd5ef0042516b678be93dcc22c6896531dea890f86bda294b791dd6866e32bf2bb7a4a7f62bc9bc4164947533610fc33d9a0ef69b27c9d0b064ca83c6bb25eb874de6ad33235ceeddc9e03cbb3217ca252c5c1a9793660e5950cadb669e8e80b469b1ee395df76619c145000751eb52aeb32a601900e7c72a05355390b9103795aa9027b2b25bbc62d3d0298f61b80a6c1d763bf6d6298314181e8d76d3196a753e8bbced1d7053a039f2999594e03c1811d8c3dbe8cecd7eac24fcad33ba9d30f51cf48cf7486e4282b2c04a99cd1eb529dd717f42fe718fdd3d893d748ca0d3ef4bf1ac16981de6cf29cc7544b9a31431c381b8fa510b39dc90778c3528d873aa80a709e9d5564477fad162db703d1ad3253db077eed75197c7dab87baee74ac84c1d74b62f33d2c16b6ae01b95f199cbd4e8566ea6cb4a9477da874604bed380fba3743a6f88decd7590fb239291c98fc248aff7435cd66fdb39fc3c17641339a9daab44770f1139ddd8d9970a867f133734ea728";

		byte [] bytes = DESUtils.des3DecodeECB(KEY_3DESENCODE.getBytes(), HexUtil.hexStringToByte(reqStr));

		String str = new String(bytes);
		System.out.println("Result2: " + str);


	}

	public static void testmd5() throws Exception {

		String apiuser = "openapi";
		String snid = "1524731302807";
		String methodName = "downCurrentLocation";
		String cmdid = "12";
		String terminalid = "541A914050115";
		String apiusermd5 = "ed40065902934b4eb7d7bb12b20f1900";

		String str = apiuser + snid + methodName + cmdid + terminalid + apiusermd5;
		System.out.println("str: " + str);

		String token = Md5Util.md5Encode(str);

		System.out.println("md5: " + token);
	}

	public static void main(String[] args) throws Exception {

		TestConfig.test2();

		TestConfig.test3();

		TestConfig.testmd5();
	}

}
