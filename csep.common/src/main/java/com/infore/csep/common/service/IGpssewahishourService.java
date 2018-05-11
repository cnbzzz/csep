package com.infore.csep.common.service;

import com.baomidou.mybatisplus.service.IService;
import com.infore.csep.pojo.entity.Gpssewahis;
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
public interface IGpssewahishourService extends IService<Gpssewahishour> , IGenDataBaseService {


    Gpssewahis findOneByFactNumAndEqumNum(String factNum, String equmNum, Date beginTime, Date endTime);


    List<Gpssewahishour> findByFactNumAndEqumNum(String factNum, String equmNum, Date beginTime, Date endTime);
}
