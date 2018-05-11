package com.infore.csep.pojo.mapper;

import com.infore.csep.pojo.entity.Factsewahisday;
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
public interface FactsewahisdayMapper extends BaseMapper<Factsewahisday> {

    List<Factsewahisday> findByTime(@Param("beginTime") Date beginTime, @Param("endTime")Date endTime);
}
