package com.infore.csep.common.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.infore.csep.pojo.entity.Gpssewa;
import com.infore.csep.pojo.entity.Gpssewatime;
import com.infore.csep.pojo.mapper.GpssewatimeMapper;
import com.infore.csep.common.service.IGpssewatimeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bzzz
 * @since 2018-04-17
 */
@Service
public class GpssewatimeServiceImpl extends ServiceImpl<GpssewatimeMapper, Gpssewatime> implements IGpssewatimeService {

    @Override
    public List<Gpssewatime> findByFactNumAndEqumNum(String factNum, String equmNum){

        Wrapper<Gpssewatime> wrapper = new EntityWrapper<>();
        wrapper.eq("factNum", factNum);

        if(!equmNum.isEmpty()) {
            wrapper.eq("equmNum", equmNum);
        }


        return selectList(wrapper);
    }
}
