package com.kabu.kabi.tourguide;

public class Attraction {

    private String mName, mAddress;

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    public Attraction(String name, String address) {
        mName = name;
        mAddress = address;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }
}
