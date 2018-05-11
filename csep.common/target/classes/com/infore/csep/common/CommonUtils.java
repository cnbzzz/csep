package com.infore.csep.common;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.beanutils.converters.SqlDateConverter;
import org.apache.commons.lang3.time.DateUtils;

import java.lang.reflect.Field;
import java.util.*;

/**
 * This file is part of csep Project
 * Created by cnbzzz (cnbzzz@126.com) on 2018/3/28 15:26
 * Copyright (c) 2018 github.com/cnbzzz
 */
public class CommonUtils {


    public static String genRandomCode(int len) {
        int seed = (10 * len) - 1;
        Random random = new Random();
        int i = random.nextInt(seed);
        return String.format("%0" + len + "d", i);
    }


    //填充""到集合
    public static List<String> getFillFieldList(Class clazz, List<Integer> ignoreIndexList) {
        Field[] declaredFields = clazz.getDeclaredFields();

        List<String> fieldList = new ArrayList<>();
        for (int i = 3; i < declaredFields.length; i++) {
            Field field = declaredFields[i];
            String simpleName = field.getType().getSimpleName();
            if ("Integer".equals(simpleName)) {
                fieldList.add("\"" + field.getName() + "\"");
            }
        }

        for (int i = 0; i < ignoreIndexList.size(); i++) {
            Integer index = ignoreIndexList.get(i);
            if(index < fieldList.size())
                fieldList.add(index, "\"\"");
        }
        return fieldList;
    }

    //找出不连续的数
    public static List<Integer> findNotContnumlist(List<Integer> ascIntArr) {
        int size = ascIntArr.size();
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int j = i + 1;
            if (j == size) {
                continue;
            }
            Integer first = ascIntArr.get(i);
            Integer second = ascIntArr.get(j);
            int range = second - first;
            if (range > 1) {//不连续
                for (int m = 1; m < range; m++) {
                    numList.add(first + m);
                }
            }
        }
        return numList;
    }

    static {
        //处理时间格式
        ConvertUtils.register(new Converter() {
            @Override
            public <T> T convert(Class<T> aClass, Object o) {
                try{
                    System.err.println(aClass.getName() + "---" + o);
                    return (T)DateUtils.parseDate(o.toString(), Locale.US, new String[]{"yyyy-MM-dd", "yyyy/MM/dd", "yyyy-MM-dd HH:mm:ss", "yyyy/MM/dd HH:mm:ss", "E MMM dd hh:mm:ss z yyyy"});
                } catch (Exception e){
                    e.printStackTrace();
                }
                return null;
            }
        }, Date.class);
    }


}
