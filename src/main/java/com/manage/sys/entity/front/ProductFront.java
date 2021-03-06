package com.manage.sys.entity.front;


import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

public class ProductFront {
    @Null
    private Long productId;

    @Null
    private String productNumber;

    @NotEmpty
    @Length(max = 15)
    private String productName;

    @NotNull
    @Min(0)
    private Double singlePrice;

    @NotEmpty
    @Length(max = 50)
    private String specifications;

    @NotEmpty
    @Length(max = 30)
    private String productCategory;

    @NotEmpty
    @Length(max = 50)
    private String brand;

    @NotEmpty
    @Length(max = 20)
    private String unitOfMeasurement;

    @Length(max = 20)
    private String color;

    @Length(max = 50)
    private String material;

    @Length(max = 200)
    private String description;


    @Null
    private java.sql.Timestamp updateTime;

    @NotNull
    private Integer status;

    private String picture;


    public Long getProductId() {
        return this.productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductNumber() {
        return this.productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getSinglePrice() {
        return this.singlePrice;
    }

    public void setSinglePrice(Double singlePrice) {
        this.singlePrice = singlePrice;
    }

    public String getSpecifications() {
        return this.specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public String getProductCategory() {
        return this.productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getUnitOfMeasurement() {
        return this.unitOfMeasurement;
    }

    public void setUnitOfMeasurement(String unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public java.sql.Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(java.sql.Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPicture() {
        return this.picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productNumber='" + productNumber + '\'' +
                ", productName='" + productName + '\'' +
                ", singlePrice=" + singlePrice +
                ", specifications='" + specifications + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", brand='" + brand + '\'' +
                ", unitOfMeasurement='" + unitOfMeasurement + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", description='" + description + '\'' +
                ", updateTime=" + updateTime +
                ", status=" + status +
                ", picture='" + picture + '\'' +
                '}';
    }
}


