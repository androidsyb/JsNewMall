package com.example.host.jsnewmall.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by host on 2017/3/8.
 */

public class CalendarEntry {

    /**
     * res : 1
     * msg : \u67e5\u8be2\u6210\u529f
     * data : [{"lines_id":"13510","team_id":"76603","subteam_id":"142209","price_id":"264323","date":"2017-03-09","backdate":"2017-03-14","pricetype":"1","saleprice":"3099.00","pricetypename":"\\u6210\\u4eba","crqty":"1","rtqty":"0","lrqty":"0","xsqty":"0","desc":[{"id":"264323","teamsubid":"142209","guid":"862611516467","teamsubguid":"8626115","pricetype":"1","pricetypeid":"16467","pricetypename":"\\u6210\\u4eba","saleprice":"3099.00","costprice":"2599.00","remarks":null,"crqty":"1","rtqty":"0","lrqty":"0","xsqty":"0","aclearingprice":"0.00","bclearingprice":"2599.00","cclearingprice":"0.00","dclearingprice":"0.00","eclearingprice":"0.00","lockstate":"0","isshow":"10","islogicdelete":"1","createuserid":"10274","createtime":"2017-01-25 08:37:29","timestamp":"0000-00-00 00:00:00","unittype":"0"},{"id":"264324","teamsubid":"142209","guid":"862611516468","teamsubguid":"8626115","pricetype":"1","pricetypeid":"16468","pricetypename":"\\u513f\\u7ae5","saleprice":"3399.00","costprice":"2899.00","remarks":"2-12\\u5468\\u5c81\\u513f\\u7ae5\\u4e0d\\u5360\\u5e8a\\u4e0d\\u542b\\u65e9","crqty":"1","rtqty":"0","lrqty":"0","xsqty":"0","aclearingprice":"0.00","bclearingprice":"2899.00","cclearingprice":"0.00","dclearingprice":"0.00","eclearingprice":"0.00","lockstate":"0","isshow":"10","islogicdelete":"1","createuserid":"10274","createtime":"2017-01-25 08:37:29","timestamp":"2017-02-07 10:52:12","unittype":"0"},{"id":"264325","teamsubid":"142209","guid":"862611516469","teamsubguid":"8626115","pricetype":"1","pricetypeid":"16469","pricetypename":"\\u513f\\u7ae5","saleprice":"3899.00","costprice":"3399.00","remarks":"12-18\\u5468\\u5c81\\u5fc5\\u987b\\u5360\\u5e8a\\u4ef7\\u683c","crqty":"1","rtqty":"0","lrqty":"0","xsqty":"0","aclearingprice":"0.00","bclearingprice":"3399.00","cclearingprice":"0.00","dclearingprice":"0.00","eclearingprice":"0.00","lockstate":"0","isshow":"10","islogicdelete":"1","createuserid":"10274","createtime":"2017-01-25 08:37:29","timestamp":"2017-02-07 10:52:15","unittype":"0"},{"id":"264326","teamsubid":"142209","guid":"862611516470","teamsubguid":"8626115","pricetype":"1","pricetypeid":"16470","pricetypename":"\\u8001\\u4eba","saleprice":"3399.00","costprice":"2899.00","remarks":"60\\u5468\\u5c81\\u4ee5\\u4e0a\\u8001\\u5e74\\u6536\\u5ba2\\u8bf7\\u7535\\u8be2\\uff0c\\u6574\\u56e2\\u8001\\u4eba\\u513f\\u7ae5\\u6bd4\\u4f8b\\u4e0d\\u5f97\\u8d85\\u8fc730%","crqty":"1","rtqty":"0","lrqty":"0","xsqty":"0","aclearingprice":"0.00","bclearingprice":"2899.00","cclearingprice":"0.00","dclearingprice":"0.00","eclearingprice":"0.00","lockstate":"0","isshow":"10","islogicdelete":"1","createuserid":"10274","createtime":"2017-01-25 08:37:29","timestamp":"2017-02-07 10:52:19","unittype":"0"}],"activity_desc":[]},{"lines_id":"13510","team_id":"76606","subteam_id":"142221","price_id":"264371","date":"2017-03-23","backdate":"2017-03-28","pricetype":"1","saleprice":"0.01","pricetypename":"\\u6210\\u4eba","crqty":"1","rtqty":"0","lrqty":"0","xsqty":"0","desc":[{"id":"264371","teamsubid":"142221","guid":"862911516479","teamsubguid":"8629115","pricetype":"1","pricetypeid":"16479","pricetypename":"\\u6210\\u4eba","saleprice":"0.01","costprice":"2599.00","remarks":null,"crqty":"1","rtqty":"0","lrqty":"0","xsqty":"0","aclearingprice":"0.00","bclearingprice":"2599.00","cclearingprice":"0.00","dclearingprice":"0.00","eclearingprice":"0.00","lockstate":"0","isshow":"10","islogicdelete":"1","createuserid":"10274","createtime":"2017-01-25 08:37:29","timestamp":"2017-03-06 10:29:57","unittype":"0"},{"id":"264372","teamsubid":"142221","guid":"862911516480","teamsubguid":"8629115","pricetype":"1","pricetypeid":"16480","pricetypename":"\\u513f\\u7ae5","saleprice":"3399.00","costprice":"2899.00","remarks":"2-12\\u5468\\u5c81\\u513f\\u7ae5\\u4e0d\\u5360\\u5e8a\\u4e0d\\u542b\\u65e9","crqty":"1","rtqty":"0","lrqty":"0","xsqty":"0","aclearingprice":"0.00","bclearingprice":"2899.00","cclearingprice":"0.00","dclearingprice":"0.00","eclearingprice":"0.00","lockstate":"0","isshow":"10","islogicdelete":"1","createuserid":"10274","createtime":"2017-01-25 08:37:29","timestamp":"2017-02-07 10:52:54","unittype":"0"},{"id":"264373","teamsubid":"142221","guid":"862911516481","teamsubguid":"8629115","pricetype":"1","pricetypeid":"16481","pricetypename":"\\u513f\\u7ae5","saleprice":"3899.00","costprice":"3399.00","remarks":"12-18\\u5468\\u5c81\\u5fc5\\u987b\\u5360\\u5e8a\\u4ef7\\u683c","crqty":"1","rtqty":"0","lrqty":"0","xsqty":"0","aclearingprice":"0.00","bclearingprice":"3399.00","cclearingprice":"0.00","dclearingprice":"0.00","eclearingprice":"0.00","lockstate":"0","isshow":"10","islogicdelete":"1","createuserid":"10274","createtime":"2017-01-25 08:37:29","timestamp":"2017-02-07 10:53:01","unittype":"0"},{"id":"264374","teamsubid":"142221","guid":"862911516482","teamsubguid":"8629115","pricetype":"1","pricetypeid":"16482","pricetypename":"\\u8001\\u4eba","saleprice":"3399.00","costprice":"2899.00","remarks":"60\\u5468\\u5c81\\u4ee5\\u4e0a\\u8001\\u5e74\\u6536\\u5ba2\\u8bf7\\u7535\\u8be2\\uff0c\\u6574\\u56e2\\u8001\\u4eba\\u513f\\u7ae5\\u6bd4\\u4f8b\\u4e0d\\u5f97\\u8d85\\u8fc730%","crqty":"1","rtqty":"0","lrqty":"0","xsqty":"0","aclearingprice":"0.00","bclearingprice":"2899.00","cclearingprice":"0.00","dclearingprice":"0.00","eclearingprice":"0.00","lockstate":"0","isshow":"10","islogicdelete":"1","createuserid":"10274","createtime":"2017-01-25 08:37:29","timestamp":"2017-02-07 10:53:05","unittype":"0"}],"activity_desc":[]},{"lines_id":"13510","team_id":"76607","subteam_id":"142225","price_id":"264387","date":"2017-03-28","backdate":"2017-04-02","pricetype":"1","saleprice":"3.01","pricetypename":"\\u6210\\u4eba","crqty":"1","rtqty":"0","lrqty":"0","xsqty":"0","desc":[{"id":"264387","teamsubid":"142225","guid":"863011516483","teamsubguid":"8630115","pricetype":"1","pricetypeid":"16483","pricetypename":"\\u6210\\u4eba","saleprice":"3.01","costprice":"2599.00","remarks":null,"crqty":"1","rtqty":"0","lrqty":"0","xsqty":"0","aclearingprice":"0.00","bclearingprice":"2599.00","cclearingprice":"0.00","dclearingprice":"0.00","eclearingprice":"0.00","lockstate":"0","isshow":"10","islogicdelete":"1","createuserid":"10274","createtime":"2017-01-25 08:37:29","timestamp":"2017-03-07 10:32:17","unittype":"0"},{"id":"264388","teamsubid":"142225","guid":"863011516484","teamsubguid":"8630115","pricetype":"1","pricetypeid":"16484","pricetypename":"\\u513f\\u7ae5","saleprice":"3399.00","costprice":"2899.00","remarks":"2-12\\u5468\\u5c81\\u513f\\u7ae5\\u4e0d\\u5360\\u5e8a\\u4e0d\\u542b\\u65e9","crqty":"1","rtqty":"0","lrqty":"0","xsqty":"0","aclearingprice":"0.00","bclearingprice":"2899.00","cclearingprice":"0.00","dclearingprice":"0.00","eclearingprice":"0.00","lockstate":"0","isshow":"10","islogicdelete":"1","createuserid":"10274","createtime":"2017-01-25 08:37:29","timestamp":"2017-02-07 10:53:01","unittype":"0"},{"id":"264389","teamsubid":"142225","guid":"863011516485","teamsubguid":"8630115","pricetype":"1","pricetypeid":"16485","pricetypename":"\\u513f\\u7ae5","saleprice":"3899.00","costprice":"3399.00","remarks":"12-18\\u5468\\u5c81\\u5fc5\\u987b\\u5360\\u5e8a\\u4ef7\\u683c","crqty":"1","rtqty":"0","lrqty":"0","xsqty":"0","aclearingprice":"0.00","bclearingprice":"3399.00","cclearingprice":"0.00","dclearingprice":"0.00","eclearingprice":"0.00","lockstate":"0","isshow":"10","islogicdelete":"1","createuserid":"10274","createtime":"2017-01-25 08:37:29","timestamp":"2017-02-07 10:53:06","unittype":"0"},{"id":"264390","teamsubid":"142225","guid":"863011516486","teamsubguid":"8630115","pricetype":"1","pricetypeid":"16486","pricetypename":"\\u8001\\u4eba","saleprice":"3399.00","costprice":"2899.00","remarks":"60\\u5468\\u5c81\\u4ee5\\u4e0a\\u8001\\u5e74\\u6536\\u5ba2\\u8bf7\\u7535\\u8be2\\uff0c\\u6574\\u56e2\\u8001\\u4eba\\u513f\\u7ae5\\u6bd4\\u4f8b\\u4e0d\\u5f97\\u8d85\\u8fc730%","crqty":"1","rtqty":"0","lrqty":"0","xsqty":"0","aclearingprice":"0.00","bclearingprice":"2899.00","cclearingprice":"0.00","dclearingprice":"0.00","eclearingprice":"0.00","lockstate":"0","isshow":"10","islogicdelete":"1","createuserid":"10274","createtime":"2017-01-25 08:37:29","timestamp":"2017-02-07 10:53:09","unittype":"0"}],"activity_desc":[{"base":{"id":"15","activity_name":"app\\u4e0b\\u5355\\u7acb\\u51cf","activity_rule_id":"15","begin_datetime":"2017-02-21 15:14:19","end_datetime":"2017-04-30 15:14:19","city_id":"115","is_mobile":"2","activity_state":"1","remark":"\\u6b64\\u5904\\u7701\\u7565128\\u4e2a\\u5b57","add_date":"2017-02-28 15:15:48"},"rule":{"id":"15","rule_type":"1","rule_name":"\\u4e0b\\u5355\\u7acb\\u51cf","full_num":"0","less_money":"3","remark":"\\u4e0b\\u5355\\u7acb\\u51cf","is_all_goods":"0","add_date":"2017-02-28 15:15:48"},"goods":[]}]}]
     */

    private int res;
    private String msg;
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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * lines_id : 13510
         * team_id : 76603
         * subteam_id : 142209
         * price_id : 264323
         * date : 2017-03-09
         * backdate : 2017-03-14
         * pricetype : 1
         * saleprice : 3099.00
         * pricetypename : \u6210\u4eba
         * crqty : 1
         * rtqty : 0
         * lrqty : 0
         * xsqty : 0
         * desc : [{"id":"264323","teamsubid":"142209","guid":"862611516467","teamsubguid":"8626115","pricetype":"1","pricetypeid":"16467","pricetypename":"\\u6210\\u4eba","saleprice":"3099.00","costprice":"2599.00","remarks":null,"crqty":"1","rtqty":"0","lrqty":"0","xsqty":"0","aclearingprice":"0.00","bclearingprice":"2599.00","cclearingprice":"0.00","dclearingprice":"0.00","eclearingprice":"0.00","lockstate":"0","isshow":"10","islogicdelete":"1","createuserid":"10274","createtime":"2017-01-25 08:37:29","timestamp":"0000-00-00 00:00:00","unittype":"0"},{"id":"264324","teamsubid":"142209","guid":"862611516468","teamsubguid":"8626115","pricetype":"1","pricetypeid":"16468","pricetypename":"\\u513f\\u7ae5","saleprice":"3399.00","costprice":"2899.00","remarks":"2-12\\u5468\\u5c81\\u513f\\u7ae5\\u4e0d\\u5360\\u5e8a\\u4e0d\\u542b\\u65e9","crqty":"1","rtqty":"0","lrqty":"0","xsqty":"0","aclearingprice":"0.00","bclearingprice":"2899.00","cclearingprice":"0.00","dclearingprice":"0.00","eclearingprice":"0.00","lockstate":"0","isshow":"10","islogicdelete":"1","createuserid":"10274","createtime":"2017-01-25 08:37:29","timestamp":"2017-02-07 10:52:12","unittype":"0"},{"id":"264325","teamsubid":"142209","guid":"862611516469","teamsubguid":"8626115","pricetype":"1","pricetypeid":"16469","pricetypename":"\\u513f\\u7ae5","saleprice":"3899.00","costprice":"3399.00","remarks":"12-18\\u5468\\u5c81\\u5fc5\\u987b\\u5360\\u5e8a\\u4ef7\\u683c","crqty":"1","rtqty":"0","lrqty":"0","xsqty":"0","aclearingprice":"0.00","bclearingprice":"3399.00","cclearingprice":"0.00","dclearingprice":"0.00","eclearingprice":"0.00","lockstate":"0","isshow":"10","islogicdelete":"1","createuserid":"10274","createtime":"2017-01-25 08:37:29","timestamp":"2017-02-07 10:52:15","unittype":"0"},{"id":"264326","teamsubid":"142209","guid":"862611516470","teamsubguid":"8626115","pricetype":"1","pricetypeid":"16470","pricetypename":"\\u8001\\u4eba","saleprice":"3399.00","costprice":"2899.00","remarks":"60\\u5468\\u5c81\\u4ee5\\u4e0a\\u8001\\u5e74\\u6536\\u5ba2\\u8bf7\\u7535\\u8be2\\uff0c\\u6574\\u56e2\\u8001\\u4eba\\u513f\\u7ae5\\u6bd4\\u4f8b\\u4e0d\\u5f97\\u8d85\\u8fc730%","crqty":"1","rtqty":"0","lrqty":"0","xsqty":"0","aclearingprice":"0.00","bclearingprice":"2899.00","cclearingprice":"0.00","dclearingprice":"0.00","eclearingprice":"0.00","lockstate":"0","isshow":"10","islogicdelete":"1","createuserid":"10274","createtime":"2017-01-25 08:37:29","timestamp":"2017-02-07 10:52:19","unittype":"0"}]
         * activity_desc : []
         */

        private String lines_id;
        private String team_id;
        private String subteam_id;
        private String price_id;
        private String date;
        private String backdate;
        private String pricetype;
        private String saleprice;
        private String pricetypename;
        private String crqty;
        private String rtqty;
        private String lrqty;
        private String xsqty;
        private List<DescBean> desc;
        private List<?> activity_desc;

        public String getLines_id() {
            return lines_id;
        }

        public void setLines_id(String lines_id) {
            this.lines_id = lines_id;
        }

        public String getTeam_id() {
            return team_id;
        }

        public void setTeam_id(String team_id) {
            this.team_id = team_id;
        }

        public String getSubteam_id() {
            return subteam_id;
        }

        public void setSubteam_id(String subteam_id) {
            this.subteam_id = subteam_id;
        }

        public String getPrice_id() {
            return price_id;
        }

        public void setPrice_id(String price_id) {
            this.price_id = price_id;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getBackdate() {
            return backdate;
        }

        public void setBackdate(String backdate) {
            this.backdate = backdate;
        }

        public String getPricetype() {
            return pricetype;
        }

        public void setPricetype(String pricetype) {
            this.pricetype = pricetype;
        }

        public String getSaleprice() {
            return saleprice;
        }

        public void setSaleprice(String saleprice) {
            this.saleprice = saleprice;
        }

        public String getPricetypename() {
            return pricetypename;
        }

        public void setPricetypename(String pricetypename) {
            this.pricetypename = pricetypename;
        }

        public String getCrqty() {
            return crqty;
        }

        public void setCrqty(String crqty) {
            this.crqty = crqty;
        }

        public String getRtqty() {
            return rtqty;
        }

        public void setRtqty(String rtqty) {
            this.rtqty = rtqty;
        }

        public String getLrqty() {
            return lrqty;
        }

        public void setLrqty(String lrqty) {
            this.lrqty = lrqty;
        }

        public String getXsqty() {
            return xsqty;
        }

        public void setXsqty(String xsqty) {
            this.xsqty = xsqty;
        }

        public List<DescBean> getDesc() {
            return desc;
        }

        public void setDesc(List<DescBean> desc) {
            this.desc = desc;
        }

        public List<?> getActivity_desc() {
            return activity_desc;
        }

        public void setActivity_desc(List<?> activity_desc) {
            this.activity_desc = activity_desc;
        }

        public static class DescBean implements Serializable {
            /**
             * id : 264323
             * teamsubid : 142209
             * guid : 862611516467
             * teamsubguid : 8626115
             * pricetype : 1
             * pricetypeid : 16467
             * pricetypename : \u6210\u4eba
             * saleprice : 3099.00
             * costprice : 2599.00
             * remarks : null
             * crqty : 1
             * rtqty : 0
             * lrqty : 0
             * xsqty : 0
             * aclearingprice : 0.00
             * bclearingprice : 2599.00
             * cclearingprice : 0.00
             * dclearingprice : 0.00
             * eclearingprice : 0.00
             * lockstate : 0
             * isshow : 10
             * islogicdelete : 1
             * createuserid : 10274
             * createtime : 2017-01-25 08:37:29
             * timestamp : 0000-00-00 00:00:00
             * unittype : 0
             */

            private String id;
            private String teamsubid;
            private String guid;
            private String teamsubguid;
            private String pricetype;
            private String pricetypeid;
            private String pricetypename;
            private String saleprice;
            private String costprice;
            private Object remarks;
            private String crqty;
            private String rtqty;
            private String lrqty;
            private String xsqty;
            private String aclearingprice;
            private String bclearingprice;
            private String cclearingprice;
            private String dclearingprice;
            private String eclearingprice;
            private String lockstate;
            private String isshow;
            private String islogicdelete;
            private String createuserid;
            private String createtime;
            private String timestamp;
            private String unittype;
            private int selectnum;

            public int getSelectnum() {
                return selectnum;
            }

            public void setSelectnum(int selectnum) {
                this.selectnum = selectnum;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTeamsubid() {
                return teamsubid;
            }

            public void setTeamsubid(String teamsubid) {
                this.teamsubid = teamsubid;
            }

            public String getGuid() {
                return guid;
            }

            public void setGuid(String guid) {
                this.guid = guid;
            }

            public String getTeamsubguid() {
                return teamsubguid;
            }

            public void setTeamsubguid(String teamsubguid) {
                this.teamsubguid = teamsubguid;
            }

            public String getPricetype() {
                return pricetype;
            }

            public void setPricetype(String pricetype) {
                this.pricetype = pricetype;
            }

            public String getPricetypeid() {
                return pricetypeid;
            }

            public void setPricetypeid(String pricetypeid) {
                this.pricetypeid = pricetypeid;
            }

            public String getPricetypename() {
                return pricetypename;
            }

            public void setPricetypename(String pricetypename) {
                this.pricetypename = pricetypename;
            }

            public String getSaleprice() {
                return saleprice;
            }

            public void setSaleprice(String saleprice) {
                this.saleprice = saleprice;
            }

            public String getCostprice() {
                return costprice;
            }

            public void setCostprice(String costprice) {
                this.costprice = costprice;
            }

            public Object getRemarks() {
                return remarks;
            }

            public void setRemarks(Object remarks) {
                this.remarks = remarks;
            }

            public String getCrqty() {
                return crqty;
            }

            public void setCrqty(String crqty) {
                this.crqty = crqty;
            }

            public String getRtqty() {
                return rtqty;
            }

            public void setRtqty(String rtqty) {
                this.rtqty = rtqty;
            }

            public String getLrqty() {
                return lrqty;
            }

            public void setLrqty(String lrqty) {
                this.lrqty = lrqty;
            }

            public String getXsqty() {
                return xsqty;
            }

            public void setXsqty(String xsqty) {
                this.xsqty = xsqty;
            }

            public String getAclearingprice() {
                return aclearingprice;
            }

            public void setAclearingprice(String aclearingprice) {
                this.aclearingprice = aclearingprice;
            }

            public String getBclearingprice() {
                return bclearingprice;
            }

            public void setBclearingprice(String bclearingprice) {
                this.bclearingprice = bclearingprice;
            }

            public String getCclearingprice() {
                return cclearingprice;
            }

            public void setCclearingprice(String cclearingprice) {
                this.cclearingprice = cclearingprice;
            }

            public String getDclearingprice() {
                return dclearingprice;
            }

            public void setDclearingprice(String dclearingprice) {
                this.dclearingprice = dclearingprice;
            }

            public String getEclearingprice() {
                return eclearingprice;
            }

            public void setEclearingprice(String eclearingprice) {
                this.eclearingprice = eclearingprice;
            }

            public String getLockstate() {
                return lockstate;
            }

            public void setLockstate(String lockstate) {
                this.lockstate = lockstate;
            }

            public String getIsshow() {
                return isshow;
            }

            public void setIsshow(String isshow) {
                this.isshow = isshow;
            }

            public String getIslogicdelete() {
                return islogicdelete;
            }

            public void setIslogicdelete(String islogicdelete) {
                this.islogicdelete = islogicdelete;
            }

            public String getCreateuserid() {
                return createuserid;
            }

            public void setCreateuserid(String createuserid) {
                this.createuserid = createuserid;
            }

            public String getCreatetime() {
                return createtime;
            }

            public void setCreatetime(String createtime) {
                this.createtime = createtime;
            }

            public String getTimestamp() {
                return timestamp;
            }

            public void setTimestamp(String timestamp) {
                this.timestamp = timestamp;
            }

            public String getUnittype() {
                return unittype;
            }

            public void setUnittype(String unittype) {
                this.unittype = unittype;
            }
        }
    }
}
