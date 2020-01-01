package com.manage.sys.entity.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("warehouse_product")
public class WarehouseProductPO {
    @TableId("warehouse_product_id")
    private Long warehouseProductId;

    @TableField("product_id")
    private Long productId;

    @TableField("warehouse_id")
    private Long warehouseId;

    @TableField("quantity")
    private Integer quantity;

    @TableField("status")
    private Integer status;


    public Long getWarehouseProductId() {
        return this.warehouseProductId;
    }

    public void setWarehouseProductId(Long warehouseProductId) {
        this.warehouseProductId = warehouseProductId;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getWarehouseId() {
        return this.warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
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
