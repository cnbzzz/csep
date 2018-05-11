package com.infore.csep.gendatatest.gendata;

import com.infore.csep.common.service.IGpssewaService;
import com.infore.csep.pojo.entity.Gpssewa;
import com.infore.csep.pojo.entity.Gpssewahis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by steven ma
 * 2018/4/23 15:32
 */
@Component
public class GenGPSSewa {

    @Autowired
    private IGpssewaService gpssewaService;



    public Gpssewa genOneRecord() {

        Date date = new Date();
        String timestamp = String.valueOf(date.getTime()/1000);

        Gpssewa factsewahis = genPojo(Integer.parseInt(timestamp));

        gpssewaService.insert(factsewahis);
        return factsewahis;

    }


    private Gpssewa genPojo(Integer seq) {

        Gpssewa gpssewahis = new Gpssewa();

        //gpssewahis.setCommand(3);
        gpssewahis.setRevTime(new Date());
//        gpssewahis.setEqumSeq(seq);
//        gpssewahis.setEqumID(3001L);
        gpssewahis.setEqumType(03);
        gpssewahis.setFactNum("001");

        gpssewahis.setValRunHour(GenUtil.genRamdomInt());
        gpssewahis.setValPower(GenUtil.genRamdomInt());
        gpssewahis.setValWal(GenUtil.genRamdomInt());
        gpssewahis.setAllFlag("1010101010101");
        gpssewahis.setValCln(GenUtil.genRamdomInt());
        gpssewahis.setValPip(GenUtil.genRamdomInt());
        gpssewahis.setValTankL(GenUtil.genRamdomInt());

        gpssewahis.setEqumNum(GenUtil.genRamEqumNum());
        gpssewahis.setCount(GenUtil.genRamdomInt());


        return gpssewahis;
    }

}
