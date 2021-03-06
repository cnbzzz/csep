package com.infore.csep.common.service;

import com.infore.csep.pojo.entity.FactLeachHisHour;
import com.baomidou.mybatisplus.service.IService;
import com.infore.csep.pojo.entity.Factleachhis;

import java.util.Date;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author bzzz
 * @since 2018-04-17
 */
public interface IFactLeachHisHourService extends IService<FactLeachHisHour> ,IGenDataBaseService{

    List<Factleachhis> findFactleachhisByDate(Date beginDate, Date endDate);

    Factleachhis findOneByFactNumAndEqumNum(Integer factNum, String equmNum, Date beginTime, Date endTime);


    List<FactLeachHisHour> findByFactNumAndEqumNum(Integer factNum, String equmNum, Date beginTime, Date endTime);
}
