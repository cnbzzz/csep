package com.infore.csep.gendatatest.gendata;

import com.infore.csep.common.service.IFactleachhisService;
import com.infore.csep.pojo.entity.Factleachhis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Random;

/**
 * Created by steven ma
 * 2018/4/20 17:46
 */
@Component
public class GenFactLeachHis {

    @Autowired
    private IFactleachhisService factleachhisService;





    /**
     * 生成测试数据
     */
    public void genTestData() {

        int nCnt =  5;
        for(int i = 0; i < nCnt ; i ++) {

            Factleachhis factleachhis= genPojo(i);
            factleachhisService.insert(factleachhis);
        }

    }

    //生成一条测试数据
    public Factleachhis genOneRecord() {

        Date date = new Date();
        String timestamp = String.valueOf(date.getTime()/1000);

        Factleachhis factleachhis = genPojo(Integer.parseInt(timestamp));
        factleachhisService.insert(factleachhis);

        return factleachhis;
    }


    private Factleachhis genPojo(Integer seq) {
        Factleachhis factLeachhis = new Factleachhis();

        factLeachhis.setCommand(100);
        factLeachhis.setRevTime(new Date());
        factLeachhis.setEqumSeq(seq);
        factLeachhis.setEqumID(1001L);
        factLeachhis.setEqumType(00);

//        factLeachhis.setFactNum(001);
//        factLeachhis.setEqumNum(GenUtil.genRamEqumNum());

        factLeachhis.setFactNum(12);
        factLeachhis.setEqumNum("ZL123456789A");

        factLeachhis.setDataType(01);
        factLeachhis.setFlagAll("0101010101");

        factLeachhis.setSyspInBy(GenUtil.genRamdomInt());
        factLeachhis.setSyspSrcBy(GenUtil.genRamdomInt());
        factLeachhis.setSyspClnBy(GenUtil.genRamdomInt());
        factLeachhis.setSysaEspBy(GenUtil.genRamdomInt());
        factLeachhis.setSysaPreSandBp(GenUtil.genRamdomInt());
        factLeachhis.setSysaPosSandBp(GenUtil.genRamdomInt());
        factLeachhis.setSysaHpumpPre(GenUtil.genRamdomInt());
        factLeachhis.setSysaHpumpPos(GenUtil.genRamdomInt());
        factLeachhis.setSysaOpumpP(GenUtil.genRamdomInt());
        factLeachhis.setSysaPremBp(GenUtil.genRamdomInt());
        factLeachhis.setSysbHpumpPos(GenUtil.genRamdomInt());
        factLeachhis.setSyspSrcBl(GenUtil.genRamdomInt());
        factLeachhis.setSyspBufBl(GenUtil.genRamdomInt());
        factLeachhis.setSyspClnBl(GenUtil.genRamdomInt());
        factLeachhis.setSyspSrcBn(GenUtil.genRamdomInt());
        factLeachhis.setSysaPreSandBn(GenUtil.genRamdomInt());
        factLeachhis.setSysaPremBn(GenUtil.genRamdomInt());
        factLeachhis.setSysaEspBn(GenUtil.genRamdomInt());
        factLeachhis.setSysbPremBn(GenUtil.genRamdomInt());
        factLeachhis.setSysbEspBn(GenUtil.genRamdomInt());
        factLeachhis.setSysaPremBf(GenUtil.genRamdomInt());
        factLeachhis.setSysbPremBf(GenUtil.genRamdomInt());
        factLeachhis.setSysaTemp(GenUtil.genRamdomInt());
        factLeachhis.setSysbTemp(GenUtil.genRamdomInt());
        factLeachhis.setSysaHpumpHz(GenUtil.genRamdomInt());
        factLeachhis.setSysbHpumpHz(GenUtil.genRamdomInt());
        factLeachhis.setSyspAcpumpHz(GenUtil.genRamdomInt());
        factLeachhis.setSyspAlpumpHz(GenUtil.genRamdomInt());

        factLeachhis.setReservV1(GenUtil.genRamdomInt());
        factLeachhis.setReservV2(GenUtil.genRamdomInt());
        factLeachhis.setReservV3(GenUtil.genRamdomInt());

        factLeachhis.setFactRunHour(GenUtil.genRamdomInt());
        factLeachhis.setFactOut(GenUtil.genRamdomInt());
        factLeachhis.setFactPower(GenUtil.genRamdomInt());
        factLeachhis.setFactIn(GenUtil.genRamdomInt());
        factLeachhis.setFactSrc(GenUtil.genRamdomInt());
        factLeachhis.setFactEsp(GenUtil.genRamdomInt());
        factLeachhis.setFactCln(GenUtil.genRamdomInt());
        factLeachhis.setFactCod(GenUtil.genRamdomInt());
        factLeachhis.setFactNitr(GenUtil.genRamdomInt());

        factLeachhis.setReservV4(GenUtil.genRamdomInt());
        factLeachhis.setReservV5(GenUtil.genRamdomInt());
        factLeachhis.setReservV6(GenUtil.genRamdomInt());

        factLeachhis.setCout(GenUtil.genRamdomInt());
        factLeachhis.setEquipmentNo("EQ0001");
        factLeachhis.setPlcComm(1);

        return factLeachhis;
    }
}
