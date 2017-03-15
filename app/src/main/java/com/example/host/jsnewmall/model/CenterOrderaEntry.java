package com.example.host.jsnewmall.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by host on 2017/3/14.
 */

public class CenterOrderaEntry {

    /**
     * res : 1
     * msg : \u8ba2\u5355\u4fe1\u606f\u67e5\u8be2\u6210\u529f
     * count : 178
     * orderlist : [{"orderid":"2823","order_code":"w170310095250770979","order_total_money":"6498.00","order_state":"1","order_type":"1","team_title":"\\u3010\\u6e05\\u65b0\\u6cf0\\u56fd\\u3011\\u6cf0\\u56fd\\u66fc\\u8c37\\u82ad\\u63d0\\u96c5\\u4e94\\u665a\\u516d\\u65e5\\u6e38 \\uff08\\u5e38\\u5dde\\u5f80\\u8fd4\\uff0c\\u81ea\\u7ec4\\u56e2\\uff09","godate":"2017-03-07","link_man":"123","link_mobile":"123","add_date":"2017-03-10 09:52:50","ranges":"3","linestype":"1","linesid":"13510","photo":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/7472\\/8951732c65ddfdfd639443f6d621cdc5.jpg","is_contract":0,"saleprice":"3099.00","crqty":2,"rtqty":0,"lrqty":0,"xsqty":0,"totalnum":2,"liner_saleprice":null,"liner_totalnum":0},{"orderid":"2822","order_code":"w170309174149509603","order_total_money":"6498.00","order_state":"2","order_type":"1","team_title":"\\u3010\\u6e05\\u65b0\\u6cf0\\u56fd\\u3011\\u6cf0\\u56fd\\u66fc\\u8c37\\u82ad\\u63d0\\u96c5\\u4e94\\u665a\\u516d\\u65e5\\u6e38 \\uff08\\u5e38\\u5dde\\u5f80\\u8fd4\\uff0c\\u81ea\\u7ec4\\u56e2\\uff09","godate":"2017-03-07","link_man":"15961167765","link_mobile":"15961167765","add_date":"2017-03-09 17:41:49","ranges":"3","linestype":"1","linesid":"13510","photo":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/7472\\/8951732c65ddfdfd639443f6d621cdc5.jpg","is_contract":0,"saleprice":"3099.00","crqty":2,"rtqty":0,"lrqty":0,"xsqty":0,"totalnum":2,"liner_saleprice":null,"liner_totalnum":0},{"orderid":"2821","order_code":"w170309174109469527","order_total_money":"6498.00","order_state":"1","order_type":"1","team_title":"\\u3010\\u6e05\\u65b0\\u6cf0\\u56fd\\u3011\\u6cf0\\u56fd\\u66fc\\u8c37\\u82ad\\u63d0\\u96c5\\u4e94\\u665a\\u516d\\u65e5\\u6e38 \\uff08\\u5e38\\u5dde\\u5f80\\u8fd4\\uff0c\\u81ea\\u7ec4\\u56e2\\uff09","godate":"2017-03-07","link_man":"15961167765","link_mobile":"15961167765","add_date":"2017-03-09 17:41:09","ranges":"3","linestype":"1","linesid":"13510","photo":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/7472\\/8951732c65ddfdfd639443f6d621cdc5.jpg","is_contract":0,"saleprice":"3099.00","crqty":2,"rtqty":0,"lrqty":0,"xsqty":0,"totalnum":2,"liner_saleprice":null,"liner_totalnum":0},{"orderid":"2815","order_code":"w170309140250370671","order_total_money":"6498.00","order_state":"1","order_type":"1","team_title":"\\u3010\\u6e05\\u65b0\\u6cf0\\u56fd\\u3011\\u6cf0\\u56fd\\u66fc\\u8c37\\u82ad\\u63d0\\u96c5\\u4e94\\u665a\\u516d\\u65e5\\u6e38 \\uff08\\u5e38\\u5dde\\u5f80\\u8fd4\\uff0c\\u81ea\\u7ec4\\u56e2\\uff09","godate":"2017-03-07","link_man":"15961167765","link_mobile":"15961167765","add_date":"2017-03-09 14:02:50","ranges":"3","linestype":"1","linesid":"13510","photo":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/7472\\/8951732c65ddfdfd639443f6d621cdc5.jpg","is_contract":0,"saleprice":"3099.00","crqty":2,"rtqty":0,"lrqty":0,"xsqty":0,"totalnum":2,"liner_saleprice":null,"liner_totalnum":0},{"orderid":"2814","order_code":"w170309134951591629","order_total_money":"6498.00","order_state":"1","order_type":"1","team_title":"\\u3010\\u6e05\\u65b0\\u6cf0\\u56fd\\u3011\\u6cf0\\u56fd\\u66fc\\u8c37\\u82ad\\u63d0\\u96c5\\u4e94\\u665a\\u516d\\u65e5\\u6e38 \\uff08\\u5e38\\u5dde\\u5f80\\u8fd4\\uff0c\\u81ea\\u7ec4\\u56e2\\uff09","godate":"2017-03-07","link_man":"15961167765","link_mobile":"15961167765","add_date":"2017-03-09 13:49:51","ranges":"3","linestype":"1","linesid":"13510","photo":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/7472\\/8951732c65ddfdfd639443f6d621cdc5.jpg","is_contract":0,"saleprice":"3099.00","crqty":2,"rtqty":0,"lrqty":0,"xsqty":0,"totalnum":2,"liner_saleprice":null,"liner_totalnum":0},{"orderid":"2813","order_code":"w170309134838518520","order_total_money":"6498.00","order_state":"1","order_type":"1","team_title":"\\u3010\\u6e05\\u65b0\\u6cf0\\u56fd\\u3011\\u6cf0\\u56fd\\u66fc\\u8c37\\u82ad\\u63d0\\u96c5\\u4e94\\u665a\\u516d\\u65e5\\u6e38 \\uff08\\u5e38\\u5dde\\u5f80\\u8fd4\\uff0c\\u81ea\\u7ec4\\u56e2\\uff09","godate":"2017-03-07","link_man":"15961167765","link_mobile":"15961167765","add_date":"2017-03-09 13:48:38","ranges":"3","linestype":"1","linesid":"13510","photo":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/7472\\/8951732c65ddfdfd639443f6d621cdc5.jpg","is_contract":0,"saleprice":"3099.00","crqty":2,"rtqty":0,"lrqty":0,"xsqty":0,"totalnum":2,"liner_saleprice":null,"liner_totalnum":0},{"orderid":"2812","order_code":"w170309134707427844","order_total_money":"6498.00","order_state":"1","order_type":"1","team_title":"\\u3010\\u6e05\\u65b0\\u6cf0\\u56fd\\u3011\\u6cf0\\u56fd\\u66fc\\u8c37\\u82ad\\u63d0\\u96c5\\u4e94\\u665a\\u516d\\u65e5\\u6e38 \\uff08\\u5e38\\u5dde\\u5f80\\u8fd4\\uff0c\\u81ea\\u7ec4\\u56e2\\uff09","godate":"2017-03-07","link_man":"15961167765","link_mobile":"15961167765","add_date":"2017-03-09 13:47:07","ranges":"3","linestype":"1","linesid":"13510","photo":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/7472\\/8951732c65ddfdfd639443f6d621cdc5.jpg","is_contract":0,"saleprice":"3099.00","crqty":2,"rtqty":0,"lrqty":0,"xsqty":0,"totalnum":2,"liner_saleprice":null,"liner_totalnum":0},{"orderid":"2811","order_code":"w170309134236156361","order_total_money":"6498.00","order_state":"2","order_type":"1","team_title":"\\u3010\\u6e05\\u65b0\\u6cf0\\u56fd\\u3011\\u6cf0\\u56fd\\u66fc\\u8c37\\u82ad\\u63d0\\u96c5\\u4e94\\u665a\\u516d\\u65e5\\u6e38 \\uff08\\u5e38\\u5dde\\u5f80\\u8fd4\\uff0c\\u81ea\\u7ec4\\u56e2\\uff09","godate":"2017-03-07","link_man":"15961167765","link_mobile":"15961167765","add_date":"2017-03-09 13:42:36","ranges":"3","linestype":"1","linesid":"13510","photo":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/7472\\/8951732c65ddfdfd639443f6d621cdc5.jpg","is_contract":0,"saleprice":"3099.00","crqty":2,"rtqty":0,"lrqty":0,"xsqty":0,"totalnum":2,"liner_saleprice":null,"liner_totalnum":0},{"orderid":"2810","order_code":"w170309134108068678","order_total_money":"6498.00","order_state":"1","order_type":"1","team_title":"\\u3010\\u6e05\\u65b0\\u6cf0\\u56fd\\u3011\\u6cf0\\u56fd\\u66fc\\u8c37\\u82ad\\u63d0\\u96c5\\u4e94\\u665a\\u516d\\u65e5\\u6e38 \\uff08\\u5e38\\u5dde\\u5f80\\u8fd4\\uff0c\\u81ea\\u7ec4\\u56e2\\uff09","godate":"2017-03-07","link_man":"15961167765","link_mobile":"15961167765","add_date":"2017-03-09 13:41:08","ranges":"3","linestype":"1","linesid":"13510","photo":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/7472\\/8951732c65ddfdfd639443f6d621cdc5.jpg","is_contract":0,"saleprice":"3099.00","crqty":2,"rtqty":0,"lrqty":0,"xsqty":0,"totalnum":2,"liner_saleprice":null,"liner_totalnum":0},{"orderid":"2809","order_code":"w170309134039039703","order_total_money":"6498.00","order_state":"2","order_type":"1","team_title":"\\u3010\\u6e05\\u65b0\\u6cf0\\u56fd\\u3011\\u6cf0\\u56fd\\u66fc\\u8c37\\u82ad\\u63d0\\u96c5\\u4e94\\u665a\\u516d\\u65e5\\u6e38 \\uff08\\u5e38\\u5dde\\u5f80\\u8fd4\\uff0c\\u81ea\\u7ec4\\u56e2\\uff09","godate":"2017-03-07","link_man":"15961167765","link_mobile":"15961167765","add_date":"2017-03-09 13:40:39","ranges":"3","linestype":"1","linesid":"13510","photo":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/7472\\/8951732c65ddfdfd639443f6d621cdc5.jpg","is_contract":0,"saleprice":"3099.00","crqty":2,"rtqty":0,"lrqty":0,"xsqty":0,"totalnum":2,"liner_saleprice":null,"liner_totalnum":0}]
     */

    private int res;
    private String msg;
    private int count;
    private List<OrderlistBean> orderlist;

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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<OrderlistBean> getOrderlist() {
        return orderlist;
    }

    public void setOrderlist(List<OrderlistBean> orderlist) {
        this.orderlist = orderlist;
    }

    public static class OrderlistBean{
        /**
         * orderid : 2823
         * order_code : w170310095250770979
         * order_total_money : 6498.00
         * order_state : 1
         * order_type : 1
         * team_title : \u3010\u6e05\u65b0\u6cf0\u56fd\u3011\u6cf0\u56fd\u66fc\u8c37\u82ad\u63d0\u96c5\u4e94\u665a\u516d\u65e5\u6e38 \uff08\u5e38\u5dde\u5f80\u8fd4\uff0c\u81ea\u7ec4\u56e2\uff09
         * godate : 2017-03-07
         * link_man : 123
         * link_mobile : 123
         * add_date : 2017-03-10 09:52:50
         * ranges : 3
         * linestype : 1
         * linesid : 13510
         * photo : http:\/\/img1.uu1.com\/images\/0\/14\/7472\/8951732c65ddfdfd639443f6d621cdc5.jpg
         * is_contract : 0
         * saleprice : 3099.00
         * crqty : 2
         * rtqty : 0
         * lrqty : 0
         * xsqty : 0
         * totalnum : 2
         * liner_saleprice : null
         * liner_totalnum : 0
         */

        private String orderid;
        private String order_code;
        private String order_total_money;
        private String order_state;
        private String order_type;
        private String team_title;
        private String godate;
        private String link_man;
        private String link_mobile;
        private String add_date;
        private String ranges;
        private String linestype;
        private String linesid;
        private String photo;
        private int is_contract;
        private String saleprice;
        private int crqty;
        private int rtqty;
        private int lrqty;
        private int xsqty;
        private int totalnum;
        private Object liner_saleprice;
        private int liner_totalnum;

        public String getOrderid() {
            return orderid;
        }

        public void setOrderid(String orderid) {
            this.orderid = orderid;
        }

        public String getOrder_code() {
            return order_code;
        }

        public void setOrder_code(String order_code) {
            this.order_code = order_code;
        }

        public String getOrder_total_money() {
            return order_total_money;
        }

        public void setOrder_total_money(String order_total_money) {
            this.order_total_money = order_total_money;
        }

        public String getOrder_state() {
            return order_state;
        }

        public void setOrder_state(String order_state) {
            this.order_state = order_state;
        }

        public String getOrder_type() {
            return order_type;
        }

        public void setOrder_type(String order_type) {
            this.order_type = order_type;
        }

        public String getTeam_title() {
            return team_title;
        }

        public void setTeam_title(String team_title) {
            this.team_title = team_title;
        }

        public String getGodate() {
            return godate;
        }

        public void setGodate(String godate) {
            this.godate = godate;
        }

        public String getLink_man() {
            return link_man;
        }

        public void setLink_man(String link_man) {
            this.link_man = link_man;
        }

        public String getLink_mobile() {
            return link_mobile;
        }

        public void setLink_mobile(String link_mobile) {
            this.link_mobile = link_mobile;
        }

        public String getAdd_date() {
            return add_date;
        }

        public void setAdd_date(String add_date) {
            this.add_date = add_date;
        }

        public String getRanges() {
            return ranges;
        }

        public void setRanges(String ranges) {
            this.ranges = ranges;
        }

        public String getLinestype() {
            return linestype;
        }

        public void setLinestype(String linestype) {
            this.linestype = linestype;
        }

        public String getLinesid() {
            return linesid;
        }

        public void setLinesid(String linesid) {
            this.linesid = linesid;
        }

        public String getPhoto() {
            return photo;
        }

        public void setPhoto(String photo) {
            this.photo = photo;
        }

        public int getIs_contract() {
            return is_contract;
        }

        public void setIs_contract(int is_contract) {
            this.is_contract = is_contract;
        }

        public String getSaleprice() {
            return saleprice;
        }

        public void setSaleprice(String saleprice) {
            this.saleprice = saleprice;
        }

        public int getCrqty() {
            return crqty;
        }

        public void setCrqty(int crqty) {
            this.crqty = crqty;
        }

        public int getRtqty() {
            return rtqty;
        }

        public void setRtqty(int rtqty) {
            this.rtqty = rtqty;
        }

        public int getLrqty() {
            return lrqty;
        }

        public void setLrqty(int lrqty) {
            this.lrqty = lrqty;
        }

        public int getXsqty() {
            return xsqty;
        }

        public void setXsqty(int xsqty) {
            this.xsqty = xsqty;
        }

        public int getTotalnum() {
            return totalnum;
        }

        public void setTotalnum(int totalnum) {
            this.totalnum = totalnum;
        }

        public Object getLiner_saleprice() {
            return liner_saleprice;
        }

        public void setLiner_saleprice(Object liner_saleprice) {
            this.liner_saleprice = liner_saleprice;
        }

        public int getLiner_totalnum() {
            return liner_totalnum;
        }

        public void setLiner_totalnum(int liner_totalnum) {
            this.liner_totalnum = liner_totalnum;
        }
    }
}
