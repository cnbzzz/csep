package com.infore.csep.gendatatest.utils;

import sun.misc.BASE64Encoder;

import java.security.MessageDigest;

/**
 * This file is part of bsd Project
 * Created by bzzz (bzzz@space-walker.cn) on 2017/10/25 15:07
 * Copyright (c) 2017 www.space-walker.cn
 */
public class Md5Util {

    public static String md5Encode(String str) throws Exception {
        //确定计算方法
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        BASE64Encoder base64en = new BASE64Encoder();
        //加密后的字符串
        //String newstr = base64en.encode(md5.digest(str.getBytes("utf-8")));
        String newstr = HexUtil.bytesToHexString(md5.digest(str.getBytes("utf-8")));

        return newstr;
    }

    public static void main(String[] args) throws Exception {
        String json = "\"data\":[{\"lac\" : \"9800\", \"ci\" : \"24533\", \"time\" : \"2017-12-31 00:00:01\"},{\"lac\" : \"9533\", \"ci\" : \"16605\", \"time\" : \"2017-12-31 00:00:02\"},{\"lac\" : \"1053\", \"ci\" : \"56587\", \"time\" : \"2017-12-31 00:00:03\"}]";
        String str = md5Encode(json);
        System.err.println(str);
    }
}