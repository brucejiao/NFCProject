package com.nfcproject.entity;

/**
 * Created by leo on 2017/2/23.
 */

public class StoreInfo {
    private String       storeHouseID;      //顶部仓房号
    private String       varicty;        //品种
    private String       price;        //价格
    private String       carNum ;        //车船号
    private String       cusName;       //客户名称
    private String       workType;       //作业类型（1，入库；2，出库）
    private String       link;           //环节（3，已称毛；5，已称皮）
    private String       grossweight;    //毛重

    public StoreInfo() {
    }

    public String getStoreHouseID() {
        return storeHouseID;
    }

    public void setStoreHouseID(String storeHouseID) {
        this.storeHouseID = storeHouseID;
    }

    public String getVaricty() {
        return varicty;
    }

    public void setVaricty(String varicty) {
        this.varicty = varicty;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getGrossweight() {
        return grossweight;
    }

    public void setGrossweight(String grossweight) {
        this.grossweight = grossweight;
    }
}
