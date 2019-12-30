package com.manage.sys.entity.PO;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;


@TableName( "customer")
public class CustomerPO {
    @TableId( "customer_id")
    private Long customerId;

    @TableField( "customer_name")
    private String customerName;

    @TableField( "contact")
    private String contact;

    @TableField( "contact_telephone_number")
    private String contactTelephoneNumber;

    @TableField( "contact_address")
    private String contactAddress;

    @TableField( "description")
    private String description;


    @TableField( "update_time")
    private java.sql.Timestamp updateTime;

    @TableField( "status")
    private Integer status;


    public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getContact() {
        return this.contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContactTelephoneNumber() {
        return this.contactTelephoneNumber;
    }

    public void setContactTelephoneNumber(String contactTelephoneNumber) {
        this.contactTelephoneNumber = contactTelephoneNumber;
    }

    public String getContactAddress() {
        return this.contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        return "CustomerPO{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", contact='" + contact + '\'' +
                ", contactTelephoneNumber='" + contactTelephoneNumber + '\'' +
                ", contactAddress='" + contactAddress + '\'' +
                ", description='" + description + '\'' +
                ", updateTime=" + updateTime +
                ", status=" + status +
                '}';
    }
}
