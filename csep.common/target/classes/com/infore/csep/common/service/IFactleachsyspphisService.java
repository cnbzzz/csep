package com.infore.csep.common.service;

import com.baomidou.mybatisplus.service.IService;
import com.infore.csep.common.netty.dto.FactleachSyspPPack;
import com.infore.csep.pojo.entity.Factleachsyspphis;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author bzzz
 * @since 2018-04-17
 */
public interface IFactleachsyspphisService extends IService<Factleachsyspphis> {

    boolean hander(FactleachSyspPPack pack);

}
