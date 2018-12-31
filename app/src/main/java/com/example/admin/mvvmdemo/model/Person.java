package com.example.admin.mvvmdemo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Person {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("imageurl")
    @Expose
    private String picUrl;


    public String getName() {
        return name;
    }

    public String getPicUrl() {
        return picUrl;
    }
}
