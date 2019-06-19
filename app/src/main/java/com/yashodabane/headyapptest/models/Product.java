package com.yashodabane.headyapptest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Product {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("date_added")
    @Expose
    private String dateAdded;
    @SerializedName("variants")
    @Expose
    private ArrayList<VariantModel> variants = null;
    @SerializedName("tax")
    @Expose
    private Tax tax;

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

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public ArrayList<VariantModel> getVariants() {
        return variants;
    }

    public void setVariants(ArrayList<VariantModel> variants) {
        this.variants = variants;
    }

    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

}
