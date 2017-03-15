package com.example.host.jsnewmall.model;

/**
 * Created by host on 2017/2/15.
 */

public class HomeFifthInfo {
    private String titlea;
    private Integer imageId;
    private String titleb;
    private String titlec;
    public HomeFifthInfo(String titlea,String titleb,String titlec, Integer imageId) {
        super();
        this.titlea = titlea;
        this.titleb = titleb;
        this.imageId = imageId;
        this.titlec=titlec;
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
}
