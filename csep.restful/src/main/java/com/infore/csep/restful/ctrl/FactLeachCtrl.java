package com.infore.csep.restful.ctrl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.infore.csep.common.service.IFactLeachHisHourService;
import com.infore.csep.common.service.IFactleachService;
import com.infore.csep.common.service.IFactleachhisdayService;
import com.infore.csep.common.service.IFactleachtimeService;
import com.infore.csep.pojo.entity.FactLeachHisHour;
import com.infore.csep.pojo.entity.Factleach;
import com.infore.csep.pojo.entity.Factleachhisday;
import com.infore.csep.pojo.entity.Factleachtime;
import com.infore.csep.restful.VO.HisReqVO;
import com.infore.csep.restful.VO.RealTimeReqVO;
import com.infore.csep.restful.VO.ResultVO;
import com.infore.csep.restful.utils.BeginEndTimeUtil;
import com.infore.csep.restful.utils.CheckParamUtil;
import com.infore.csep.restful.utils.ResultVOUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 渗滤液数据请求接口
 * Created by steven ma
 * 2018/4/28 16:39
 */

@RestController
@RequestMapping("/factleach")
@Slf4j
public class FactLeachCtrl {

    @Autowired
    private IFactleachService factleachService;

    @Autowired
    private IFactLeachHisHourService factLeachHisHourService;

    @Autowired
    private IFactleachhisdayService factleachhisdayService;

    @Autowired
    private IFactleachtimeService factleachtimeService;

    /**
     * 查询渗滤液实时状态 TODO:暂时放在这里，后面放service
     *
     * @param factNum 厂站编码
     * @param equmNum 设备编码
     * @return
     */
    public List<Factleach> findByFactNumAndEqumNum(String factNum, String equmNum) {

        Wrapper<Factleach> wrapper = new EntityWrapper<>();
        wrapper.eq("factNum", Integer.parseInt(factNum));  //TODO: 表还是int类型，后续考虑统一

        if (!equmNum.isEmpty()) {
            wrapper.eq("equmNum", equmNum);
        }

        List<Factleach> factleach = factleachService.selectList(wrapper);

        return factleach;
    }


    /**
     * 渗滤液工况实时数据查询
     *
     * @return
     */
    @RequestMapping("realtime")
    public ResultVO realtime(@RequestBody @Valid RealTimeReqVO reqVO, BindingResult br) {

        //参数合法性较验
        log.debug("request: {}", reqVO);
        CheckParamUtil.check(br);

        List<Factleach> factleach = findByFactNumAndEqumNum(reqVO.getFactNum(), reqVO.getEqumNum());

        return ResultVOUtil.success(factleach);
    }


    /**
     * 工况历史数据(小时)
     *
     * @param reqVO
     * @param br
     * @return
     */
    @RequestMapping("hour")
    public ResultVO hisHour(@RequestBody @Valid HisReqVO reqVO, BindingResult br) {
        //参数合法性较验
        log.debug("request: {}", reqVO);
        CheckParamUtil.check(br);


        BeginEndTimeUtil beginEndTime = BeginEndTimeUtil.getDate(reqVO.getBeginTime(), reqVO.getEndTime());


        List<FactLeachHisHour> hisDatas =
                factLeachHisHourService.findByFactNumAndEqumNum(
                        Integer.parseInt(reqVO.getFactNum()),
                        reqVO.getEqumNum(),
                        beginEndTime.getBeginTime(),
                        beginEndTime.getEndTime());

        return ResultVOUtil.success(hisDatas);
    }


    @RequestMapping("day")
    public ResultVO hisDay(@RequestBody @Valid HisReqVO reqVO, BindingResult br) {
        //参数合法性较验
        log.debug("request: {}", reqVO);
        CheckParamUtil.check(br);

        BeginEndTimeUtil beginEndTime = BeginEndTimeUtil.getDate(reqVO.getBeginTime(), reqVO.getEndTime());

        List<Factleachhisday> hisDatas =
                factleachhisdayService.findByFactNumAndEqumNum(
                        Integer.parseInt(reqVO.getFactNum()),
                        reqVO.getEqumNum(),
                        beginEndTime.getBeginTime(),
                        beginEndTime.getEndTime());

        return ResultVOUtil.success(hisDatas);
    }

    @RequestMapping("month")
    public ResultVO hisMonth(@RequestBody @Valid HisReqVO reqVO, BindingResult br) {
        //TODO: 还没实现，暂时用日表代替接口
        return hisDay(reqVO, br);
    }

    @RequestMapping("year")
    public ResultVO hisYear(@RequestBody @Valid HisReqVO reqVO, BindingResult br) {
        //TODO: 还没实现，暂时用日表代替接口
        return hisDay(reqVO, br);
    }

    /**
     * 查询运行状态
     * @param reqVO
     * @param br
     * @return
     */
    @RequestMapping("runst")
    public ResultVO openStatus(@RequestBody @Valid RealTimeReqVO reqVO, BindingResult br) {
        //参数合法性较验
        log.debug("openStatus: {}", reqVO);
        CheckParamUtil.check(br);

        List<Factleachtime> gpssewatimes = factleachtimeService.findByFactNumAndEqumNum(
                reqVO.getFactNum(),
                reqVO.getEqumNum());

        return ResultVOUtil.success(gpssewatimes);

    }
}
