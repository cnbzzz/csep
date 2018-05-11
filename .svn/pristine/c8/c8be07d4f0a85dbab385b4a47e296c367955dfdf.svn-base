package com.infore.csep.etl.scheduled;

import com.infore.csep.common.service.IFactsewahishourService;
import com.infore.csep.common.service.IGpssewahishourService;
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

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class GpssewahishourServiceTest {

    @Autowired
    public IGpssewahishourService gpssewahishourService;


    @Test
    public void genData() throws ParseException {

        SimpleDateFormat simFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date bdate = simFormat.parse("2018-04-23 20:00:00");

        //增加1天
        Calendar cal = Calendar.getInstance();
        cal.setTime(bdate);
        cal.add(Calendar.HOUR_OF_DAY, 2);//
        Date edate = cal.getTime();

        gpssewahishourService.genData(bdate, edate);
    }
}