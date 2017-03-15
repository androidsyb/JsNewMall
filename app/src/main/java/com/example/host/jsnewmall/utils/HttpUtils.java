package com.example.host.jsnewmall.utils;

import android.content.Context;

import com.google.gson.Gson;

import org.json.JSONObject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by host on 2017/3/3.
 */

public class HttpUtils {


//    private static  PersistentCookieStore persistentCookieStore;

    public static void dopost(String url, Context mContext, JSONObject jsonObject, final CallBack callBack) {
        FormBody.Builder formbody=new FormBody.Builder();
        RequestBody body= RequestBody.create(MediaType.parse("application/json; charset=utf-8"), String.valueOf(jsonObject));

        final Request.Builder builder = new Request.Builder().post(body).url(UrlUtils.getBaseUrl()+url);
        final Request request = builder.build();
        final OkHttpClient.Builder client = new OkHttpClient.Builder()
                .connectTimeout(15, TimeUnit.SECONDS);//设置请求超时
//        persistentCookieStore = new PersistentCookieStore(mContext);//cookie使用
//        CookieUtils cookieUtils=new CookieUtils(persistentCookieStore);
//
//        client.cookieJar(cookieUtils);//cookie持久化
        final OkHttpClient okclient=client.build();
        new Thread(){
            Response response = null;
            String result="";
            public void run(){
                try {
                    response = okclient.newCall(request).execute();
                    result=response.body().string();
                    callBack.onRequestComplete(result);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.start();

    }





    public interface CallBack {
        void onRequestComplete(String result);
        void onRequestErr(String err);
    }

}

