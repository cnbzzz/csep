package com.infore.csep;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by steven ma
 * 2018/4/19 9:56
 */

public class DateTest {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String beginDate = "2018-04-19 15:00:00";
        String endDate = "2018-04-19 15:00:01";

        Date btime = sdf.parse(beginDate);
        Date etime = sdf.parse(endDate);

        if(btime.before(etime)) {
            System.out.println("before");
        } else {
            System.out.println("after");
        }

        Date now = new Date();
        System.out.println("Now is:" + now);

    }
}
