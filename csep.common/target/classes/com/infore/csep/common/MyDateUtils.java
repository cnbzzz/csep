package com.infore.csep.common;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.DateFormatUtils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by steven ma
 * 2017/12/30 16:20
 */

//实现一个时间转换类
@Slf4j
public class MyDateUtils {


    /**
     * 将unix格式的毫秒数转换为YYYY-MM-DD
     * @param timestamp unix时间戳毫秒
     * @return string类型的时间
     */
    public static String UnixTime2Date(Long timestamp) {

        if(timestamp == null) {
            //如果没有值就取当前时间
            timestamp = Calendar.getInstance().getTimeInMillis();
            log.warn("timestamp is null set:{} ", timestamp);
        }

        String date = DateFormatUtils.format(timestamp, "yyyy-MM-dd");

        return date;
    }


    /**
     * 将unix格式的毫秒数转换为YYYYMM的int格式
     * @param timestamp unix时间戳毫秒
     * @return YYYYMM格式的日期
     */
    public static int UnixTime2YYYYMM(Long timestamp) {


        //log.info("timestamp: " + timestamp);
        if(timestamp == null) {
            //如果没有值就取当前时间
            timestamp = Calendar.getInstance().getTimeInMillis();
            log.warn("timestamp is null set:{} ", timestamp);
        }


        String mm = DateFormatUtils.format(timestamp, "yyyyMM");
        return Integer.parseInt(mm);

        //String date = new SimpleDateFormat(formats, Locale.CHINA).format(new Date(timestamp));
//        Date dt = new Date(timestamp);
//
//        // 创建 Calendar 对象
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(dt);
//
//        String str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS")).format(calendar.getTime());
//        System.out.println(str);
//
//        int year = calendar.get(Calendar.YEAR);
//        int month = calendar.get(Calendar.MONTH);
//
//
//
//        return year * 100 + month + 1;

    }

    /**
     * 日期格式字符串转换成时间戳
     *
     * @param dateStr 字符串日期
     * @param format   如：yyyy-MM-dd HH:mm:ss
     *
     * @return
     */
    public static Long Date2TimeStamp(String dateStr, String format) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            //return String.valueOf(sdf.parse(dateStr).getTime() / 1000);
            return sdf.parse(dateStr).getTime();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0L;
    }

    /**
     * 将日期格式转换为yyyyMMddHH的整型
      * @param date
     * @return
     */
    public static int Date2yyyyMMddHH(Date date) {

        String sDate = DateFormatUtils.format(date, "yyyyMMddHH");

        return Integer.parseInt(sDate);
    }

    public static void main(String[] args) {

//        String name = "盈科律师事务所";
//        System.err.println("name hashcode: " + name.hashCode());

        Long time = Date2TimeStamp("2018-03-21", "yyyy-MM-dd");
        System.out.println("Time: " + time);

        String time2 = UnixTime2Date(time);
        System.out.println("Time2: " + time2);


        int nDate = Date2yyyyMMddHH(new Date());
        System.out.println("Time3:" + nDate);
    }

}
