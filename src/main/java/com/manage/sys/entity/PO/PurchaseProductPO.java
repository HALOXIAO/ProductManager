package com.manage.sys.entity.PO;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;


@TableName("purchase_product")
public class PurchaseProductPO {
    @TableId("purchase_product_id")
    private Long purchaseProductId;

    @TableField("purchase_product_number")
    private String purchaseProductNumber;

    @TableField("purchase_product_name")
    private String purchaseProductName;

    @TableField("quantity")
    private Integer quantity;

    @TableField("price")
    private Double price;

    @TableField("color")
    private String color;

    @TableField("material")
    private String material;

    @TableField("description")
    private String description;

    @TableField("status")
    private Integer status;

    @TableField("picture")
    private String picture;

    @TableField("unit_of_measurement")
    private String unitOfMeasurement;

    @TableField("brand")
    private String brand;

    @TableField("product_category")
    private String productCategory;

    @TableField("update_time")
    private java.sql.Timestamp updateTime;


    public Long getPurchaseProductId() {
        return this.purchaseProductId;
    }

    public void setPurchaseProductId(Long purchaseProductId) {
        this.purchaseProductId = purchaseProductId;
    }

    public String getPurchaseProductNumber() {
        return this.purchaseProductNumber;
    }

    public void setPurchaseProductNumber(String purchaseProductNumber) {
        this.purchaseProductNumber = purchaseProductNumber;
    }

    public String getPurchaseProductName() {
        return this.purchaseProductName;
    }

    public void setPurchaseProductName(String purchaseProductName) {
        this.purchaseProductName = purchaseProductName;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
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

    public String getUnitOfMeasurement() {
        return this.unitOfMeasurement;
    }

    public void setUnitOfMeasurement(String unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProductCategory() {
        return this.productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public java.sql.Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(java.sql.Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}
