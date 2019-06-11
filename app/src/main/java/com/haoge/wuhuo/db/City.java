package com.haoge.wuhuo.db;

import org.litepal.crud.LitePalSupport;

public class City extends LitePalSupport {
    private int id;
    private String cityName;
    private int cytyCode;
    private int proviceId;

    public int getId() {
        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public int getCytyCode() {
        return cytyCode;
    }

    public int getProviceId() {
        return proviceId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCytyCode(int cytyCode) {
        this.cytyCode = cytyCode;
    }

    public void setProviceId(int proviceId) {
        this.proviceId = proviceId;
    }
}
