package com.manage.sys.entity.PO;

import com.baomidou.mybatisplus.annotation.*;

@TableName("employee")
public class EmployeePO {
    @TableId(value = "employee_id", type = IdType.AUTO)
    private Long employeeId;
    @TableId(value = "internal_name")
    private String internalName;
    @TableField(value = "employee_name")
    private String employeeName;
    @TableField(value = "telephone_number")
    private String telephoneNumber;
    private String identityCard;
    private Integer sex;
    private String nationality;
    private java.sql.Date birthDate;
    private Integer wage;
    private String employeeAddress;
    private String eMail;
    private Integer employeeTypeId;
    private String employeeTypeName;
    private java.sql.Timestamp updateTime;
    private Integer status;

    public Long getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getInternalName() {
        return this.internalName;
    }

    public void setInternalName(String internalName) {
        this.internalName = internalName;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getTelephoneNumber() {
        return this.telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getIdentityCard() {
        return this.identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public Integer getSex() {
        return this.sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public java.sql.Date getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(java.sql.Date birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getWage() {
        return this.wage;
    }

    public void setWage(Integer wage) {
        this.wage = wage;
    }

    public String getEmployeeAddress() {
        return this.employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getEmail() {
        return this.eMail;
    }

    public void setEmail(String eMail) {
        this.eMail = eMail;
    }

    public Integer getEmployeeTypeId() {
        return this.employeeTypeId;
    }

    public void setEmployeeTypeId(Integer employeeTypeId) {
        this.employeeTypeId = employeeTypeId;
    }

    public String getEmployeeTypeName() {
        return this.employeeTypeName;
    }

    public void setEmployeeTypeName(String employeeTypeName) {
        this.employeeTypeName = employeeTypeName;
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
        return "EmployeePO{" +
                "employeeId=" + employeeId +
                ", internalName='" + internalName + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", sex=" + sex +
                ", nationality='" + nationality + '\'' +
                ", birthDate=" + birthDate +
                ", wage=" + wage +
                ", employeeAddress='" + employeeAddress + '\'' +
                ", eMail='" + eMail + '\'' +
                ", employeeTypeId=" + employeeTypeId +
                ", employeeTypeName='" + employeeTypeName + '\'' +
                ", updateTime=" + updateTime +
                ", status=" + status +
                '}';
    }
}
