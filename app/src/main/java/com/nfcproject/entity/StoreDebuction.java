package com.nfcproject.entity;

/**
 * Created by leo on 2017/2/23.
 */

public class StoreDebuction {
    private String sd_key;
    private String sd_value;
    private boolean selected=false;

    public StoreDebuction(String sd_key, String sd_value, boolean selected) {
        this.sd_key = sd_key;
        this.sd_value = sd_value;
        this.selected = selected;
    }

    public StoreDebuction() {
    }

    public String getSd_key() {
        return sd_key;
    }

    public void setSd_key(String sd_key) {
        this.sd_key = sd_key;
    }

    public String getSd_value() {
        return sd_value;
    }

    public void setSd_value(String sd_value) {
        this.sd_value = sd_value;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
