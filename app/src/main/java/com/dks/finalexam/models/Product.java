package com.dks.finalexam.models;

import com.google.gson.annotations.SerializedName;

public class Product {
    @SerializedName("id")
    private String product_id;
    @SerializedName("name")
    private String product_name;
    @SerializedName("description")
    private String product_description;
    @SerializedName("code")
    private double product_code;

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public double getProduct_code() {
        return product_code;
    }

    public void setProduct_code(double product_code) {
        this.product_code = product_code;
    }

    public double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    public String getProduct_image() {
        return product_image;
    }

    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }

    public int getProduct_totalRate() {
        return product_totalRate;
    }

    public void setProduct_totalRate(int product_totalRate) {
        this.product_totalRate = product_totalRate;
    }

    public double getProduct_averageRate() {
        return product_averageRate;
    }

    public void setProduct_averageRate(double product_averageRate) {
        this.product_averageRate = product_averageRate;
    }

    public int getProduct_totalView() {
        return product_totalView;
    }

    public void setProduct_totalView(int product_totalView) {
        this.product_totalView = product_totalView;
    }

    public int getProduct_categoryId() {
        return product_categoryId;
    }

    public void setProduct_categoryId(int product_categoryId) {
        this.product_categoryId = product_categoryId;
    }

    public String getProduct_categoryName() {
        return product_categoryName;
    }

    public void setProduct_categoryName(String product_categoryName) {
        this.product_categoryName = product_categoryName;
    }

    @SerializedName("price")
    private double product_price;
    @SerializedName("imageUrl")
    private String product_image;
    @SerializedName("totalRate")
    private int product_totalRate;
    @SerializedName("averageRate")
    private double product_averageRate;
    @SerializedName("totalView")
    private int product_totalView;
    @SerializedName("categoryId")
    private int product_categoryId;
    @SerializedName("categoryName")
    private String product_categoryName;



}
