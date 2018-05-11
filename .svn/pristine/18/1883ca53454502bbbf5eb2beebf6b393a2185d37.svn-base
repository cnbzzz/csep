package com.infore.csep.common.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.infore.csep.common.service.IJsWorker;
import com.infore.csep.pojo.entity.Factleach;
import com.infore.csep.pojo.entity.Factleachalarm;
import lombok.extern.slf4j.Slf4j;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;
import java.util.List;

/**
 * This file is part of csep Project
 * Created by cnbzzz (cnbzzz@126.com) on 2018/4/23 18:11
 * Copyright (c) 2018 github.com/cnbzzz
 */

@Slf4j
public class JsWorker {

    final static String JSON_STR = "{\"cout\":152,\"equipmentNo\":\"poiuytrewqlk\",\"equmID\":58,\"equmNum\":\"qwerasdfzxcv\",\"equmType\":40,\"factCln\":263,\"factCod\":152,\"factEsp\":263,\"factIn\":263,\"factNitr\":152,\"factNum\":12,\"factOut\":263,\"factPower\":263,\"factRunHour\":263,\"factSrc\":263,\"flagAll\":\"10101010010101011010101001010101101010100101010110101010010101011010101001010101101010100101010110101010010101011010101001010101101010100101010110101010010101011010101001010101101010100101010110101010010101011010101001010101\",\"id\":988621973930110977,\"plcComm\":3,\"reservV1\":152,\"reservV2\":152,\"reservV3\":152,\"reservV4\":152,\"reservV5\":152,\"reservV6\":152,\"revTime\":1524540819714,\"sysaEspBn\":152,\"sysaEspBy\":152,\"sysaHpumpHz\":152,\"sysaHpumpPos\":152,\"sysaHpumpPre\":152,\"sysaOpumpP\":152,\"sysaPosSandBp\":152,\"sysaPreSandBn\":152,\"sysaPreSandBp\":152,\"sysaPremBf\":152,\"sysaPremBn\":152,\"sysaPremBp\":152,\"sysaTemp\":152,\"sysbEspBn\":152,\"sysbHpumpHz\":152,\"sysbHpumpPos\":152,\"sysbPremBf\":152,\"sysbPremBn\":152,\"sysbTemp\":152,\"syspAcpumpHz\":152,\"syspAlpumpHz\":152,\"syspBufBl\":152,\"syspClnBl\":152,\"syspClnBy\":152,\"syspInBy\":152,\"syspSrcBl\":152,\"syspSrcBn\":152,\"syspSrcBy\":152}";

    public static void main(String[] args) {
        IJsWorker jsWorker = getJsWorker();
        Factleach factleach = JSONObject.parseObject(JSON_STR, Factleach.class);
        //执行指定的js方法
        List<Factleachalarm> list = jsWorker.gainFactleachalarmArray(factleach);
        System.out.println(list.size());//
    }

    public static IJsWorker getJsWorker() {
        IJsWorker jsWorker = null;
        //创建一个脚本引擎管理器
        ScriptEngineManager manager = new ScriptEngineManager();
        //获取一个指定的名称的脚本引擎
        ScriptEngine engine = manager.getEngineByName("js");

        String path = JsWorker.class.getResource("").getPath();
        try (FileReader reader = new FileReader(path + "worker.js")) {
            //获取当前类的所在目录的路径
            // FileReader的参数为所要执行的js文件的路径
            engine.eval(reader);
            if (engine instanceof Invocable) {
                Invocable invocable = (Invocable) engine;
                //从脚本引擎中返回一个给定接口的实现
                jsWorker = invocable.getInterface(IJsWorker.class);
//                Factleach factleach = JSONObject.parseObject(JSON_STR, Factleach.class);
//                //执行指定的js方法
//                List<Factleachalarm> list = jsWorker.gainFactleachalarmArray(factleach);
//                System.out.println(list.size());//
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
        return jsWorker;
    }

}
