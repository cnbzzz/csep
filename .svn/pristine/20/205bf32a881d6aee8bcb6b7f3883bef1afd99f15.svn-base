package com.infore.csep.common.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.google.common.base.Joiner;
import com.infore.csep.common.ByteUtils;
import com.infore.csep.common.CommonUtils;
import com.infore.csep.common.netty.dto.FactSewaPack;
import com.infore.csep.common.service.*;
import com.infore.csep.pojo.entity.*;
import com.infore.csep.pojo.mapper.FactsewaMapper;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author bzzz
 * @since 2018-04-17
 */
@Service
@Slf4j
public class FactsewaServiceImpl extends ServiceImpl<FactsewaMapper, Factsewa> implements IFactsewaService {

    @Autowired
    private IFactsewahisService factsewahisService;

    @Autowired
    private IFactsewatimeService factsewatimeService;

    @Autowired
    private IFactsewarunhisService factsewarunhisService;

    @Autowired
    private IFactleachService factleachService;

    @Autowired
    private IFactsewaalarmService factsewaalarmService;

    @Transactional(rollbackFor = Exception.class)
    public boolean hander(@NonNull FactSewaPack pack) {
        boolean result = true;

        try {
            Factsewa factsewa = handleFactsewa(pack);

            handleFactsewahis(pack, factsewa);

            factleachService.handleRuntime(factsewa, factsewatimeService, Factsewatime.class, PROP_NAME_LIST, factsewarunhisService, Factsewarunhis.class);

            handleFactsewaAlarm(factsewa);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new RuntimeException(e.getMessage(), e);
        }
        return result;
    }

    private Factsewahis handleFactsewahis(@NonNull FactSewaPack pack, @NonNull Factsewa factsewa) throws Exception {
        Factsewahis factsewahis = new Factsewahis();
        BeanUtils.copyProperties(factsewahis, factsewa);

        factsewahis.setId(null); //必须重置才会再生成
        factsewahis.setCommand(pack.getCommand());
        factsewahis.setDataType(pack.getDataType());
        factsewahis.setEqumSeq(pack.getEqumSeq());
        factsewahisService.insert(factsewahis);
        return factsewahis;
    }

    private Factsewa handleFactsewa(@NonNull FactSewaPack pack) throws Exception {
        Factsewa factsewa = new Factsewa();
        BeanUtils.copyProperties(factsewa, pack);

        StringBuilder sb = new StringBuilder();
        byte[] bytes = pack.getAllFlag();
        for (int i = 0; i < bytes.length; i++) {
            sb.append(ByteUtils.byteToBit(bytes[i]));
        }
        String allFlag = sb.toString();
        factsewa.setAllFlag(allFlag);

        Integer factNum = pack.getFactNum();
        String equmNum = pack.getEqumNum();
        Wrapper condition = new EntityWrapper<Factsewa>().eq("factNum", factNum).eq("equmNum", equmNum);
        Factsewa one = selectOne(condition);
        if (one == null) {
            insert(factsewa);
        } else {
            factsewa.setId(one.getId());
            updateById(factsewa);
            //update(factsewa, condition);
        }
        return factsewa;
    }

    private void handleFactsewaAlarm(Factsewa factsewa) {
        IJsWorker jsWorker = JsWorker.getJsWorker();
        List<Factsewaalarm> list = jsWorker.gainFactsewaalarmArray(factsewa);

        factsewaalarmService.insertBatch(list);
    }


    private List<String> PROP_NAME_LIST = Arrays.asList("valMan", "valAuto", "setMan", "setAuto", "setBoot", "setStop", "setTerm", "setRest", "setLock", "", "", "", "", "", "", "valHalt", "valReclnRem1", "valReclnMan1", "valReclnFb1", "valReclnFa1", "valReclnRem2", "valReclnMan2", "valReclnFb2", "valReclnFa2", "valPipumpRem1", "valPipumpMan1", "valPipumpFb1", "valPipumpFa1", "valPipumpRem2", "valPipumpMan2", "valPipumpFb2", "valPipumpFa2", "valConvRem", "valConvMan", "valConvFb", "valConvFa", "valSplRem", "valSplMan", "valSplFb", "valSplFa", "valAgitRem", "valAgitMan", "valAgitFb", "valAgitFa", "valSdgPumpRem", "valSdgPumpMan", "valSdgPumpFb", "valSdgPumpFa", "valSubPumpRem1", "valSubPumpMan1", "valSubPumpFb1", "valSubPumpFa1", "valSubPumpRem2", "valSubPumpMan2", "valSubPumpFb2", "valSubPumpFa2", "valSubPumpRem3", "valSubPumpMan3", "valSubPumpFb3", "valSubPumpFa3", "valFltRem", "valFltMan", "valFltFb", "valFltFa", "valRwPumpRem", "valRwPumpMan", "valRwPumpFb", "valRwPumpFa", "valAcRem", "valAcMan", "valAlRem", "valAlMan", "valPACagRem", "valPACagMan", "valPACagFb", "valPACagFa", "valPACpRem", "valPACpMan", "valPACpFb", "valPACpFa", "valRwQRem1", "valRwQMan1", "valRwQO1", "valRwQC1", "valRwQRem2", "valRwQMan2", "valRwQO2", "valRwQC2", "valRwORem3", "valRwQMan3", "valRwQO3", "valRwQC3", "", "", "", "", "valRwInQRem", "valRwInQMan", "valPACInQRem", "valPACInQMan", "", "", "", "", "valRwBLl", "valRwBLh", "valPACBLl", "valPACBLh", "", "", "", "", "", "", "", "", "", "", "", "", "setRecln1", "setRecln2", "setPiPump1", "setPiPump2", "setConv", "setSpl", "setAgit", "setSdgPump", "setSubPump1", "setSubPump2", "setSubPump3", "setFlt", "setRwPump", "setAc", "setAl", "setPACag", "setPACp", "", "", "", "", "", "", "", "setRwQO1", "setRwQC1", "setRwQO2", "setRwQC2", "setRwQO3", "setRwQC3", "setRwInQO", "setPACInQO", "", "", "", "", "", "", "", "", "valReclnF1", "valReclnF2", "valPiPumpF1", "valPiPumpF2", "valConvF", "valSplF", "valAgitF", "valSdgPumpF", "valSubPumpF1", "valSubPumpF2", "valSubPumpF3", "valFltF", "valRwPumpF", "valAcF", "valAlF", "valPACagF", "valPACpF", "valRwQF1", "valRwQF2", "valRwQF3", "valRwInQF", "valPACInQF");

    public static void main(String[] args) {
        List<Integer> ascIntArr = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 96, 97, 98, 99, 104, 105, 106, 107, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 144, 145, 146, 147, 148, 149, 150, 151, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181);
        List<Integer> ignoreIndexList = CommonUtils.findNotContnumlist(ascIntArr);
        System.err.println(Joiner.on(",").join(ignoreIndexList));
        List<String> fieldList = CommonUtils.getFillFieldList(Factsewatime.class, ignoreIndexList);
        System.err.println(fieldList.size());
        System.err.println(Joiner.on(", ").join(fieldList));



    }

}
