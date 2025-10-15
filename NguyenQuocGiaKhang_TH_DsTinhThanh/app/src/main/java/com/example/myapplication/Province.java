package com.example.myapplication;

public class Province {
    String province;

    public Province(String province) {
        this.province = province;
    }

    public String getProvince() {
        return province;
    }
    @Override
    public String toString() {
        return province;
    }
}