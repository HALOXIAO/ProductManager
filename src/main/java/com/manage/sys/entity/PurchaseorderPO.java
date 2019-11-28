package com.manage.sys.entity;

public class PurchaseorderPO {
    private Long purchaseId;
    private String purchaseOrder;
    private Long productId;
    private String commodityName;
    private Long supplierId;
    private String supplierName;
    private Long warehouseId;
    private String warehouseName;
    private Integer quantity;
    private Integer price;
    private Integer totalPrice;
    private String description;
    private Long reviewer;
    private int reviewState;
    private String reviewName;
    private String reviewResult;
    private java.sql.Timestamp reviewTime;
    private java.sql.Timestamp storageTime;
    private Long founderId;
    private String founderName;
    private java.sql.Timestamp createTime;
    private Long updaterId;
    private java.sql.Timestamp updateTime;
    private int status;
    private int orderType;

    public Long getPurchaseId() {
        return this.purchaseId;
    }

    public void setPurchaseId(Long purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getPurchaseOrder() {
        return this.purchaseOrder;
    }

    public void setPurchaseOrder(String purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
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

    public int getReviewState() {
        return this.reviewState;
    }

    public void setReviewState(int reviewState) {
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

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getOrderType() {
        return this.orderType;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }

    @Override
    public String toString() {
        return "PurchaseorderPO{" +
                "purchaseId=" + purchaseId +
                ", purchaseOrder='" + purchaseOrder + '\'' +
                ", productId=" + productId +
                ", commodityName='" + commodityName + '\'' +
                ", supplierId=" + supplierId +
                ", supplierName='" + supplierName + '\'' +
                ", warehouseId=" + warehouseId +
                ", warehouseName='" + warehouseName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", totalPrice=" + totalPrice +
                ", description='" + description + '\'' +
                ", reviewer=" + reviewer +
                ", reviewState=" + reviewState +
                ", reviewName='" + reviewName + '\'' +
                ", reviewResult='" + reviewResult + '\'' +
                ", reviewTime=" + reviewTime +
                ", storageTime=" + storageTime +
                ", founderId=" + founderId +
                ", founderName='" + founderName + '\'' +
                ", createTime=" + createTime +
                ", updaterId=" + updaterId +
                ", updateTime=" + updateTime +
                ", status=" + status +
                ", orderType=" + orderType +
                '}';
    }
}
