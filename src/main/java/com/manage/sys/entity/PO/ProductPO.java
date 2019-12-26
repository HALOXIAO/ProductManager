package com.manage.sys.entity.PO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("product")
public class ProductPO {
    @TableId(type = IdType.AUTO)
    private Long productId;

    @TableField()
    private String productNumber;

    @TableField
    private String specifications;

    @TableField
    private String commodityName;
    @TableField
    private String commodityCode;
    @TableField
    private String commodityCategory;
    @TableField
    private String brand;
    @TableField
    private String unitOfMeasurement;
    @TableField
    private String color;
    @TableField
    private String material;
    @TableField
    private String defaultPurchasePrice;
    @TableField
    private String defaultSellingPrice;
    @TableField
    private String description;
    @TableField
    private Long updaterId;
    @TableField
    private java.sql.Timestamp updateTime;
    @TableField
    private int status;
    @TableField
    private String picture;

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getSpecifications() {
        return this.specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public String getCommodityName() {
        return this.commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCommodityCode() {
        return this.commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    public String getCommodityCategory() {
        return this.commodityCategory;
    }

    public void setCommodityCategory(String commodityCategory) {
        this.commodityCategory = commodityCategory;
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

    public String getDefaultPurchasePrice() {
        return this.defaultPurchasePrice;
    }

    public void setDefaultPurchasePrice(String defaultPurchasePrice) {
        this.defaultPurchasePrice = defaultPurchasePrice;
    }

    public String getDefaultSellingPrice() {
        return this.defaultSellingPrice;
    }

    public void setDefaultSellingPrice(String defaultSellingPrice) {
        this.defaultSellingPrice = defaultSellingPrice;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getUpdaterId() {
        return this.updaterId;
    }

    public void setUpdaterId(Long updaterId) {
        this.updaterId = updaterId;
    }

    public java.sql.Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(java.sql.Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
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
        return "ProductPO{" +
                "productId=" + productId +
                ", productNumber='" + productNumber + '\'' +
                ", specifications='" + specifications + '\'' +
                ", commodityName='" + commodityName + '\'' +
                ", commodityCode='" + commodityCode + '\'' +
                ", commodityCategory='" + commodityCategory + '\'' +
                ", brand='" + brand + '\'' +
                ", unitOfMeasurement='" + unitOfMeasurement + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", defaultPurchasePrice='" + defaultPurchasePrice + '\'' +
                ", defaultSellingPrice='" + defaultSellingPrice + '\'' +
                ", description='" + description + '\'' +
                ", updaterId=" + updaterId +
                ", updateTime=" + updateTime +
                ", status=" + status +
                ", picture='" + picture + '\'' +
                '}';
    }
}
