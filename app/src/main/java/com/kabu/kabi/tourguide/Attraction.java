package com.kabu.kabi.tourguide;

public class Attraction {

    private String mName, mAddress;
    private int mResourceImageId;

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    public int getResourceImageId() {
        return mResourceImageId;
    }

    public void setResourceImageId(int resourceImageId) {
        mResourceImageId = resourceImageId;
    }

    public Attraction(String name, String address) {
        mName = name;
        mAddress = address;
        mResourceImageId = 0;
    }

    public Attraction(String name, String address, int resourceImageId) {
        mName = name;
        mAddress = address;
        mResourceImageId = resourceImageId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }
}
