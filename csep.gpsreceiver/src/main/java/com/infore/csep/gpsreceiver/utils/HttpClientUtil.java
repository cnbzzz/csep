package com.infore.csep.gpsreceiver.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by steven ma
 * 2018/4/27 14:31
 */

public class HttpClientUtil {

    public static String get(String url) throws IOException {
        HttpURLConnection conn = (HttpURLConnection) (new URL(url).openConnection());
        conn.connect();

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        conn.getInputStream()));

        return reader.readLine();
    }
}
