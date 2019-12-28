package com.manage.sys.entity.PO;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;


@TableName( "product")
public class ProductPO {
    @TableId( "product_id")
    private Long productId;

    @TableField( "product_number")
    private String productNumber;

    @TableField( "product_name")
    private String productName;

    @TableField( "single_price")
    private Double singlePrice;

    @TableField( "specifications")
    private String specifications;

    @TableField( "product_category")
    private String productCategory;

    @TableField( "brand")
    private String brand;

    @TableField( "unit_of_measurement")
    private String unitOfMeasurement;

    @TableField( "color")
    private String color;

    @TableField( "material")
    private String material;

    @TableField( "description")
    private String description;

    @TableField( "updater_id")
    private Long updaterId;

    @TableField( "update_time")
    private java.sql.Timestamp updateTime;

    @TableField( "status")
    private Integer status;

    @TableField( "picture")
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
                ", updaterId=" + updaterId +
                ", updateTime=" + updateTime +
                ", status=" + status +
                ", picture='" + picture + '\'' +
                '}';
    }
}
