package com.manage.sys.service.generator;

public class PurchaseOrderInformationGenerator {

    private Long purchaseId;
    private String purchaseOrder;
    private Long productId;
    private String commodityName;
    private Long supplierId;
    private String supplierName;
    private Integer quantity;
    private Integer price;
    private Integer totalPrice;

    private PurchaseOrderInformationGenerator(Long purchaseId, String purchaseOrder, Long productId, String commodityName, Long supplierId, String supplierName, Integer quantity, Integer price, Integer totalPrice) {
        this.purchaseId = purchaseId;
        this.purchaseOrder = purchaseOrder;
        this.productId = productId;
        this.commodityName = commodityName;
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.quantity = quantity;
        this.price = price;
        this.totalPrice = totalPrice;
    }

    public static PurchaseOrderInformationGenerator purchaseOrderBaseInformationGenerator(Long purchaseId
            , String purchaseOrder, Long productId, String commodityName, Long supplierId
            , String supplierName, Integer quantity, Integer price, Integer totalPrice) {

        return new PurchaseOrderInformationGenerator(purchaseId, purchaseOrder, productId, commodityName, supplierId, supplierName, quantity, price, totalPrice);
    }

    public Long getPurchaseId() {
        return purchaseId;
    }

    public String getPurchaseOrder() {
        return purchaseOrder;
    }

    public Long getProductId() {
        return productId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }
}
