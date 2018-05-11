package com.infore.csep.common.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.infore.csep.pojo.entity.Factleachtime;
import com.infore.csep.pojo.mapper.FactleachtimeMapper;
import com.infore.csep.common.service.IFactleachtimeService;
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
public class FactleachtimeServiceImpl extends ServiceImpl<FactleachtimeMapper, Factleachtime> implements IFactleachtimeService {

    @Override
    public List<Factleachtime> findByFactNumAndEqumNum(String factNum, String equmNum){

        Wrapper<Factleachtime> wrapper = new EntityWrapper<>();
        wrapper.eq("factNum", factNum);

        if(!equmNum.isEmpty()) {
            wrapper.eq("equmNum", equmNum);
        }


        return selectList(wrapper);
    }
}
