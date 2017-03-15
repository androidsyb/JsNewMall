package com.example.host.jsnewmall.model;

/**
 * Created by host on 2017/2/15.
 */

public class HomeThirdInfo {
    private String titlea;
    private Integer imageId;
    private String titleb;
    public HomeThirdInfo(String titlea,String titleb, Integer imageId) {
        super();
        this.titlea = titlea;
        this.titleb = titleb;
        this.imageId = imageId;
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

    public String getTitlea() {
        return titlea;
    }

    public void setTitlea(String titlea) {
        this.titlea = titlea;
    }
}
