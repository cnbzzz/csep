package com.infore.csep.gendatatest.gendata;

import com.infore.csep.common.service.IFactleachService;
import com.infore.csep.common.service.IFactleachhisService;
import com.infore.csep.pojo.entity.Factleach;
import com.infore.csep.pojo.entity.Factleachhis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by steven ma
 * 2018/4/20 17:46
 */
@Component
public class GenFactLeach {

    @Autowired
    private IFactleachService factleachService;





    /**
     * 生成测试数据
     */
    public void genTestData() {

        int nCnt =  5;
        for(int i = 0; i < nCnt ; i ++) {

            Factleach factleach= genPojo(i);
            factleachService.insert(factleach);
        }

    }

    //生成一条测试数据
    public Factleach genOneRecord() {

        Date date = new Date();
        String timestamp = String.valueOf(date.getTime()/1000);

        Factleach factleach = genPojo(Integer.parseInt(timestamp));
        factleachService.insert(factleach);

        return factleach;
    }


    private Factleach genPojo(Integer seq) {
        Factleach factleach = new Factleach();

        //factleach.setCommand(100);
        factleach.setRevTime(new Date());
        //factleach.setEqumSeq(seq);
        factleach.setEqumID(1001L);
        factleach.setEqumType(00);

//        factleach.setFactNum(001);
//        factleach.setEqumNum(GenUtil.genRamEqumNum());

        factleach.setFactNum(12);
        factleach.setEqumNum("ZL123456789A");



        //factleach.setDataType(01);
        factleach.setFlagAll("0101010101");

        factleach.setSyspInBy(GenUtil.genRamdomInt());
        factleach.setSyspSrcBy(GenUtil.genRamdomInt());
        factleach.setSyspClnBy(GenUtil.genRamdomInt());
        factleach.setSysaEspBy(GenUtil.genRamdomInt());
        factleach.setSysaPreSandBp(GenUtil.genRamdomInt());
        factleach.setSysaPosSandBp(GenUtil.genRamdomInt());
        factleach.setSysaHpumpPre(GenUtil.genRamdomInt());
        factleach.setSysaHpumpPos(GenUtil.genRamdomInt());
        factleach.setSysaOpumpP(GenUtil.genRamdomInt());
        factleach.setSysaPremBp(GenUtil.genRamdomInt());
        factleach.setSysbHpumpPos(GenUtil.genRamdomInt());
        factleach.setSyspSrcBl(GenUtil.genRamdomInt());
        factleach.setSyspBufBl(GenUtil.genRamdomInt());
        factleach.setSyspClnBl(GenUtil.genRamdomInt());
        factleach.setSyspSrcBn(GenUtil.genRamdomInt());
        factleach.setSysaPreSandBn(GenUtil.genRamdomInt());
        factleach.setSysaPremBn(GenUtil.genRamdomInt());
        factleach.setSysaEspBn(GenUtil.genRamdomInt());
        factleach.setSysbPremBn(GenUtil.genRamdomInt());
        factleach.setSysbEspBn(GenUtil.genRamdomInt());
        factleach.setSysaPremBf(GenUtil.genRamdomInt());
        factleach.setSysbPremBf(GenUtil.genRamdomInt());
        factleach.setSysaTemp(GenUtil.genRamdomInt());
        factleach.setSysbTemp(GenUtil.genRamdomInt());
        factleach.setSysaHpumpHz(GenUtil.genRamdomInt());
        factleach.setSysbHpumpHz(GenUtil.genRamdomInt());
        factleach.setSyspAcpumpHz(GenUtil.genRamdomInt());
        factleach.setSyspAlpumpHz(GenUtil.genRamdomInt());

        factleach.setReservV1(GenUtil.genRamdomInt());
        factleach.setReservV2(GenUtil.genRamdomInt());
        factleach.setReservV3(GenUtil.genRamdomInt());

        factleach.setFactRunHour(GenUtil.genRamdomInt());
        factleach.setFactOut(GenUtil.genRamdomInt());
        factleach.setFactPower(GenUtil.genRamdomInt());
        factleach.setFactIn(GenUtil.genRamdomInt());
        factleach.setFactSrc(GenUtil.genRamdomInt());
        factleach.setFactEsp(GenUtil.genRamdomInt());
        factleach.setFactCln(GenUtil.genRamdomInt());
        factleach.setFactCod(GenUtil.genRamdomInt());
        factleach.setFactNitr(GenUtil.genRamdomInt());

        factleach.setReservV4(GenUtil.genRamdomInt());
        factleach.setReservV5(GenUtil.genRamdomInt());
        factleach.setReservV6(GenUtil.genRamdomInt());

        factleach.setCout(GenUtil.genRamdomInt());
        factleach.setEquipmentNo("EQ0001");
        factleach.setPlcComm(1);

        return factleach;
    }
}
