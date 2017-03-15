package com.example.host.jsnewmall.model;

/**
 * Created by host on 2017/2/17.
 */

public class TravelWeekThirdInfo {
    private String title;
    private Integer imageId;
    private String imurl;
    public TravelWeekThirdInfo(String title, Integer imageId,String imgurl) {
        super();
        this.title = title;
        this.imageId = imageId;
        this.imurl=imgurl;
    }

    public String getImurl() {
        return imurl;
    }

    public void setImurl(String imurl) {
        this.imurl = imurl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }
}
