package com.manage.sys.entity.PO;


import com.baomidou.mybatisplus.annotation.TableName;

@TableName("customer")
public class CustomerPO {
    private Long customerId;

    private String customerName;

    private String contact;

    private String contactTelephoneNumber;

    private String contactAddress;

    private String description;

    private Long updaterId;

    private java.sql.Timestamp updateTime;

    private int status;


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
        return "CustomerPO{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", contact='" + contact + '\'' +
                ", contactTelephoneNumber='" + contactTelephoneNumber + '\'' +
                ", contactAddress='" + contactAddress + '\'' +
                ", description='" + description + '\'' +
                ", updaterId=" + updaterId +
                ", updateTime=" + updateTime +
                ", status=" + status +
                '}';
    }
}
