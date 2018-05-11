package com.infore.csep.common.service;

import com.baomidou.mybatisplus.service.IService;
import com.infore.csep.pojo.entity.Factsewahisday;
import com.infore.csep.pojo.entity.Factsewahishour;
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
public interface IFactsewahisdayService extends IService<Factsewahisday>, IGenDataBaseService {

    Factsewahishour findOneByFactNumAndEqumNum(Integer factNum, String equmNum, Date beginTime, Date endTime);


    List<Factsewahisday> findByFactNumAndEqumNum(Integer factNum, String equmNum, Date beginTime, Date endTime);
}
