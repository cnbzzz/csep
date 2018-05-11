package com.infore.csep.etl.DBServiceTest;

import com.infore.csep.common.service.IFactLeachHisHourService;
import com.infore.csep.common.service.IFactleachhisService;
import com.infore.csep.pojo.entity.FactLeachHisHour;
import com.infore.csep.pojo.entity.Factleachhis;
import com.infore.csep.pojo.mapper.FactleachhisMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class FactLeachHisServiceTest {

    @Autowired
    private IFactleachhisService factleachhisService;


    private Integer genRamdomInt() {

        Random random = new Random();
        return random.nextInt(100);
    }

    private String genRamEqumNum() {
        Random random = new Random();
        int num = random.nextInt(5);
        return String.format("ZL%04d", num+1);
    }


    /**
     * 生成测试数据
     */
    @Test
    public void genTestData() {

        int nCnt =  5;
        for(int i = 0; i < nCnt ; i ++) {

            Factleachhis factleachhis= genPojo(i);
            factleachhisService.insert(factleachhis);
        }



    }


    private Factleachhis genPojo(Integer seq) {
        Factleachhis factLeachhis = new Factleachhis();

        factLeachhis.setCommand(100);
        factLeachhis.setRevTime(new Date());
        factLeachhis.setEqumSeq(seq);
        factLeachhis.setEqumID(1001L);
        factLeachhis.setEqumType(00);

        factLeachhis.setFactNum(001);
        factLeachhis.setEqumNum(genRamEqumNum());

        factLeachhis.setDataType(01);
        factLeachhis.setFlagAll("0101010101");

        factLeachhis.setSyspInBy(genRamdomInt());
        factLeachhis.setSyspSrcBy(genRamdomInt());
        factLeachhis.setSyspClnBy(genRamdomInt());
        factLeachhis.setSysaEspBy(genRamdomInt());
        factLeachhis.setSysaPreSandBp(genRamdomInt());
        factLeachhis.setSysaPosSandBp(genRamdomInt());
        factLeachhis.setSysaHpumpPre(genRamdomInt());
        factLeachhis.setSysaHpumpPos(genRamdomInt());
        factLeachhis.setSysaOpumpP(genRamdomInt());
        factLeachhis.setSysaPremBp(genRamdomInt());
        factLeachhis.setSysbHpumpPos(genRamdomInt());
        factLeachhis.setSyspSrcBl(genRamdomInt());
        factLeachhis.setSyspBufBl(genRamdomInt());
        factLeachhis.setSyspClnBl(genRamdomInt());
        factLeachhis.setSyspSrcBn(genRamdomInt());
        factLeachhis.setSysaPreSandBn(genRamdomInt());
        factLeachhis.setSysaPremBn(genRamdomInt());
        factLeachhis.setSysaEspBn(genRamdomInt());
        factLeachhis.setSysbPremBn(genRamdomInt());
        factLeachhis.setSysbEspBn(genRamdomInt());
        factLeachhis.setSysaPremBf(genRamdomInt());
        factLeachhis.setSysbPremBf(genRamdomInt());
        factLeachhis.setSysaTemp(genRamdomInt());
        factLeachhis.setSysbTemp(genRamdomInt());
        factLeachhis.setSysaHpumpHz(genRamdomInt());
        factLeachhis.setSysbHpumpHz(genRamdomInt());
        factLeachhis.setSyspAcpumpHz(genRamdomInt());
        factLeachhis.setSyspAlpumpHz(genRamdomInt());

        factLeachhis.setReservV1(genRamdomInt());
        factLeachhis.setReservV2(genRamdomInt());
        factLeachhis.setReservV3(genRamdomInt());

        factLeachhis.setFactRunHour(genRamdomInt());
        factLeachhis.setFactOut(genRamdomInt());
        factLeachhis.setFactPower(genRamdomInt());
        factLeachhis.setFactIn(genRamdomInt());
        factLeachhis.setFactSrc(genRamdomInt());
        factLeachhis.setFactEsp(genRamdomInt());
        factLeachhis.setFactCln(genRamdomInt());
        factLeachhis.setFactCod(genRamdomInt());
        factLeachhis.setFactNitr(genRamdomInt());

        factLeachhis.setReservV4(genRamdomInt());
        factLeachhis.setReservV5(genRamdomInt());
        factLeachhis.setReservV6(genRamdomInt());

        factLeachhis.setCout(genRamdomInt());
        factLeachhis.setEquipmentNo("EQ0001");
        factLeachhis.setPlcComm(1);

        return factLeachhis;
    }

}