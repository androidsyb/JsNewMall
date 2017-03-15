package com.example.host.jsnewmall.model;

/**
 * Created by host on 2017/3/14.
 */

public class LoginYouhuiEntry {

    /**
     * res : 1
     * msg : \u67e5\u8be2\u6210\u529f
     * data : {"coupon_num":"8","points_num":"201"}
     */

    private int res;
    private String msg;
    private DataBean data;

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * coupon_num : 8
         * points_num : 201
         */

        private String coupon_num;
        private String points_num;

        public String getCoupon_num() {
            return coupon_num;
        }

        public void setCoupon_num(String coupon_num) {
            this.coupon_num = coupon_num;
        }

        public String getPoints_num() {
            return points_num;
        }

        public void setPoints_num(String points_num) {
            this.points_num = points_num;
        }
    }
}
