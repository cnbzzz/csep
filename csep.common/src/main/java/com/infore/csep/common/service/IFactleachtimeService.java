package com.infore.csep.common.service;

import com.infore.csep.pojo.entity.Factleachtime;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author bzzz
 * @since 2018-04-17
 */
public interface IFactleachtimeService extends IService<Factleachtime> {

    List<Factleachtime> findByFactNumAndEqumNum(String factNum, String equmNum);
}
