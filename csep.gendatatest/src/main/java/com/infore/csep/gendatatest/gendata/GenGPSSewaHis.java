package com.infore.csep.gendatatest.gendata;

import com.infore.csep.common.service.IFactsewahisService;
import com.infore.csep.common.service.IGpssewahisService;
import com.infore.csep.pojo.entity.Factsewahis;
import com.infore.csep.pojo.entity.Gpssewahis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by steven ma
 * 2018/4/23 15:32
 */
@Component
public class GenGPSSewaHis {

    @Autowired
    private IGpssewahisService gpssewahisService;



    public Gpssewahis genOneRecord() {

        Date date = new Date();
        String timestamp = String.valueOf(date.getTime()/1000);

        Gpssewahis factsewahis = genPojo(Integer.parseInt(timestamp));

        gpssewahisService.insert(factsewahis);
        return factsewahis;

    }


    private Gpssewahis genPojo(Integer seq) {

        Gpssewahis gpssewahis = new Gpssewahis();

        gpssewahis.setCommand(3);
        gpssewahis.setRevTime(new Date());
        gpssewahis.setEqumSeq(seq);
        gpssewahis.setEqumID(3001L);
        gpssewahis.setEqumType(03);
//        gpssewahis.setFactNum("001");
//        gpssewahis.setEqumNum(GenUtil.genRamEqumNum());

        gpssewahis.setFactNum("12");
        gpssewahis.setEqumNum("ZL123456789A");



        gpssewahis.setValRunHour(GenUtil.genRamdomInt());
        gpssewahis.setValPower(GenUtil.genRamdomInt());
        gpssewahis.setValWal(GenUtil.genRamdomInt());
        gpssewahis.setAllFlag("1010101010101");
        gpssewahis.setValCln(GenUtil.genRamdomInt());
        gpssewahis.setValPip(GenUtil.genRamdomInt());
        gpssewahis.setValTankL(GenUtil.genRamdomInt());


        gpssewahis.setCount(GenUtil.genRamdomInt());


        return gpssewahis;
    }

}
