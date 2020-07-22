package com.dks.finalexam.models;

import com.google.gson.annotations.SerializedName;

public class Account {
    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("profile_image]")
    private String profile_image;
    @SerializedName("phone")
    private String phone;
    @SerializedName("province")
    private String province;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
