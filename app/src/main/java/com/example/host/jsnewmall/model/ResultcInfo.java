package com.example.host.jsnewmall.model;

/**
 * Created by host on 2017/2/23.
 */

public class ResultcInfo {
    private String linkurl;
    private boolean isChecked;
    public void setChecked(boolean checked) {
        isChecked = checked;
    }
    public boolean isChecked() {
        return isChecked;
    }
    public ResultcInfo(String linkurl){
        this.linkurl=linkurl;
    }

    public String getLinkurl() {
        return linkurl;
    }

    public void setLinkurl(String linkurl) {
        this.linkurl = linkurl;
    }
}
