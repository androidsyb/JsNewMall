package com.example.host.jsnewmall.utils;


import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by host on 2017/3/3.
 */

public class JsonUtils {

    public static JSONObject JsonParseInfo(String nTime, JSONObject jbody ){

        JSONObject jbodyfirst=null;
        try {
            jbodyfirst = new JSONObject();

            jbodyfirst.put("debug","0");
            jbodyfirst.put("method",jbody.get("method"));
            jbodyfirst.put("pid","wap");
            jbodyfirst.put("sign",MD5Utils.encode(Base64Utils.getBase64(jbody+"")+ DateUtils.dataOne(nTime)+"d477b9f73365df097fcf4094c7d83e0e"));
            jbodyfirst.put("time", DateUtils.dataOne(nTime));

        } catch (JSONException e) {
            e.printStackTrace();
        }



        JSONObject jbodysecond=null;
        try {
            jbodysecond = new JSONObject();
            jbodysecond.put("head",jbodyfirst);
            jbodysecond.put("body",Base64Utils.getBase64(jbody+""));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jbodysecond;
    }
}
