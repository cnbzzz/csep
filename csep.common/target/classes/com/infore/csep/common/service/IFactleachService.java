package com.infore.csep.common.service;

import com.infore.csep.common.netty.dto.FactleachPack;
import com.infore.csep.pojo.entity.Factleach;
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
public interface IFactleachService extends IService<Factleach> {

    boolean handle(FactleachPack factleach);

    <T, H> void handleRuntime(Object runtimeBean, IService runTimeService, Class<T> runTimeClazz, List<String> runTimePropList, IService runTimeHisService, Class<H> runTimeHisClazz) throws Exception;

}
