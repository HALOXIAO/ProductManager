package com.manage.sys.entity;

public class SupplierPO {
    private Long supplierId;
    private String supplierName;
    private String contact;
    private String contactTelephoneNumber;
    private String contactAddress;
    private String description;
    private Long updaterId;
    private java.sql.Timestamp updateTime;

    public Long getSupplierId() {
        return this.supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return this.supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
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


    @Override
    public String toString() {
        return "SupplierPO{" +
                "supplierId=" + supplierId +
                ", supplierName='" + supplierName + '\'' +
                ", contact='" + contact + '\'' +
                ", contactTelephoneNumber='" + contactTelephoneNumber + '\'' +
                ", contactAddress='" + contactAddress + '\'' +
                ", description='" + description + '\'' +
                ", updaterId=" + updaterId +
                ", updateTime=" + updateTime +
                '}';
    }
}
