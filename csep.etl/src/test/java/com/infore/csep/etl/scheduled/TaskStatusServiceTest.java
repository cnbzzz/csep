package com.infore.csep.etl.scheduled;

import com.infore.csep.common.constant.TaskTypeConstant;
import com.infore.csep.common.service.ITaskStatusService;
import com.infore.csep.pojo.entity.TaskStatus;
import javafx.concurrent.Task;
import lombok.extern.slf4j.Slf4j;
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
public class TaskStatusServiceTest {

    @Autowired
    private ITaskStatusService taskStatusService;

    @Test
    public void getTaskStatus() throws ParseException {

        TaskStatus taskStatus = taskStatusService.getTaskStatus("year", TaskTypeConstant.TASK_YEAR);
        taskStatusService.getTaskStatus("month", TaskTypeConstant.TASK_MONTH);
        taskStatusService.getTaskStatus("day", TaskTypeConstant.TASK_DAY);
        taskStatusService.getTaskStatus("hour", TaskTypeConstant.TASK_HOUR);

//        //重新设置一下时间
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date uTime = sdf.parse("2018-04-19 00:00:00");
//        taskStatus.setNextRunTime(uTime);
//
//        //更新纪录
//        taskStatusService.updateById(taskStatus);
    }



}