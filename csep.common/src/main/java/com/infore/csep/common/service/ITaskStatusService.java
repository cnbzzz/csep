package com.infore.csep.common.service;

import com.infore.csep.pojo.entity.TaskStatus;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author bzzz
 * @since 2018-04-19
 */
public interface ITaskStatusService extends IService<TaskStatus> {

    TaskStatus getTaskStatus(String taskName, int taskType);
}
