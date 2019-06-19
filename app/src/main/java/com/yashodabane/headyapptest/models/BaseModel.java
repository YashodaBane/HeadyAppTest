package com.yashodabane.headyapptest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;


public class BaseModel {
    @SerializedName("categories")
    @Expose
    private ArrayList<CategoryModel> categories = null;
    @SerializedName("rankings")
    @Expose
    private ArrayList<RankingModel> rankings = null;

    public ArrayList<CategoryModel> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<CategoryModel> categories) {
        this.categories = categories;
    }

    public ArrayList<RankingModel> getRankings() {
        return rankings;
    }

    public void setRankings(ArrayList<RankingModel> rankings) {
        this.rankings = rankings;
    }
}
