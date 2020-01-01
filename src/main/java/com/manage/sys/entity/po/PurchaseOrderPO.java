package com.manage.sys.entity.po;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName( "purchase_order")
public class PurchaseOrderPO {
    @TableId( "purchase_id")
    private Long purchaseId;

    @TableField( "purchase_order_number")
    private String purchaseOrderNumber;

    @TableField( "supplier_id")
    private Long supplierId;

    @TableField( "supplier_name")
    private String supplierName;

    @TableField( "order_type")
    private Integer orderType;

    @TableField( "total_price")
    private Double totalPrice;

    @TableField( "total_quantity")
    private Integer totalQuantity;

    @TableField( "description")
    private String description;

    @TableField( "reviewer")
    private Long reviewer;

    @TableField( "review_state")
    private Integer reviewState;

    @TableField( "review_name")
    private String reviewName;

    @TableField( "review_result")
    private String reviewResult;

    @TableField( "review_time")
    private java.sql.Timestamp reviewTime;

    @TableField( "founder_id")
    private Long founderId;

    @TableField( "founder_name")
    private String founderName;

    @TableField( "create_time")
    private java.sql.Timestamp createTime;

    @TableField( "updater_id")
    private Long updaterId;

    @TableField( "update_time")
    private java.sql.Timestamp updateTime;

    @TableField( "status")
    private Integer status;


    public Long getPurchaseId() {
        return this.purchaseId;
    }

    public void setPurchaseId(Long purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getPurchaseOrderNumber() {
        return this.purchaseOrderNumber;
    }

    public void setPurchaseOrderNumber(String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }

    public Long getSupplierId() {
        return this.supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return this.supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Integer getOrderType() {
        return this.orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Double getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getTotalQuantity() {
        return this.totalQuantity;
    }

    public void setTotalQuantity(Integer totalQuantity) {
        this.totalQuantity = totalQuantity;
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

    public String getReviewName() {
        return this.reviewName;
    }

    public void setReviewName(String reviewName) {
        this.reviewName = reviewName;
    }

    public String getReviewResult() {
        return this.reviewResult;
    }

    public void setReviewResult(String reviewResult) {
        this.reviewResult = reviewResult;
    }

    public java.sql.Timestamp getReviewTime() {
        return this.reviewTime;
    }

    public void setReviewTime(java.sql.Timestamp reviewTime) {
        this.reviewTime = reviewTime;
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

    @Override
    public String toString() {
        return "PurchaseOrder{" +
                "purchaseId=" + purchaseId +
                ", purchaseOrderNumber='" + purchaseOrderNumber + '\'' +
                ", supplierId=" + supplierId +
                ", supplierName='" + supplierName + '\'' +
                ", orderType=" + orderType +
                ", totalPrice=" + totalPrice +
                ", totalQuantity=" + totalQuantity +
                ", description='" + description + '\'' +
                ", reviewer=" + reviewer +
                ", reviewState=" + reviewState +
                ", reviewName='" + reviewName + '\'' +
                ", reviewResult='" + reviewResult + '\'' +
                ", reviewTime=" + reviewTime +
                ", founderId=" + founderId +
                ", founderName='" + founderName + '\'' +
                ", createTime=" + createTime +
                ", updaterId=" + updaterId +
                ", updateTime=" + updateTime +
                ", status=" + status +
                '}';
    }
}
