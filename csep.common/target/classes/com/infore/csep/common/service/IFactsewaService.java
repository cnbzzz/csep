package com.infore.csep.common.service;

import com.infore.csep.common.netty.dto.FactSewaPack;
import com.infore.csep.pojo.entity.Factsewa;
import com.baomidou.mybatisplus.service.IService;
import lombok.NonNull;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author bzzz
 * @since 2018-04-17
 */
public interface IFactsewaService extends IService<Factsewa> {

    boolean hander(@NonNull FactSewaPack pack);

}
