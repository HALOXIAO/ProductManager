package com.manage.sys.entity.BO;

import com.manage.sys.service.generator.PurchaseOrderInformationGenerator;

import java.sql.Timestamp;


public class PurchaseOrderBO {
    private final Long purchaseId;
    private final String purchaseOrder;
    private final Long productId;
    private final String commodityName;
    private final Long supplierId;
    private final String supplierName;
    private final Long warehouseId;
    private final String warehouseName;
    private final Integer quantity;
    private final Integer price;
    private final Integer totalPrice;
    private final String description;
    private final Long reviewer;
    private final int reviewState;
    private final String reviewName;
    private final String reviewResult;
    private final java.sql.Timestamp reviewTime;
    private final java.sql.Timestamp storageTime;
    private final Long founderId;
    private final String founderName;
    private final Long updaterId;
    private final int status;
    private final int orderType;

    public PurchaseOrderBO(Builder builder) {
        this.purchaseId = builder.purchaseId;
        this.purchaseOrder = builder.purchaseOrder;
        this.productId = builder.productId;
        this.commodityName = builder.commodityName;
        this.supplierId = builder.supplierId;
        this.supplierName = builder.supplierName;
        this.warehouseId = builder.warehouseId;
        this.warehouseName = builder.warehouseName;
        this.quantity = builder.quantity;
        this.price = builder.price;
        this.totalPrice = builder.totalPrice;
        this.description = builder.description;
        this.reviewer = builder.reviewer;
        this.reviewState = builder.reviewState;
        this.reviewName = builder.reviewName;
        this.reviewResult = builder.reviewResult;
        this.reviewTime = builder.reviewTime;
        this.storageTime = builder.storageTime;
        this.founderId = builder.founderId;
        this.founderName = builder.founderName;
        this.updaterId = builder.updaterId;
        this.status = builder.status;
        this.orderType = builder.orderType;
    }


    static class Builder {
        /**
         * 必选
         */
        private final Long purchaseId;
        private final String purchaseOrder;
        private final Long productId;
        private final String commodityName;
        private final Long supplierId;
        private final String supplierName;
        private final Integer quantity;
        private final Integer price;
        private final Integer totalPrice;

        private final Long founderId;
        private final String founderName;
        private final Long updaterId;
        private final int status;
        private final int orderType;

        /**
         * Optional
         */
        private Long warehouseId;
        private String warehouseName;
        private String description;
        private Long reviewer;
        private int reviewState;
        private String reviewName;
        private String reviewResult;
        private java.sql.Timestamp reviewTime;
        private java.sql.Timestamp storageTime;

        public Builder(PurchaseOrderInformationGenerator generator, Long founderId, String founderName, Long updaterId, int status, int orderType) {
            this.purchaseId = generator.getPurchaseId();
            this.purchaseOrder = generator.getPurchaseOrder();
            this.productId = generator.getProductId();
            this.commodityName = generator.getCommodityName();
            this.supplierId = generator.getSupplierId();
            this.supplierName = generator.getSupplierName();
            this.quantity = generator.getQuantity();
            this.price = generator.getPrice();
            this.totalPrice = generator.getTotalPrice();
            this.founderId = founderId;
            this.founderName = founderName;
            this.updaterId = updaterId;
            this.status = status;
            this.orderType = orderType;
        }

        public Builder setWarehouseId(Long warehouseId) {
            this.warehouseId = warehouseId;
            return this;
        }

        public Builder setWarehouseName(String warehouseName) {
            this.warehouseName = warehouseName;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setReviewState(int reviewState) {
            this.reviewState = reviewState;
            return this;
        }

        public Builder setRevice(Long reviewer) {
            this.reviewer = reviewer;
            return this;
        }

        public Builder setReviewName(String reviewName) {
            this.reviewName = reviewName;
            return this;
        }

        public Builder setReviewResult(String reviewResult) {
            this.reviewResult = reviewResult;
            return this;
        }

        public Builder setReviewTime(Timestamp reviewTime) {
            this.reviewTime = reviewTime;
            return this;
        }

        public Builder setStorageTime(Timestamp storageTime) {
            this.storageTime = storageTime;
            return this;

        }

        public PurchaseOrderBO build() {
            return new PurchaseOrderBO(this);
        }

    }

}
