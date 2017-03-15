package com.example.host.jsnewmall.utils;

/**
 * Created by host on 2017/3/3.
 */

public class UrlUtils {


    public static final String APP_URL="app";
    public static final String ROUTE_LINE="lines";
    public static final String USER="user";

    private  static final String  BASE_TEST_JS="http://open.4008289828.com/";
    private  static final String  BASE_JS="http://open.uu1.com/";

    public static String getBaseUrl() {
        String baseUrl = "";
        if (DebugUtils.isDebug) {
            baseUrl = BASE_TEST_JS;
        } else {
            baseUrl = BASE_JS;
        }
        return baseUrl;
    }
}
