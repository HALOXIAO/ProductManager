package com.manage.sys.entity.PO;

import com.baomidou.mybatisplus.annotation.TableName;

import javax.persistence.*;

@TableName(name = "sales")
public class SalesPO {
    private Long salesId;

    private String salesNumber;

    private String orderNumber;

    private Long customerId;

    private String customerName;

    private Long warehouseId;

    private String warehouseName;

    private Long productId;

    private String commodityName;

    private Integer quantity;

    private Integer price;

    private Integer totalPrice;

    private String description;

    private Long reviewer;

    private Integer reviewState;

    private String reviewStateResult;

    private String reviewerName;

    private java.sql.Timestamp reviewerTime;

    private java.sql.Timestamp storageTime;

    private Long founderId;

    private String founderName;

    private java.sql.Timestamp createTime;

    private Long updaterId;

    private java.sql.Timestamp updateTime;

    private Integer status;


    public Long getSalesId() {
        return this.salesId;
    }

    public void setSalesId(Long salesId) {
        this.salesId = salesId;
    }

    public String getSalesNumber() {
        return this.salesNumber;
    }

    public void setSalesNumber(String salesNumber) {
        this.salesNumber = salesNumber;
    }

    public String getOrderNumber() {
        return this.orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Long getWarehouseId() {
        return this.warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseName() {
        return this.warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getCommodityName() {
        return this.commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getPrice() {
        return this.price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getReviewer() {
        return this.reviewer;
    }

    public void setReviewer(Long reviewer) {
        this.reviewer = reviewer;
    }

    public Integer getReviewState() {
        return this.reviewState;
    }

    public void setReviewState(Integer reviewState) {
        this.reviewState = reviewState;
    }

    public String getReviewStateResult() {
        return this.reviewStateResult;
    }

    public void setReviewStateResult(String reviewStateResult) {
        this.reviewStateResult = reviewStateResult;
    }

    public String getReviewerName() {
        return this.reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public java.sql.Timestamp getReviewerTime() {
        return this.reviewerTime;
    }

    public void setReviewerTime(java.sql.Timestamp reviewerTime) {
        this.reviewerTime = reviewerTime;
    }

    public java.sql.Timestamp getStorageTime() {
        return this.storageTime;
    }

    public void setStorageTime(java.sql.Timestamp storageTime) {
        this.storageTime = storageTime;
    }

    public Long getFounderId() {
        return this.founderId;
    }

    public void setFounderId(Long founderId) {
        this.founderId = founderId;
    }

    public String getFounderName() {
        return this.founderName;
    }

    public void setFounderName(String founderName) {
        this.founderName = founderName;
    }

    public java.sql.Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(java.sql.Timestamp createTime) {
        this.createTime = createTime;
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
}
