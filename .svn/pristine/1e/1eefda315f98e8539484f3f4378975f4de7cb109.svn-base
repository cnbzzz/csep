package com.infore.csep.common.service;

import com.baomidou.mybatisplus.service.IService;
import com.infore.csep.pojo.entity.Gpssewahisday;
import com.infore.csep.pojo.entity.Gpssewahishour;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author bzzz
 * @since 2018-04-23
 */
public interface IGpssewahisdayService extends IService<Gpssewahisday>, IGenDataBaseService {

    Gpssewahishour findOneByFactNumAndEqumNum(String factNum, String equmNum, Date beginTime, Date endTime);


    List<Gpssewahisday> findByFactNumAndEqumNum(String factNum, String equmNum, Date beginTime, Date endTime);
}
