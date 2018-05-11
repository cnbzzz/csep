package com.infore.csep.pojo.mapper;

import com.infore.csep.pojo.entity.Gpssewahisday;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author bzzz
 * @since 2018-04-23
 */
public interface GpssewahisdayMapper extends BaseMapper<Gpssewahisday> {

    List<Gpssewahisday> findByTime(@Param("beginTime") Date beginTime, @Param("endTime") Date endTime);
}
