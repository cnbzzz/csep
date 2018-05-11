package com.infore.csep.gendatatest.gendata;

import com.infore.csep.common.service.IFactsewahisService;
import com.infore.csep.pojo.entity.Factsewahis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by steven ma
 * 2018/4/23 15:32
 */
@Component
public class GenFactSewaHis {

    @Autowired
    private IFactsewahisService factsewahisService;



    public Factsewahis genOneRecord() {

        Date date = new Date();
        String timestamp = String.valueOf(date.getTime()/1000);

        Factsewahis factsewahis = genPojo(Integer.parseInt(timestamp));

        factsewahisService.insert(factsewahis);
        return factsewahis;

    }


    private Factsewahis genPojo(Integer seq) {

        Factsewahis factsewahis = new Factsewahis();

        factsewahis.setCommand(2);
        factsewahis.setRevTime(new Date());
        factsewahis.setEqumSeq(seq);
        factsewahis.setEqumID(2001L);
        factsewahis.setEqumType(01);

//        factsewahis.setFactNum(002);
//        factsewahis.setEqumNum(GenUtil.genRamEqumNum());

        factsewahis.setFactNum(12);
        factsewahis.setEqumNum("ZL123456789A");


        factsewahis.setDataType(007);

        factsewahis.setValCod(GenUtil.genRamdomInt());
        factsewahis.setValNitr(GenUtil.genRamdomInt());
        factsewahis.setValNih(GenUtil.genRamdomInt());
        factsewahis.setValPho(GenUtil.genRamdomInt());
        factsewahis.setValOutss(GenUtil.genRamdomInt());
        factsewahis.setValOutBy(GenUtil.genRamdomInt());
        factsewahis.setValOutTemp(GenUtil.genRamdomInt());
        factsewahis.setValRuntime(GenUtil.genRamdomInt());
        factsewahis.setValSrc(GenUtil.genRamdomInt());
        factsewahis.setValPowpt(GenUtil.genRamdomInt());
        factsewahis.setValPower(GenUtil.genRamdomInt());


        factsewahis.setValMBR1(GenUtil.genRamdomInt());
        factsewahis.setValMBR2(GenUtil.genRamdomInt());
        factsewahis.setValMBR3(GenUtil.genRamdomInt());
        factsewahis.setValMBR4(GenUtil.genRamdomInt());
        factsewahis.setValMBR5(GenUtil.genRamdomInt());
        factsewahis.setValMBR6(GenUtil.genRamdomInt());
        factsewahis.setValMBR7(GenUtil.genRamdomInt());
        factsewahis.setValMBR8(GenUtil.genRamdomInt());
        factsewahis.setValMBR9(GenUtil.genRamdomInt());
        factsewahis.setValMBR10(GenUtil.genRamdomInt());

        factsewahis.setValMBRsum1(GenUtil.genRamdomInt());
        factsewahis.setValMBRsum2(GenUtil.genRamdomInt());
        factsewahis.setValMBRsum3(GenUtil.genRamdomInt());
        factsewahis.setValMBRsum4(GenUtil.genRamdomInt());
        factsewahis.setValMBRsum5(GenUtil.genRamdomInt());
        factsewahis.setValMBRsum6(GenUtil.genRamdomInt());
        factsewahis.setValMBRsum7(GenUtil.genRamdomInt());
        factsewahis.setValMBRsum8(GenUtil.genRamdomInt());
        factsewahis.setValMBRsum9(GenUtil.genRamdomInt());
        factsewahis.setValMBRsum10(GenUtil.genRamdomInt());

        factsewahis.setAllFlag("1010101010101");
        factsewahis.setValInBL(GenUtil.genRamdomInt());
        factsewahis.setValPoolBL(GenUtil.genRamdomInt());
        factsewahis.setValSandBL(GenUtil.genRamdomInt());
        factsewahis.setValSdgBL(GenUtil.genRamdomInt());
        factsewahis.setCount(GenUtil.genRamdomInt());


        return factsewahis;
    }

}
