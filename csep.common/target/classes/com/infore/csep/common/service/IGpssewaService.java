package com.infore.csep.common.service;

import com.infore.csep.common.netty.dto.GpsSewaPack;
import com.infore.csep.pojo.entity.Gpssewa;
import com.baomidou.mybatisplus.service.IService;
import lombok.NonNull;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author bzzz
 * @since 2018-04-17
 */
public interface IGpssewaService extends IService<Gpssewa> {

    @Transactional(rollbackFor = Exception.class)
    boolean handle(@NonNull GpsSewaPack pack);
}
