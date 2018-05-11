package com.infore.csep.pojo.mapper;

import com.infore.csep.pojo.entity.Factleachhisday;
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
 * @since 2018-04-21
 */
public interface FactleachhisdayMapper extends BaseMapper<Factleachhisday> {

    List<Factleachhisday> findByTime(@Param("beginDate")Date beginDate,
                                     @Param("endDate")Date endDate);

}
