package com.manage.sys.entity.PO;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("warehouse_product")
public class WarehouseProductPO {

    @TableId("product_id")
    private Long productId;

    @TableField("product_name")
    private String productName;

    @TableField("product_number")
    private String productNumber;

    @TableField("quantity")
    private Integer quantity;

    @TableField("warehouse_name")
    private String warehouseName;

    @TableField("warehouse_id")
    private Long warehouseId;

    @TableField("status")
    private Integer status;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseName() {
        return warehouseName;
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

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductNumber() {
        return this.productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "WarehouseProductPO{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productNumber='" + productNumber + '\'' +
                ", quantity=" + quantity +
                ", warehouseName='" + warehouseName + '\'' +
                ", warehouseId=" + warehouseId +
                ", status='" + status + '\'' +
                '}';
    }
}
