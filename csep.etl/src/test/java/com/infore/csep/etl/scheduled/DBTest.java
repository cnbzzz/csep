package com.infore.csep.etl.scheduled;

import com.infore.csep.pojo.entity.FactLeachHisHour;
import com.infore.csep.pojo.entity.Factleachhis;
import com.infore.csep.pojo.mapper.FactLeachHisHourMapper;
import com.infore.csep.pojo.mapper.FactleachhisMapper;
import com.infore.csep.common.service.IFactLeachHisHourService;
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


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DBTest {

    @Autowired
    private IFactLeachHisHourService iFactLeachHisHourService;

    @Autowired
    private FactleachhisMapper factleachhisMapper;

    @Autowired
    private FactLeachHisHourMapper factLeachHisHourMapper;

    @Test
    public void insertHour() {

        FactLeachHisHour factLeachHisHour = new FactLeachHisHour();

        Factleachhis factleachhis = new Factleachhis();
        factleachhis.setSyspInBy(8);

        BeanUtils.copyProperties(factleachhis, factLeachHisHour);

        iFactLeachHisHourService.insert(factLeachHisHour);

    }


    @Test
    public void findFactLeachByHour() throws ParseException {

        SimpleDateFormat simFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date bdate = simFormat.parse("2018-04-19 20:00:00");

        //增加两小时
        Calendar cal = Calendar.getInstance();
        cal.setTime(bdate);
        cal.add(Calendar.HOUR, 2);// 24小时制
        Date edate = cal.getTime();

        log.info("bDate:{} eDate:{}", DateFormatUtils.format(bdate, "yyyyMMdd HH:mm:ss"),
                DateFormatUtils.format(edate, "yyyyMMddd HH:mm:ss"));

        List<FactLeachHisHour> factLeachHisHour = factLeachHisHourMapper.findByTime(bdate, edate);

        for(FactLeachHisHour facthour: factLeachHisHour) {
            log.info("{}", facthour);
        }

    }


    @Test
    public void genHourRecord() throws ParseException {
        SimpleDateFormat simFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date bdate = simFormat.parse("2018-04-19 20:00:00");

        //增加两小时
        Calendar cal = Calendar.getInstance();
        cal.setTime(bdate);
        cal.add(Calendar.HOUR, 2);// 24小时制
        Date edate = cal.getTime();

        iFactLeachHisHourService.genData(bdate,edate);

    }


}