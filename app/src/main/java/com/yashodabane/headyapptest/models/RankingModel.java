package com.yashodabane.headyapptest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class RankingModel {
    @SerializedName("ranking")
    @Expose
    private String ranking;
    @SerializedName("products")
    @Expose
    private ArrayList<ProductData> products = null;

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public ArrayList<ProductData> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<ProductData> products) {
        this.products = products;
    }
}
