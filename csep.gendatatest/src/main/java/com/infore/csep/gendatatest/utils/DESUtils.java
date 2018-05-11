package com.infore.csep.gendatatest.utils;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class DESUtils {
	public static void main(String[] args) throws Exception {
		byte[] key = new BASE64Decoder()
				.decodeBuffer("ed40065902934b4eb7f7bb12b20f1900");
		key = "ed40065902934b4eb7f7bb12b20f1900".getBytes();
		byte[] keyiv = { 1, 2, 3, 4, 5, 6, 7, 8 };

		byte[] data = "modifyfacility?facilityid=609&workstatus=0&facilitycode=TEST001&facilityname=%E6%B5%8B%E8%AF%95001&facilitytype=27&photourl=%2FImages%2Fcommon%2F2018%2Fcars%2F201801%2Fq20180109180844.png&positionaddress=%E6%B9%96%E5%8D%97%E7%9C%81%E9%95%BF%E6%B2%99%E5%B8%82%E5%B2%B3%E9%BA%93%E5%8C%BA%E6%9E%97%E8%AF%AD%E8%B7%AF279%E5%8F%B7%E9%9D%A0%E8%BF%91%E6%B9%96%E5%8D%97%E6%AD%A3%E4%B8%AD%E5%88%B6%E8%8D%AF%E6%9C%BA%E6%A2%B0%E6%9C%89%E9%99%90%E5%85%AC%E5%8F%B8&positionlon=112.95138090848924&positionlat=28.228193010256977&isfocus=1&isvideo=1&ispublic=0&isparking=0&parkingradius=&isbusinessstation=0&projectid=55&employerid=1&rfidtag=1000010100E20051420514017626600B37&remark=%E4%BD%8D%E4%BA%8E%E4%B8%AD%E8%81%94%E9%87%8D%E7%A7%91%E7%AC%AC%E4%BA%8C%E5%B7%A5%E4%B8%9A%E5%9B%AD%E5%8D%97%E9%97%A8&apiuser=appapi&position=112.95138090848924%2C28.228193010256977".getBytes("UTF-8");

		System.out.println("ECB加密解密");
		byte[] str3 = des3EncodeECB(key, data);
		byte[] str4 = des3DecodeECB(key, str3);
		System.out.println(new BASE64Encoder().encode(str3));
		System.out.println(new String(str4, "UTF-8"));
		String hexString = HexUtil.bytesToHexString(str3);
		byte[] str41 = des3DecodeECB(key, HexUtil.hexStringToByte(hexString));
		System.out.println(hexString);
		System.out.println(new String(str41, "UTF-8"));
		
		System.out.println("-----------------------------");
		System.out.println("CBC加密解密");
		byte[] str5 = des3EncodeCBC(key, keyiv, data);
		byte[] str6 = des3DecodeCBC(key, keyiv, str5);
		System.out.println(new BASE64Encoder().encode(str5));
		System.out.println(new String(str6, "UTF-8"));
	}

	/**
	 * ECB加密,不要IV
	 * 
	 * @param key
	 *            密钥
	 * @param data
	 *            明文
	 * @return Base64编码的密文
	 * @throws Exception
	 */
	public static byte[] des3EncodeECB(byte[] key, byte[] data)
			throws Exception {
		Key deskey = null;
		DESedeKeySpec spec = new DESedeKeySpec(key);
		SecretKeyFactory keyfactory = SecretKeyFactory.getInstance("desede");
		deskey = keyfactory.generateSecret(spec);
		Cipher cipher = Cipher.getInstance("desede" + "/ECB/PKCS5Padding");
		cipher.init(Cipher.ENCRYPT_MODE, deskey);
		byte[] bOut = cipher.doFinal(data);
		return bOut;
	}

	/**
	 * ECB解密,不要IV
	 * 
	 * @param key
	 *            密钥
	 * @param data
	 *            Base64编码的密文
	 * @return 明文
	 * @throws Exception
	 */
	public static byte[] des3DecodeECB(byte[] key, byte[] data)
			throws Exception {
		Key deskey = null;
		DESedeKeySpec spec = new DESedeKeySpec(key);
		SecretKeyFactory keyfactory = SecretKeyFactory.getInstance("desede");
		deskey = keyfactory.generateSecret(spec);
		Cipher cipher = Cipher.getInstance("desede" + "/ECB/PKCS5Padding");
		cipher.init(Cipher.DECRYPT_MODE, deskey);
		byte[] bOut = cipher.doFinal(data);
		return bOut;
	}

	/**
	 * CBC加密
	 * 
	 * @param key
	 *            密钥
	 * @param keyiv
	 *            IV
	 * @param data
	 *            明文
	 * @return Base64编码的密文
	 * @throws Exception
	 */
	public static byte[] des3EncodeCBC(byte[] key, byte[] keyiv, byte[] data)
			throws Exception {
		Key deskey = null;
		DESedeKeySpec spec = new DESedeKeySpec(key);
		SecretKeyFactory keyfactory = SecretKeyFactory.getInstance("desede");
		deskey = keyfactory.generateSecret(spec);
		Cipher cipher = Cipher.getInstance("desede" + "/CBC/PKCS5Padding");
		IvParameterSpec ips = new IvParameterSpec(keyiv);
		cipher.init(Cipher.ENCRYPT_MODE, deskey, ips);
		byte[] bOut = cipher.doFinal(data);
		return bOut;
	}

	/**
	 * CBC解密
	 * 
	 * @param key
	 *            密钥
	 * @param keyiv
	 *            IV
	 * @param data
	 *            Base64编码的密文
	 * @return 明文
	 * @throws Exception
	 */
	public static byte[] des3DecodeCBC(byte[] key, byte[] keyiv, byte[] data)
			throws Exception {
		Key deskey = null;
		DESedeKeySpec spec = new DESedeKeySpec(key);
		SecretKeyFactory keyfactory = SecretKeyFactory.getInstance("desede");
		deskey = keyfactory.generateSecret(spec);
		Cipher cipher = Cipher.getInstance("desede" + "/CBC/PKCS5Padding");
		IvParameterSpec ips = new IvParameterSpec(keyiv);
		cipher.init(Cipher.DECRYPT_MODE, deskey, ips);
		byte[] bOut = cipher.doFinal(data);
		return bOut;
	}
}
