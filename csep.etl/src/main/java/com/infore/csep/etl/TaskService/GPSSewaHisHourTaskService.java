package com.infore.csep.etl.TaskService;

import com.infore.csep.common.service.IGpssewahishourService;
import com.infore.csep.etl.constant.TaskNameConstant;
import com.infore.csep.common.constant.TaskTypeConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by steven ma
 * 2018/4/19 14:31
 */
@Slf4j
@Service
public class GPSSewaHisHourTaskService extends BaseTaskService<IGpssewahishourService> {

    public GPSSewaHisHourTaskService() {
        setTask_name(TaskNameConstant.GPS_SEWA_HOUR); //任务名称
        setTaskType(TaskTypeConstant.TASK_HOUR); //任务类型
    }


}
