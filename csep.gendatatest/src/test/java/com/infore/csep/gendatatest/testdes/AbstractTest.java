package com.infore.csep.gendatatest.testdes;

import com.infore.csep.gendatatest.utils.DESUtils;
import com.infore.csep.gendatatest.utils.HexUtil;
import com.infore.csep.gendatatest.utils.Md5Util;

import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;



public abstract class AbstractTest {

	private String apiuser;
	private String apiusermd5;
	private String serverurl;
	private String encryptserverurl;
	private String snid;
	private String apptime;
	private String accountid;
	private String usertoken;
	private String position;
	private String appversion;

	protected Map<String, String> parameters = new LinkedHashMap<String, String>();
	protected String method;

	public void setParameter(String key, String value) {
		try {
			parameters.put(key, value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public AbstractTest(String serverurl, String encryptserverurl,
			String apiuser, String apiusermd5, String appversion,
			String accountid, String usertoken, String position) {
		this.serverurl = serverurl;
		this.encryptserverurl = encryptserverurl;
		this.apiuser = apiuser;
		this.apiusermd5 = apiusermd5;
		this.appversion = appversion;
		this.accountid = accountid;
		this.usertoken = usertoken;
		this.position = position;
		this.snid = String.valueOf(System.currentTimeMillis());
		this.apptime = String.valueOf(System.currentTimeMillis());
		parameters.put("apiuser", apiuser);
		parameters.put("snid", snid);
		parameters.put("apptime", apptime);
		parameters.put("appversion", appversion);
		parameters.put("appversion", appversion);
		parameters.put("position", position);
		parameters.put("accountid", accountid);
	}

	public AbstractTest(String method) {
		this(TestConfig.serverurl, TestConfig.encryptserverurl,
				TestConfig.apiuser, TestConfig.apiusermd5,
				TestConfig.appversion, TestConfig.accountid,
				TestConfig.usertoken, TestConfig.position);
		this.method = method;
	}

	public String doTest() throws Exception {
		String md5str = apiuser + snid + method + position + accountid
				+ usertoken + apiusermd5;
		String md5value = Md5Util.md5Encode(md5str);
		parameters.put("token", md5value);
		StringBuilder url = new StringBuilder(serverurl + "/" + method + "?");
		for (String key : parameters.keySet()) {
			String value = parameters.get(key);
			value = java.net.URLEncoder.encode(value, "utf-8");
			url.append(key).append("=").append(value).append("&");
		}
		url.deleteCharAt(url.length() - 1);
		java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) (new URL(
				url.toString()).openConnection());
		httpURLConnection.connect();
		java.io.BufferedReader bufferedReader = new java.io.BufferedReader(
				new java.io.InputStreamReader(
						httpURLConnection.getInputStream()));
		String str = bufferedReader.readLine();
		return str;
	}

	public String doEncryptTest() throws Exception {
		String md5str = apiuser + snid + method + position + accountid
				+ usertoken + apiusermd5;
		String md5value = Md5Util.md5Encode(md5str);
		parameters.put("token", md5value);
		StringBuilder url = new StringBuilder(method).append("?");
		for (String key : parameters.keySet()) {
			String value = parameters.get(key);
			value = new String(value.getBytes("utf-8"), "iso8859-1");
			url.append(key).append("=").append(value).append("&");
		}
		url.deleteCharAt(url.length() - 1);

		byte[] decodekey = TestConfig.KEY_3DESDECODE.getBytes();
		String queryStr3des = HexUtil.bytesToHexString(DESUtils.des3EncodeECB(decodekey,
				url.toString().getBytes("utf-8")));

		url = new StringBuilder(encryptserverurl + "/" + queryStr3des);
		java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) (new URL(
				url.toString()).openConnection());
		httpURLConnection.connect();
		java.io.BufferedReader bufferedReader = new java.io.BufferedReader(
				new java.io.InputStreamReader(
						httpURLConnection.getInputStream()));
		String str = bufferedReader.readLine();
//		EncryptObj obj = JsonUtil.toObject(str, EncryptObj.class);
//
//		byte[] encodekey = TestConfig.KEY_3DESENCODE.getBytes();
//		byte[] decode = DESUtils.des3DecodeECB(encodekey,
//				HexUtil.hexStringToByte(obj.getEncrypt()));
//		return new String(decode, "utf-8");

		return "";
	}
}
