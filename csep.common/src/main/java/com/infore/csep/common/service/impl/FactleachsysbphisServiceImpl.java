package com.infore.csep.common.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.infore.csep.common.netty.dto.FactleachSysaPPack;
import com.infore.csep.common.netty.dto.FactleachSysbPPack;
import com.infore.csep.common.service.IFactleachparamService;
import com.infore.csep.pojo.entity.Factleachparam;
import com.infore.csep.pojo.entity.Factleachsysaphis;
import com.infore.csep.pojo.entity.Factleachsysbphis;
import com.infore.csep.pojo.mapper.FactleachsysbphisMapper;
import com.infore.csep.common.service.IFactleachsysbphisService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author bzzz
 * @since 2018-04-17
 */
@Service
@Slf4j
public class FactleachsysbphisServiceImpl extends ServiceImpl<FactleachsysbphisMapper, Factleachsysbphis> implements IFactleachsysbphisService {

    @Autowired
    private IFactleachparamService factleachparamService;

    @Transactional
    public boolean hander(@NonNull FactleachSysbPPack pack) {
        boolean result = true;

        try {
            Factleachsysbphis factleachsysbphis = new Factleachsysbphis();
            BeanUtils.copyProperties(factleachsysbphis, pack);

            insert(factleachsysbphis);

            Integer factNum = factleachsysbphis.getFactNum();
            String equmNum = factleachsysbphis.getEqumNum();

            Wrapper<Factleachparam> wrapper = new EntityWrapper<Factleachparam>().eq("factNum", factNum).eq("equmNum", equmNum);
            Factleachparam factleachparam = factleachparamService.selectOne(wrapper);

            Long id = null;
            if (factleachparam == null) {
                factleachparam = new Factleachparam();
            } else {
                id = factleachparam.getId();
            }
            BeanUtils.copyProperties(factleachparam, factleachsysbphis);
            factleachparam.setId(id);
            if (id == null) {
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
