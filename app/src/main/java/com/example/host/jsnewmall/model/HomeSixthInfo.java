package com.example.host.jsnewmall.model;

/**
 * Created by host on 2017/2/15.
 */

public class HomeSixthInfo {
    private String titlea;
    private Integer imageId;
    private String titleb;
    private String titlec;
    private String titled;
    private String titlee;
    private String titlef;
    private String titleg;
    private String titleh;
    private String titlei;
    private String picurl;

    public HomeSixthInfo(String titlea,String titleb,String titlec,String titled,String titlee,String titlef,Integer imageId,String picurl){

        this.titlea=titlea;
        this.titleb=titleb;
        this.titlec=titlec;
        this.titled=titled;
        this.titlee=titlee;
        this.titlef=titlef;
        this.imageId=imageId;
        this.picurl=picurl;

    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    public String getTitlea() {
        return titlea;
    }

    public void setTitlea(String titlea) {
        this.titlea = titlea;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getTitleb() {
        return titleb;
    }

    public void setTitleb(String titleb) {
        this.titleb = titleb;
    }

    public String getTitlec() {
        return titlec;
    }

    public void setTitlec(String titlec) {
        this.titlec = titlec;
    }

    public String getTitled() {
        return titled;
    }

    public void setTitled(String titled) {
        this.titled = titled;
    }

    public String getTitlee() {
        return titlee;
    }

    public void setTitlee(String titlee) {
        this.titlee = titlee;
    }

    public String getTitlef() {
        return titlef;
    }

    public void setTitlef(String titlef) {
        this.titlef = titlef;
    }

    public String getTitleg() {
        return titleg;
    }

    public void setTitleg(String titleg) {
        this.titleg = titleg;
    }

    public String getTitleh() {
        return titleh;
    }

    public void setTitleh(String titleh) {
        this.titleh = titleh;
    }

    public String getTitlei() {
        return titlei;
    }

    public void setTitlei(String titlei) {
        this.titlei = titlei;
    }
}
