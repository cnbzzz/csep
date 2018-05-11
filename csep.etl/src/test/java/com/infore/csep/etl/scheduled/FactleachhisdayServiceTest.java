package com.infore.csep.etl.scheduled;

import com.infore.csep.common.service.IFactLeachHisHourService;
import com.infore.csep.common.service.IFactleachhisdayService;
import com.infore.csep.common.service.impl.FactleachhisdayServiceImpl;
import com.infore.csep.pojo.entity.Factleachhis;
import com.infore.csep.pojo.entity.Factleachhisday;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class FactleachhisdayServiceTest {

    @Autowired
    public IFactleachhisdayService  factleachhisdayService;


    @Test
    public void genData() throws ParseException {

        SimpleDateFormat simFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date bdate = simFormat.parse("2018-04-21 00:00:00");

        //增加1天
        Calendar cal = Calendar.getInstance();
        cal.setTime(bdate);
        cal.add(Calendar.DAY_OF_MONTH, 1);//
        Date edate = cal.getTime();

        factleachhisdayService.genData(bdate, edate);
    }
}