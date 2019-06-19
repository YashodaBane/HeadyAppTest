package com.yashodabane.headyapptest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class CategoryModel {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("products")
    @Expose
    private ArrayList<Product> products = null;
    @SerializedName("child_categories")
    @Expose
    private ArrayList<Integer> childCategories = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Integer> getChildCategories() {
        return childCategories;
    }

    public void setChildCategories(ArrayList<Integer> childCategories) {
        this.childCategories = childCategories;
    }

}
