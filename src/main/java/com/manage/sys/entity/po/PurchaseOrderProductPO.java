package com.manage.sys.entity.po;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName( "purchase_order_product")
public class PurchaseOrderProductPO {
    @TableId( "purchase_order_product_id")
    private Long purchaseOrderProductId;

    @TableField( "purchase_order_id")
    private Long purchaseOrderId;

    @TableField( " purchase_product_id")
    private Long  PurchaseProductId;

    @TableField( "quantity")
    private Integer quantity;

    @TableField( "status")
    private Integer status;


    public Long getPurchaseOrderProductId() {
        return this.purchaseOrderProductId;
    }

    public void setPurchaseOrderProductId(Long purchaseOrderProductId) {
        this.purchaseOrderProductId = purchaseOrderProductId;
    }

    public Long getPurchaseOrderId() {
        return this.purchaseOrderId;
    }

    public void setPurchaseOrderId(Long purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public Long getPurchaseProductId() {
        return this. PurchaseProductId;
    }

    public void setPurchaseProductId(Long  PurchaseProductId) {
        this. PurchaseProductId =  PurchaseProductId;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
