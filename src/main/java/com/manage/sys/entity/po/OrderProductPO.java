package com.manage.sys.entity.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;


@TableName("order_product")
public class OrderProductPO {
    @TableId( "order_product_id")
    private Long orderProductId;

    @TableField( "sales_order_id")
    private Long salesOrderId;

    @TableField( " product_id")
    private Long  ProductId;

    @TableField( "quantity")
    private Integer quantity;

    @TableField( "status")
    private Integer status;


    public Long getOrderProductId() {
        return this.orderProductId;
    }

    public void setOrderProductId(Long orderProductId) {
        this.orderProductId = orderProductId;
    }

    public Long getSalesOrderId() {
        return this.salesOrderId;
    }

    public void setSalesOrderId(Long salesOrderId) {
        this.salesOrderId = salesOrderId;
    }

    public Long getProductId() {
        return this.ProductId;
    }

    public void setProductId(Long  ProductId) {
        this. ProductId =  ProductId;
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
