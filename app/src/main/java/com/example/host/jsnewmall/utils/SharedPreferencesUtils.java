package com.example.host.jsnewmall.utils;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by host on 2017/3/13.
 */

public class SharedPreferencesUtils {
    public static Boolean doSaveIndexItem(Context context, int item) {

        SharedPreferences sharedPreferences = context.getSharedPreferences(
                "home_item", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("item", item);
        if (editor.commit()) {

            return true;
        }
        return false;
    }


    public static int doGetIndexItem(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                "home_item", Activity.MODE_PRIVATE);
        return sharedPreferences.getInt("item", 0);
    }


    /**
     * c存储登陆后的用户数据
     * @param context
     * @return
     */

    public static String getUserInfo(Context context) {
        SharedPreferences pref = context.getSharedPreferences(
                "user_login", 0);
        return pref.getString("user_info", "");
    }
    public static boolean saveUserInfo(Context context,String info) {
        SharedPreferences pref = context.getSharedPreferences(
                "user_login", 0);
        return pref.edit().putString("user_info", info).commit();
    }



}
