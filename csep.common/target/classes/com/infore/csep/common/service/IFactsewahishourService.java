package com.infore.csep.common.service;

import com.baomidou.mybatisplus.service.IService;
import com.infore.csep.pojo.entity.Factsewahis;
import com.infore.csep.pojo.entity.Factsewahishour;

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
public interface IFactsewahishourService extends IService<Factsewahishour>,IGenDataBaseService {

    Factsewahis findOneByFactNumAndEqumNum(Integer factNum, String equmNum, Date beginTime, Date endTime);


    List<Factsewahishour> findByFactNumAndEqumNum(Integer factNum, String equmNum, Date beginTime, Date endTime);
}
