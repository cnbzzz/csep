package com.infore.csep.etl.TaskService;

import com.infore.csep.common.constant.TaskTypeConstant;
import com.infore.csep.common.service.IFactLeachHisHourService;
import com.infore.csep.common.service.IFactleachhisdayService;
import com.infore.csep.common.service.IGpssewahishourService;
import com.infore.csep.etl.constant.TaskNameConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by steven ma
 * 2018/4/19 10:30
 */

/**
 * 生成“渗滤液工况日表”数据的业务逻辑
 */
@Service
@Slf4j
public class FactLeachHisDayTaskService extends BaseTaskService<IFactleachhisdayService>{



    public FactLeachHisDayTaskService() {
        setTask_name(TaskNameConstant.FACT_LEACH_DAY); //任务名称
        setTaskType(TaskTypeConstant.TASK_DAY); //任务类型
    }





}
