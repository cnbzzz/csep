package com.infore.csep.common.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.infore.csep.common.netty.dto.FactleachSyspPPack;
import com.infore.csep.common.service.IFactleachparamService;
import com.infore.csep.pojo.entity.Factleachparam;
import com.infore.csep.pojo.entity.Factleachsyspphis;
import com.infore.csep.pojo.mapper.FactleachsyspphisMapper;
import com.infore.csep.common.service.IFactleachsyspphisService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bzzz
 * @since 2018-04-17
 */
@Service
@Slf4j
public class FactleachsyspphisServiceImpl extends ServiceImpl<FactleachsyspphisMapper, Factleachsyspphis> implements IFactleachsyspphisService {

    @Autowired
    private IFactleachparamService factleachparamService;

    @Transactional
    public boolean hander(@NonNull FactleachSyspPPack pack){
        boolean result = true;

        try {
            Factleachsyspphis factleachsyspphis = new Factleachsyspphis();
            BeanUtils.copyProperties(factleachsyspphis, pack);

            insert(factleachsyspphis);

            Integer factNum = factleachsyspphis.getFactNum();
            String equmNum = factleachsyspphis.getEqumNum();

            Wrapper<Factleachparam> wrapper = new EntityWrapper<Factleachparam>().eq("factNum", factNum).eq("equmNum", equmNum);
            Factleachparam factleachparam = factleachparamService.selectOne(wrapper);

            Long id = null;
            if(factleachparam == null) {
                factleachparam = new Factleachparam();
            } else {
                id = factleachparam.getId();
            }
            BeanUtils.copyProperties(factleachparam, factleachsyspphis);
            factleachparam.setId(id);
            if(id == null) {
                factleachparamService.insert(factleachparam);
            } else {
                factleachparamService.updateById(factleachparam);
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            result = false;
        }
        return result;
    }
}
