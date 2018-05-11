package com.infore.csep.common.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.infore.csep.pojo.entity.Factsewatime;
import com.infore.csep.pojo.mapper.FactsewatimeMapper;
import com.infore.csep.common.service.IFactsewatimeService;
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
public class FactsewatimeServiceImpl extends ServiceImpl<FactsewatimeMapper, Factsewatime> implements IFactsewatimeService {

    @Override
    public List<Factsewatime> findByFactNumAndEqumNum(String factNum, String equmNum){

        Wrapper<Factsewatime> wrapper = new EntityWrapper<>();
        wrapper.eq("factNum", factNum);

        if(!equmNum.isEmpty()) {
            wrapper.eq("equmNum", equmNum);
        }


        return selectList(wrapper);
    }
}
