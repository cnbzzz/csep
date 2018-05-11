package com.infore.csep.common.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.infore.csep.common.constant.TaskTypeConstant;
import com.infore.csep.pojo.entity.TaskStatus;
import com.infore.csep.pojo.mapper.TaskStatusMapper;
import com.infore.csep.common.service.ITaskStatusService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bzzz
 * @since 2018-04-19
 */
@Service
@Slf4j
public class TaskStatusServiceImpl extends ServiceImpl<TaskStatusMapper, TaskStatus> implements ITaskStatusService {


    private Date genStartTime(int taskType) {
        Calendar now = Calendar.getInstance();

        switch (taskType) {

            case TaskTypeConstant.TASK_YEAR:
                now.set(Calendar.MONTH, 0);
                now.set(Calendar.DAY_OF_MONTH, 1);
                now.set(Calendar.HOUR_OF_DAY, 0);
                break;

            case TaskTypeConstant.TASK_MONTH:
                now.set(Calendar.DAY_OF_MONTH, 1);
                now.set(Calendar.HOUR_OF_DAY, 0);
                break;

            case TaskTypeConstant.TASK_DAY:
                now.set(Calendar.HOUR_OF_DAY, 0);
                break;

            case TaskTypeConstant.TASK_HOUR:

                break;


            default:
                log.error("error task type:{}", taskType);
                break;
        }


        now.set(Calendar.MINUTE , 0);
        now.set(Calendar.SECOND, 0);
        now.set(Calendar.MILLISECOND, 0);
        Date sTime = now.getTime();

        log.info("Start Time:{}", DateFormatUtils.format(sTime, "yyyy-MM-dd HH:mm:ss"));

        return sTime;
    }

    /**
     * 根据任务名获取任务状态，如果不存在，则生成一条
     * @param taskName
     * @return
     */
    @Override
    public TaskStatus getTaskStatus(String taskName, int taskType) {
        TaskStatus taskStatus = selectOne(new EntityWrapper<TaskStatus>().eq("taskName", taskName));

        if(taskStatus == null) {
            log.warn("taskStatus is null, insert a new one:{}", taskName);
            //如果纪录不存在，则插入一条
            taskStatus = new TaskStatus();
            taskStatus.setTaskName(taskName);
            taskStatus.setNextRunTime(genStartTime(taskType)); //TODO:时间初始化为当前时间有待考虑
            taskStatus.setUpdateTime(new Date());

            insert(taskStatus);

            //再查询一次
            taskStatus =  selectOne(new EntityWrapper<TaskStatus>().eq("taskName", taskName));
        }

        log.info("TaskStatus: {}", taskStatus);

        return taskStatus;
    }
}
