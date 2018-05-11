package com.infore.csep.pojo.entity;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author bzzz
 * @since 2018-04-19
 */
@TableName("task_status")
public class TaskStatus extends Model<TaskStatus> {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String taskName;
    private Date nextRunTime;
    private Date updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Date getNextRunTime() {
        return nextRunTime;
    }

    public void setNextRunTime(Date nextRunTime) {
        this.nextRunTime = nextRunTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TaskStatus{" +
        "id=" + id +
        ", taskName=" + taskName +
        ", nextRunTime=" + nextRunTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
