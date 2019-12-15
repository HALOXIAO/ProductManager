package com.manage.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName("warehouse")
public class WarehousePO {
    private Long warehouseId;
    private String warehouseName;
    private String warehouseCode;
    private String warehouseAddress;
    private String description;
    private Long administratorId;
    private Long updaterId;
    private java.sql.Timestamp updateTime;
    private int status;

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

    public String getWarehouseCode() {
        return this.warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public String getWarehouseAddress() {
        return this.warehouseAddress;
    }

    public void setWarehouseAddress(String warehouseAddress) {
        this.warehouseAddress = warehouseAddress;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getAdministratorId() {
        return this.administratorId;
    }

    public void setAdministratorId(Long administratorId) {
        this.administratorId = administratorId;
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

    @Override
    public String toString() {
        return "WarehousePO{" +
                "warehouseId=" + warehouseId +
                ", warehouseName='" + warehouseName + '\'' +
                ", warehouseCode='" + warehouseCode + '\'' +
                ", warehouseAddress='" + warehouseAddress + '\'' +
                ", description='" + description + '\'' +
                ", administratorId=" + administratorId +
                ", updaterId=" + updaterId +
                ", updateTime=" + updateTime +
                ", status=" + status +
                '}';
    }
}
