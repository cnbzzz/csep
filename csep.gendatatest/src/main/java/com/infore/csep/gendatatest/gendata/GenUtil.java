package com.infore.csep.gendatatest.gendata;

import java.util.Random;

/**
 * Created by steven ma
 * 2018/4/23 15:27
 */

public class GenUtil {

    public static Integer genRamdomInt() {

        Random random = new Random();
        return random.nextInt(100);
    }

    public static String genRamEqumNum() {
        Random random = new Random();
        int num = random.nextInt(5);
        return String.format("ZL%04d", num+1);
    }
}
