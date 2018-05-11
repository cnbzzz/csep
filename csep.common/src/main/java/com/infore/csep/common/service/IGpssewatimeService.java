package com.infore.csep.common.service;

import com.infore.csep.pojo.entity.Gpssewatime;
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
public interface IGpssewatimeService extends IService<Gpssewatime> {

    List<Gpssewatime> findByFactNumAndEqumNum(String factNum, String equmNum);
}
