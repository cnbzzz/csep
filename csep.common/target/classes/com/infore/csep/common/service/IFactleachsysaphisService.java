package com.infore.csep.common.service;

import com.baomidou.mybatisplus.service.IService;
import com.infore.csep.common.netty.dto.FactleachSysaPPack;
import com.infore.csep.pojo.entity.Factleachsysaphis;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author bzzz
 * @since 2018-04-17
 */
public interface IFactleachsysaphisService extends IService<Factleachsysaphis> {

    boolean hander(FactleachSysaPPack pack);

}
