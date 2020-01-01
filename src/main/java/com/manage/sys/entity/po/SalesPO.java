package com.manage.sys.entity.po;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("sales")
public class SalesPO {
    @TableId("sales_id")
    private Long salesId;

    @TableField("sales_number")
    private String salesNumber;

    @TableField("customer_id")
    private Long customerId;


    @TableField("total_price")
    private Double totalPrice;

    @TableField("total_quantity")
    private Integer totalQuantity;

    @TableField("description")
    private String description;

    @TableField("founder_id")
    private Long founderId;

    @TableField("founder_name")
    private String founderName;

    @TableField("create_time")
    private java.sql.Timestamp createTime;

    @TableField("update_time")
    private java.sql.Timestamp updateTime;

    @TableField("status")
    private Integer status;

    public Integer getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(Integer totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public Long getSalesId() {
        return this.salesId;
    }

    public void setSalesId(Long salesId) {
        this.salesId = salesId;
    }

    public String getSalesNumber() {
        return this.salesNumber;
    }

    public void setSalesNumber(String salesNumber) {
        this.salesNumber = salesNumber;
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }


    public Double getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        return "SalesPO{" +
                "salesId=" + salesId +
                ", salesNumber='" + salesNumber + '\'' +
                ", customerId=" + customerId +
                ", totalPrice=" + totalPrice +
                ", totalQuantity=" + totalQuantity +
                ", description='" + description + '\'' +
                ", founderId=" + founderId +
                ", founderName='" + founderName + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", status=" + status +
                '}';
    }
}
