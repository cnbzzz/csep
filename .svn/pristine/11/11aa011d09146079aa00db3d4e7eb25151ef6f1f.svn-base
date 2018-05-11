package com.infore.csep.common.service;

import com.baomidou.mybatisplus.service.IService;
import com.infore.csep.pojo.entity.FactLeachHisHour;
import com.infore.csep.pojo.entity.Factleachhisday;

import java.util.Date;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author bzzz
 * @since 2018-04-21
 */
public interface IFactleachhisdayService extends IService<Factleachhisday>,IGenDataBaseService {

    FactLeachHisHour findOneByFactNumAndEqumNum(Integer factNum, String equmNum, Date beginTime, Date endTime);

    List<Factleachhisday> findByFactNumAndEqumNum(Integer factNum, String equmNum, Date beginTime, Date endTime);
}
