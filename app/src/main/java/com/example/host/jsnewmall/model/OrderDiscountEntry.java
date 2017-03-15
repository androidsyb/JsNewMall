package com.example.host.jsnewmall.model;

import java.util.List;

/**
 * Created by host on 2017/3/10.
 */

public class OrderDiscountEntry {

    /**
     * res : 1
     * msg : \u67e5\u8be2\u6210\u529f
     * data : {"activity":[{"base":{"id":"15","activity_name":"app\\u4e0b\\u5355\\u7acb\\u51cf","activity_rule_id":"15","begin_datetime":"2017-02-21 15:14:19","end_datetime":"2017-04-30 15:14:19","city_id":"115","is_mobile":"2","activity_state":"1","remark":"\\u6b64\\u5904\\u7701\\u7565128\\u4e2a\\u5b57","add_date":"2017-02-28 15:15:48"},"rule":{"id":"15","rule_type":"1","rule_name":"\\u4e0b\\u5355\\u7acb\\u51cf","full_num":"0","less_money":"3","remark":"\\u4e0b\\u5355\\u7acb\\u51cf","is_all_goods":"0","add_date":"2017-02-28 15:15:48"},"goods":[{"id":"480","activity_id":"15","goods_id":"13510","team_id":"76607","team_sub_id":"142225","city_id":"115","goods_type":"1","add_date":"2017-03-02 17:20:39","godate":"2017-03-28"}]}],"coupon":{"applicable":[{"id":"103706","title":"\\u5168\\u573aAPP\\u6d4b\\u8bd5\\u5238","coupon_id":"126","user_id":"24025","user_name":"15961167765","begintime":"2017-03-09","endtime":"2017-07-29","commoncode":"ll197750176","money":"3.00","lowemoney":"3.00","issue":"1","ischecked":null,"createtime":"2017-03-09 11:24:43","usedtime":null,"timestamp":"2017-03-09 11:24:43","remarks":null,"formid":"0","typeid":"0","outid":""},{"id":"103707","title":"\\u5168\\u573aAPP\\u6d4b\\u8bd5\\u5238","coupon_id":"126","user_id":"24025","user_name":"15961167765","begintime":"2017-03-09","endtime":"2017-07-29","commoncode":"ll255162478","money":"3.00","lowemoney":"3.00","issue":"1","ischecked":null,"createtime":"2017-03-09 11:24:46","usedtime":null,"timestamp":"2017-03-09 11:24:46","remarks":null,"formid":"0","typeid":"0","outid":""},{"id":"103658","title":"\\u6ee1\\u51cf\\u6d4b\\u8bd5\\u5238","coupon_id":"124","user_id":"24025","user_name":"15961167765","begintime":"2017-02-20","endtime":"2018-01-03","commoncode":"www120887597","money":"20.00","lowemoney":"200.00","issue":"1","ischecked":null,"createtime":"2017-03-09 11:36:33","usedtime":null,"timestamp":"2017-03-09 11:36:33","remarks":null,"formid":"0","typeid":"0","outid":""},{"id":"103659","title":"\\u6ee1\\u51cf\\u6d4b\\u8bd5\\u5238","coupon_id":"124","user_id":"24025","user_name":"15961167765","begintime":"2017-02-20","endtime":"2018-01-03","commoncode":"www129505129","money":"20.00","lowemoney":"200.00","issue":"1","ischecked":null,"createtime":"2017-03-09 11:36:34","usedtime":null,"timestamp":"2017-03-09 11:36:34","remarks":null,"formid":"0","typeid":"0","outid":""}],"notapplicable":[{"id":"103696","title":"\\u666e\\u901a\\u4f18\\u60e0\\u5238","coupon_id":"125","user_id":"24025","user_name":"15961167765","begintime":"2017-02-20","endtime":"2018-05-26","commoncode":"ssa836412451","money":"20.00","lowemoney":"50.00","issue":"1","ischecked":null,"createtime":"2017-02-27 17:20:02","usedtime":null,"timestamp":"2017-02-27 17:20:02","remarks":null,"formid":"0","typeid":"1","outid":""},{"id":"103697","title":"\\u666e\\u901a\\u4f18\\u60e0\\u5238","coupon_id":"125","user_id":"24025","user_name":"15961167765","begintime":"2017-02-20","endtime":"2018-05-26","commoncode":"ssa848441874","money":"20.00","lowemoney":"50.00","issue":"1","ischecked":null,"createtime":"2017-03-09 11:34:54","usedtime":null,"timestamp":"2017-03-09 11:34:54","remarks":null,"formid":"0","typeid":"1","outid":""},{"id":"103698","title":"\\u666e\\u901a\\u4f18\\u60e0\\u5238","coupon_id":"125","user_id":"24025","user_name":"15961167765","begintime":"2017-02-20","endtime":"2018-05-26","commoncode":"ssa890906162","money":"20.00","lowemoney":"50.00","issue":"1","ischecked":null,"createtime":"2017-03-09 11:34:55","usedtime":null,"timestamp":"2017-03-09 11:34:55","remarks":null,"formid":"0","typeid":"1","outid":""},{"id":"103699","title":"\\u666e\\u901a\\u4f18\\u60e0\\u5238","coupon_id":"125","user_id":"24025","user_name":"15961167765","begintime":"2017-02-20","endtime":"2018-05-26","commoncode":"ssa898063878","money":"20.00","lowemoney":"50.00","issue":"1","ischecked":null,"createtime":"2017-03-09 11:35:53","usedtime":null,"timestamp":"2017-03-09 11:35:53","remarks":null,"formid":"0","typeid":"1","outid":""}]}}
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
         * activity : [{"base":{"id":"15","activity_name":"app\\u4e0b\\u5355\\u7acb\\u51cf","activity_rule_id":"15","begin_datetime":"2017-02-21 15:14:19","end_datetime":"2017-04-30 15:14:19","city_id":"115","is_mobile":"2","activity_state":"1","remark":"\\u6b64\\u5904\\u7701\\u7565128\\u4e2a\\u5b57","add_date":"2017-02-28 15:15:48"},"rule":{"id":"15","rule_type":"1","rule_name":"\\u4e0b\\u5355\\u7acb\\u51cf","full_num":"0","less_money":"3","remark":"\\u4e0b\\u5355\\u7acb\\u51cf","is_all_goods":"0","add_date":"2017-02-28 15:15:48"},"goods":[{"id":"480","activity_id":"15","goods_id":"13510","team_id":"76607","team_sub_id":"142225","city_id":"115","goods_type":"1","add_date":"2017-03-02 17:20:39","godate":"2017-03-28"}]}]
         * coupon : {"applicable":[{"id":"103706","title":"\\u5168\\u573aAPP\\u6d4b\\u8bd5\\u5238","coupon_id":"126","user_id":"24025","user_name":"15961167765","begintime":"2017-03-09","endtime":"2017-07-29","commoncode":"ll197750176","money":"3.00","lowemoney":"3.00","issue":"1","ischecked":null,"createtime":"2017-03-09 11:24:43","usedtime":null,"timestamp":"2017-03-09 11:24:43","remarks":null,"formid":"0","typeid":"0","outid":""},{"id":"103707","title":"\\u5168\\u573aAPP\\u6d4b\\u8bd5\\u5238","coupon_id":"126","user_id":"24025","user_name":"15961167765","begintime":"2017-03-09","endtime":"2017-07-29","commoncode":"ll255162478","money":"3.00","lowemoney":"3.00","issue":"1","ischecked":null,"createtime":"2017-03-09 11:24:46","usedtime":null,"timestamp":"2017-03-09 11:24:46","remarks":null,"formid":"0","typeid":"0","outid":""},{"id":"103658","title":"\\u6ee1\\u51cf\\u6d4b\\u8bd5\\u5238","coupon_id":"124","user_id":"24025","user_name":"15961167765","begintime":"2017-02-20","endtime":"2018-01-03","commoncode":"www120887597","money":"20.00","lowemoney":"200.00","issue":"1","ischecked":null,"createtime":"2017-03-09 11:36:33","usedtime":null,"timestamp":"2017-03-09 11:36:33","remarks":null,"formid":"0","typeid":"0","outid":""},{"id":"103659","title":"\\u6ee1\\u51cf\\u6d4b\\u8bd5\\u5238","coupon_id":"124","user_id":"24025","user_name":"15961167765","begintime":"2017-02-20","endtime":"2018-01-03","commoncode":"www129505129","money":"20.00","lowemoney":"200.00","issue":"1","ischecked":null,"createtime":"2017-03-09 11:36:34","usedtime":null,"timestamp":"2017-03-09 11:36:34","remarks":null,"formid":"0","typeid":"0","outid":""}],"notapplicable":[{"id":"103696","title":"\\u666e\\u901a\\u4f18\\u60e0\\u5238","coupon_id":"125","user_id":"24025","user_name":"15961167765","begintime":"2017-02-20","endtime":"2018-05-26","commoncode":"ssa836412451","money":"20.00","lowemoney":"50.00","issue":"1","ischecked":null,"createtime":"2017-02-27 17:20:02","usedtime":null,"timestamp":"2017-02-27 17:20:02","remarks":null,"formid":"0","typeid":"1","outid":""},{"id":"103697","title":"\\u666e\\u901a\\u4f18\\u60e0\\u5238","coupon_id":"125","user_id":"24025","user_name":"15961167765","begintime":"2017-02-20","endtime":"2018-05-26","commoncode":"ssa848441874","money":"20.00","lowemoney":"50.00","issue":"1","ischecked":null,"createtime":"2017-03-09 11:34:54","usedtime":null,"timestamp":"2017-03-09 11:34:54","remarks":null,"formid":"0","typeid":"1","outid":""},{"id":"103698","title":"\\u666e\\u901a\\u4f18\\u60e0\\u5238","coupon_id":"125","user_id":"24025","user_name":"15961167765","begintime":"2017-02-20","endtime":"2018-05-26","commoncode":"ssa890906162","money":"20.00","lowemoney":"50.00","issue":"1","ischecked":null,"createtime":"2017-03-09 11:34:55","usedtime":null,"timestamp":"2017-03-09 11:34:55","remarks":null,"formid":"0","typeid":"1","outid":""},{"id":"103699","title":"\\u666e\\u901a\\u4f18\\u60e0\\u5238","coupon_id":"125","user_id":"24025","user_name":"15961167765","begintime":"2017-02-20","endtime":"2018-05-26","commoncode":"ssa898063878","money":"20.00","lowemoney":"50.00","issue":"1","ischecked":null,"createtime":"2017-03-09 11:35:53","usedtime":null,"timestamp":"2017-03-09 11:35:53","remarks":null,"formid":"0","typeid":"1","outid":""}]}
         */

        private CouponBean coupon;
        private List<ActivityBean> activity;

        public CouponBean getCoupon() {
            return coupon;
        }

        public void setCoupon(CouponBean coupon) {
            this.coupon = coupon;
        }

        public List<ActivityBean> getActivity() {
            return activity;
        }

        public void setActivity(List<ActivityBean> activity) {
            this.activity = activity;
        }

        public static class CouponBean {
            private List<ApplicableBean> applicable;
            private List<NotapplicableBean> notapplicable;

            public List<ApplicableBean> getApplicable() {
                return applicable;
            }

            public void setApplicable(List<ApplicableBean> applicable) {
                this.applicable = applicable;
            }

            public List<NotapplicableBean> getNotapplicable() {
                return notapplicable;
            }

            public void setNotapplicable(List<NotapplicableBean> notapplicable) {
                this.notapplicable = notapplicable;
            }

            public static class ApplicableBean {
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
                 * outid :
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
                private String outid;

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

                public String getOutid() {
                    return outid;
                }

                public void setOutid(String outid) {
                    this.outid = outid;
                }
            }

            public static class NotapplicableBean {
                /**
                 * id : 103696
                 * title : \u666e\u901a\u4f18\u60e0\u5238
                 * coupon_id : 125
                 * user_id : 24025
                 * user_name : 15961167765
                 * begintime : 2017-02-20
                 * endtime : 2018-05-26
                 * commoncode : ssa836412451
                 * money : 20.00
                 * lowemoney : 50.00
                 * issue : 1
                 * ischecked : null
                 * createtime : 2017-02-27 17:20:02
                 * usedtime : null
                 * timestamp : 2017-02-27 17:20:02
                 * remarks : null
                 * formid : 0
                 * typeid : 1
                 * outid :
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
                private String outid;

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

                public String getOutid() {
                    return outid;
                }

                public void setOutid(String outid) {
                    this.outid = outid;
                }
            }
        }

        public static class ActivityBean {
            /**
             * base : {"id":"15","activity_name":"app\\u4e0b\\u5355\\u7acb\\u51cf","activity_rule_id":"15","begin_datetime":"2017-02-21 15:14:19","end_datetime":"2017-04-30 15:14:19","city_id":"115","is_mobile":"2","activity_state":"1","remark":"\\u6b64\\u5904\\u7701\\u7565128\\u4e2a\\u5b57","add_date":"2017-02-28 15:15:48"}
             * rule : {"id":"15","rule_type":"1","rule_name":"\\u4e0b\\u5355\\u7acb\\u51cf","full_num":"0","less_money":"3","remark":"\\u4e0b\\u5355\\u7acb\\u51cf","is_all_goods":"0","add_date":"2017-02-28 15:15:48"}
             * goods : [{"id":"480","activity_id":"15","goods_id":"13510","team_id":"76607","team_sub_id":"142225","city_id":"115","goods_type":"1","add_date":"2017-03-02 17:20:39","godate":"2017-03-28"}]
             */

            private BaseBean base;
            private RuleBean rule;
            private List<GoodsBean> goods;

            public BaseBean getBase() {
                return base;
            }

            public void setBase(BaseBean base) {
                this.base = base;
            }

            public RuleBean getRule() {
                return rule;
            }

            public void setRule(RuleBean rule) {
                this.rule = rule;
            }

            public List<GoodsBean> getGoods() {
                return goods;
            }

            public void setGoods(List<GoodsBean> goods) {
                this.goods = goods;
            }

            public static class BaseBean {
                /**
                 * id : 15
                 * activity_name : app\u4e0b\u5355\u7acb\u51cf
                 * activity_rule_id : 15
                 * begin_datetime : 2017-02-21 15:14:19
                 * end_datetime : 2017-04-30 15:14:19
                 * city_id : 115
                 * is_mobile : 2
                 * activity_state : 1
                 * remark : \u6b64\u5904\u7701\u7565128\u4e2a\u5b57
                 * add_date : 2017-02-28 15:15:48
                 */

                private String id;
                private String activity_name;
                private String activity_rule_id;
                private String begin_datetime;
                private String end_datetime;
                private String city_id;
                private String is_mobile;
                private String activity_state;
                private String remark;
                private String add_date;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getActivity_name() {
                    return activity_name;
                }

                public void setActivity_name(String activity_name) {
                    this.activity_name = activity_name;
                }

                public String getActivity_rule_id() {
                    return activity_rule_id;
                }

                public void setActivity_rule_id(String activity_rule_id) {
                    this.activity_rule_id = activity_rule_id;
                }

                public String getBegin_datetime() {
                    return begin_datetime;
                }

                public void setBegin_datetime(String begin_datetime) {
                    this.begin_datetime = begin_datetime;
                }

                public String getEnd_datetime() {
                    return end_datetime;
                }

                public void setEnd_datetime(String end_datetime) {
                    this.end_datetime = end_datetime;
                }

                public String getCity_id() {
                    return city_id;
                }

                public void setCity_id(String city_id) {
                    this.city_id = city_id;
                }

                public String getIs_mobile() {
                    return is_mobile;
                }

                public void setIs_mobile(String is_mobile) {
                    this.is_mobile = is_mobile;
                }

                public String getActivity_state() {
                    return activity_state;
                }

                public void setActivity_state(String activity_state) {
                    this.activity_state = activity_state;
                }

                public String getRemark() {
                    return remark;
                }

                public void setRemark(String remark) {
                    this.remark = remark;
                }

                public String getAdd_date() {
                    return add_date;
                }

                public void setAdd_date(String add_date) {
                    this.add_date = add_date;
                }
            }

            public static class RuleBean {
                /**
                 * id : 15
                 * rule_type : 1
                 * rule_name : \u4e0b\u5355\u7acb\u51cf
                 * full_num : 0
                 * less_money : 3
                 * remark : \u4e0b\u5355\u7acb\u51cf
                 * is_all_goods : 0
                 * add_date : 2017-02-28 15:15:48
                 */

                private String id;
                private String rule_type;
                private String rule_name;
                private String full_num;
                private String less_money;
                private String remark;
                private String is_all_goods;
                private String add_date;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getRule_type() {
                    return rule_type;
                }

                public void setRule_type(String rule_type) {
                    this.rule_type = rule_type;
                }

                public String getRule_name() {
                    return rule_name;
                }

                public void setRule_name(String rule_name) {
                    this.rule_name = rule_name;
                }

                public String getFull_num() {
                    return full_num;
                }

                public void setFull_num(String full_num) {
                    this.full_num = full_num;
                }

                public String getLess_money() {
                    return less_money;
                }

                public void setLess_money(String less_money) {
                    this.less_money = less_money;
                }

                public String getRemark() {
                    return remark;
                }

                public void setRemark(String remark) {
                    this.remark = remark;
                }

                public String getIs_all_goods() {
                    return is_all_goods;
                }

                public void setIs_all_goods(String is_all_goods) {
                    this.is_all_goods = is_all_goods;
                }

                public String getAdd_date() {
                    return add_date;
                }

                public void setAdd_date(String add_date) {
                    this.add_date = add_date;
                }
            }

            public static class GoodsBean {
                /**
                 * id : 480
                 * activity_id : 15
                 * goods_id : 13510
                 * team_id : 76607
                 * team_sub_id : 142225
                 * city_id : 115
                 * goods_type : 1
                 * add_date : 2017-03-02 17:20:39
                 * godate : 2017-03-28
                 */

                private String id;
                private String activity_id;
                private String goods_id;
                private String team_id;
                private String team_sub_id;
                private String city_id;
                private String goods_type;
                private String add_date;
                private String godate;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getActivity_id() {
                    return activity_id;
                }

                public void setActivity_id(String activity_id) {
                    this.activity_id = activity_id;
                }

                public String getGoods_id() {
                    return goods_id;
                }

                public void setGoods_id(String goods_id) {
                    this.goods_id = goods_id;
                }

                public String getTeam_id() {
                    return team_id;
                }

                public void setTeam_id(String team_id) {
                    this.team_id = team_id;
                }

                public String getTeam_sub_id() {
                    return team_sub_id;
                }

                public void setTeam_sub_id(String team_sub_id) {
                    this.team_sub_id = team_sub_id;
                }

                public String getCity_id() {
                    return city_id;
                }

                public void setCity_id(String city_id) {
                    this.city_id = city_id;
                }

                public String getGoods_type() {
                    return goods_type;
                }

                public void setGoods_type(String goods_type) {
                    this.goods_type = goods_type;
                }

                public String getAdd_date() {
                    return add_date;
                }

                public void setAdd_date(String add_date) {
                    this.add_date = add_date;
                }

                public String getGodate() {
                    return godate;
                }

                public void setGodate(String godate) {
                    this.godate = godate;
                }
            }
        }
    }
}
