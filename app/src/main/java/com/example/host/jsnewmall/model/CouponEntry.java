package com.example.host.jsnewmall.model;

import java.util.List;

/**
 * Created by host on 2017/3/14.
 */

public class CouponEntry {

    /**
     * res : 1
     * msg : \u672a\u4f7f\u7528\u4f18\u60e0\u5238\u4fe1\u606f\u67e5\u8be2\u6210\u529f
     * count : 8
     * data : [{"id":"103706","title":"\\u5168\\u573aAPP\\u6d4b\\u8bd5\\u5238","coupon_id":"126","user_id":"24025","user_name":"15961167765","begintime":"2017-03-09","endtime":"2017-07-29","commoncode":"ll197750176","money":"3.00","lowemoney":"3.00","issue":"1","ischecked":null,"createtime":"2017-03-09 11:24:43","usedtime":null,"timestamp":"2017-03-09 11:24:43","remarks":null,"formid":"0","typeid":"0","outid":0},{"id":"103707","title":"\\u5168\\u573aAPP\\u6d4b\\u8bd5\\u5238","coupon_id":"126","user_id":"24025","user_name":"15961167765","begintime":"2017-03-09","endtime":"2017-07-29","commoncode":"ll255162478","money":"3.00","lowemoney":"3.00","issue":"1","ischecked":null,"createtime":"2017-03-09 11:24:46","usedtime":null,"timestamp":"2017-03-09 11:24:46","remarks":null,"formid":"0","typeid":"0","outid":0},{"id":"103696","title":"\\u666e\\u901a\\u4f18\\u60e0\\u5238","coupon_id":"125","user_id":"24025","user_name":"15961167765","begintime":"2017-02-20","endtime":"2018-05-26","commoncode":"ssa836412451","money":"20.00","lowemoney":"50.00","issue":"1","ischecked":null,"createtime":"2017-02-27 17:20:02","usedtime":null,"timestamp":"2017-02-27 17:20:02","remarks":null,"formid":"0","typeid":"1","outid":0},{"id":"103697","title":"\\u666e\\u901a\\u4f18\\u60e0\\u5238","coupon_id":"125","user_id":"24025","user_name":"15961167765","begintime":"2017-02-20","endtime":"2018-05-26","commoncode":"ssa848441874","money":"20.00","lowemoney":"50.00","issue":"1","ischecked":null,"createtime":"2017-03-09 11:34:54","usedtime":null,"timestamp":"2017-03-09 11:34:54","remarks":null,"formid":"0","typeid":"1","outid":0},{"id":"103698","title":"\\u666e\\u901a\\u4f18\\u60e0\\u5238","coupon_id":"125","user_id":"24025","user_name":"15961167765","begintime":"2017-02-20","endtime":"2018-05-26","commoncode":"ssa890906162","money":"20.00","lowemoney":"50.00","issue":"1","ischecked":null,"createtime":"2017-03-09 11:34:55","usedtime":null,"timestamp":"2017-03-09 11:34:55","remarks":null,"formid":"0","typeid":"1","outid":0},{"id":"103699","title":"\\u666e\\u901a\\u4f18\\u60e0\\u5238","coupon_id":"125","user_id":"24025","user_name":"15961167765","begintime":"2017-02-20","endtime":"2018-05-26","commoncode":"ssa898063878","money":"20.00","lowemoney":"50.00","issue":"1","ischecked":null,"createtime":"2017-03-09 11:35:53","usedtime":null,"timestamp":"2017-03-09 11:35:53","remarks":null,"formid":"0","typeid":"1","outid":0},{"id":"103658","title":"\\u6ee1\\u51cf\\u6d4b\\u8bd5\\u5238","coupon_id":"124","user_id":"24025","user_name":"15961167765","begintime":"2017-02-20","endtime":"2018-01-03","commoncode":"www120887597","money":"20.00","lowemoney":"200.00","issue":"1","ischecked":null,"createtime":"2017-03-09 11:36:33","usedtime":null,"timestamp":"2017-03-09 11:36:33","remarks":null,"formid":"0","typeid":"0","outid":0},{"id":"103659","title":"\\u6ee1\\u51cf\\u6d4b\\u8bd5\\u5238","coupon_id":"124","user_id":"24025","user_name":"15961167765","begintime":"2017-02-20","endtime":"2018-01-03","commoncode":"www129505129","money":"20.00","lowemoney":"200.00","issue":"1","ischecked":null,"createtime":"2017-03-09 11:36:34","usedtime":null,"timestamp":"2017-03-09 11:36:34","remarks":null,"formid":"0","typeid":"0","outid":0}]
     */

    private int res;
    private String msg;
    private String count;
    private List<DataBean> data;

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

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 103706
         * title : \u5168\u573aAPP\u6d4b\u8bd5\u5238
         * coupon_id : 126
         * user_id : 24025
         * user_name : 15961167765
         * begintime : 2017-03-09
         * endtime : 2017-07-29
         * commoncode : ll197750176
         * money : 3.00
         * lowemoney : 3.00
         * issue : 1
         * ischecked : null
         * createtime : 2017-03-09 11:24:43
         * usedtime : null
         * timestamp : 2017-03-09 11:24:43
         * remarks : null
         * formid : 0
         * typeid : 0
         * outid : 0
         */

        private String id;
        private String title;
        private String coupon_id;
        private String user_id;
        private String user_name;
        private String begintime;
        private String endtime;
        private String commoncode;
        private String money;
        private String lowemoney;
        private String issue;
        private Object ischecked;
        private String createtime;
        private Object usedtime;
        private String timestamp;
        private Object remarks;
        private String formid;
        private String typeid;
        private int outid;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getCoupon_id() {
            return coupon_id;
        }

        public void setCoupon_id(String coupon_id) {
            this.coupon_id = coupon_id;
        }

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public String getBegintime() {
            return begintime;
        }

        public void setBegintime(String begintime) {
            this.begintime = begintime;
        }

        public String getEndtime() {
            return endtime;
        }

        public void setEndtime(String endtime) {
            this.endtime = endtime;
        }

        public String getCommoncode() {
            return commoncode;
        }

        public void setCommoncode(String commoncode) {
            this.commoncode = commoncode;
        }

        public String getMoney() {
            return money;
        }

        public void setMoney(String money) {
            this.money = money;
        }

        public String getLowemoney() {
            return lowemoney;
        }

        public void setLowemoney(String lowemoney) {
            this.lowemoney = lowemoney;
        }

        public String getIssue() {
            return issue;
        }

        public void setIssue(String issue) {
            this.issue = issue;
        }

        public Object getIschecked() {
            return ischecked;
        }

        public void setIschecked(Object ischecked) {
            this.ischecked = ischecked;
        }

        public String getCreatetime() {
            return createtime;
        }

        public void setCreatetime(String createtime) {
            this.createtime = createtime;
        }

        public Object getUsedtime() {
            return usedtime;
        }

        public void setUsedtime(Object usedtime) {
            this.usedtime = usedtime;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public Object getRemarks() {
            return remarks;
        }

        public void setRemarks(Object remarks) {
            this.remarks = remarks;
        }

        public String getFormid() {
            return formid;
        }

        public void setFormid(String formid) {
            this.formid = formid;
        }

        public String getTypeid() {
            return typeid;
        }

        public void setTypeid(String typeid) {
            this.typeid = typeid;
        }

        public int getOutid() {
            return outid;
        }

        public void setOutid(int outid) {
            this.outid = outid;
        }
    }
}
