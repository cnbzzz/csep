package com.infore.csep.common.service;

import com.baomidou.mybatisplus.service.IService;
import com.infore.csep.common.netty.dto.FactleachSysbPPack;
import com.infore.csep.pojo.entity.Factleachsysbphis;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author bzzz
 * @since 2018-04-17
 */
public interface IFactleachsysbphisService extends IService<Factleachsysbphis> {

    boolean hander(FactleachSysbPPack pack);
}
