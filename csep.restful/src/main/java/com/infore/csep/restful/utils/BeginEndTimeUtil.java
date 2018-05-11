package com.infore.csep.restful.utils;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by steven ma
 * 2018/4/30 14:41
 */
@Data
@Slf4j
public class BeginEndTimeUtil {
    private Date beginTime;
    private Date endTime;

    public BeginEndTimeUtil(Date beginTime, Date endTime) {
        this.beginTime = beginTime;
        this.endTime = endTime;
    }

    public static BeginEndTimeUtil getDate(String strBeginTime, String strEndTime) {

        if ((strBeginTime == null) || (strEndTime == null)) {
            log.error("error date format: {}|{}",
                    strBeginTime,
                    strEndTime);
            return new BeginEndTimeUtil(new Date(), new Date());
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            Date begin = sdf.parse(strBeginTime);
            Date end = sdf.parse(strEndTime);
            return new BeginEndTimeUtil(begin, end);
        } catch (ParseException e) {
            log.error("error date format: {}|{}",
                    strBeginTime,
                    strEndTime);

            return new BeginEndTimeUtil(new Date(), new Date());
        }

    }
}
