package com.manage.sys.entity.PO;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;



@TableName( "purchase_order_product")
public class PurchaseOrderProductPO {

    @TableId( "id")
    private Long id;

    @TableField( "purchase_order_number")
    private String purchaseOrderNumber;

    @TableField( "purchase_product_id")
    private Long purchaseProductId;

    @TableField( "purchase_product_number")
    private String purchaseProductNumber;

    @TableField( "purchase_product_name")
    private String purchaseProductName;

    @TableField( "quantity")
    private Integer quantity;

    @TableField("status")
    private Integer status;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getPurchaseOrderId() {
        return this.id;
    }

    public void setPurchaseOrderId(Long id) {
        this.id = id;
    }

    public String getPurchaseOrderNumber() {
        return this.purchaseOrderNumber;
    }

    public void setPurchaseOrderNumber(String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }

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

    @Override
    public String toString() {
        return "PurchaseOrderProductPO{" +
                "id=" + id +
                ", purchaseOrderNumber='" + purchaseOrderNumber + '\'' +
                ", purchaseProductId=" + purchaseProductId +
                ", purchaseProductNumber='" + purchaseProductNumber + '\'' +
                ", purchaseProductName='" + purchaseProductName + '\'' +
                ", quantity=" + quantity +
                ", status=" + status +
                '}';
    }
}
