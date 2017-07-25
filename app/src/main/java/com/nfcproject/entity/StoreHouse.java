package com.nfcproject.entity;

/**
 * Created by leo on 2017/2/23.
 */

public class StoreHouse {
    private String houseNum;
    private String houseID;
    private boolean selected=false;

    public StoreHouse(String houseNum, String houseID, boolean selected) {
        this.houseNum = houseNum;
        this.houseID = houseID;
        this.selected = selected;
    }

    public StoreHouse() {
    }

    public String getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(String houseNum) {
        this.houseNum = houseNum;
    }

    public String getHouseID() {
        return houseID;
    }

    public void setHouseID(String houseID) {
        this.houseID = houseID;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
