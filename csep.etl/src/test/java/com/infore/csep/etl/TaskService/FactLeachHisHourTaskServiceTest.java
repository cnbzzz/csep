package com.infore.csep.etl.TaskService;

import com.infore.csep.common.constant.TaskTypeConstant;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class FactLeachHisHourTaskServiceTest {

    @Autowired
    private FactLeachHisHourTaskService factLeachHisHourTaskService;

    @Autowired
    private FactSewaHisHourTaskService factSewaHisHourTaskService;

    @Autowired
    private GPSSewaHisHourTaskService gpsSewaHisHourTaskService;


    @Test
    public void calcEndTime() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date bDate;
        Date eDate;

        String strbDate = "2020-01-31 01:00:00";
        bDate = sdf.parse(strbDate);

        factLeachHisHourTaskService.setTaskType(TaskTypeConstant.TASK_MONTH);
        eDate = factLeachHisHourTaskService.calcEndTime(bDate);
        log.info("begin: {}, end: {}", DateFormatUtils.format(bDate, "yyyyMMdd HH:mm:ss"),
                DateFormatUtils.format(eDate, "yyyyMMdd HH:mm:ss"));

    }


    @Test
    public void genDateByBeginTime() throws ParseException {

        //设置开始时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String beginDate = "2018-04-19 01:00:00";
        Date beginTaskTime = sdf.parse(beginDate);


       // Date stopTaskTime = new Date();

        String stopDate = "2018-04-19 04:00:00";
        Date stopTaskTime = sdf.parse(stopDate);

        factLeachHisHourTaskService.runTask(stopTaskTime);

//        while (nextBDate != null) {
//            //获取下次启动时间(正式情况下应该从数据库获取)
//            nextBDate = factLeachHisHourTaskService.genDateByBeginTime(nextBDate, new Date());
//        }
    }

    @Test
    public void runTask() throws ParseException {

        //设置开始时间
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String beginDate = "2018-04-19 01:00:00";
//        Date beginTaskTime = sdf.parse(beginDate);

        factLeachHisHourTaskService.runTask();
        factSewaHisHourTaskService.runTask();
        gpsSewaHisHourTaskService.runTask();
    }

}