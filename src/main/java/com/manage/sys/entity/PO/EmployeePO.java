package com.manage.sys.entity.PO;

import com.baomidou.mybatisplus.annotation.*;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;

@TableName("employee")
public class EmployeePO {
    @TableId(value = "employee_id", type = IdType.AUTO)
    @Null
    private Long employeeId;

    @TableId(value = "internal_name")
    @NotEmpty
    @Length(min = 2, max = 20, message = "长度需要大于2且小于20")
    private String internalName;

    @TableField(value = "employee_name")
    @NotEmpty
    @Length(min = 2, max = 20, message = "长度需要大于2且小于20")
    private String employeeName;

    @TableField(value = "telephone_number")
    @NotEmpty
    @Length(min = 10, max = 18, message = "长度需要大于2且小于20")
    @Pattern(regexp = "((\\d{11})|^((\\d{7,8})|(\\d{4}|\\d{3})-(\\d{7,8})|(\\d{4}|\\d{3})-(\\d{7,8})-(\\d{4}|\\d{3}|\\d{2}|\\d{1})|(\\d{7,8})-(\\d{4}|\\d{3}|\\d{2}|\\d{1}))$)", message = "手机号码格式错误")
    private String telephoneNumber;

    @Pattern(regexp = "(^\\d{15}$)|(^\\d{18}$)|(^\\d{17}(\\d|X|x)$)", message = "身份证格式错误")
    private String identityCard;

    @NotNull(message = "性别不能为空")
    @Range(min = 0, max = 2)
    @Digits(integer = 1, fraction = 0, message = "状态需符合而规定")
    private Integer sex;

    @NotEmpty
    @Length(min = 2, max = 2)
    private String nationality;

    @Past
    private java.sql.Date birthDate;

    @Min(3000)
    @NotNull
    private Integer wage;


    private String employeeAddress;

    @Email
    private String eMail;

    @NotNull
    private Integer employeeTypeId;

    @NotEmpty
    @Length(min = 2, max = 20)
    private String employeeTypeName;

    @Digits(integer = 1, fraction = 0,message = "状态需符合而规定")
    @Range(min = 0, max = 2, message = "状态需符合规定")
    @NotNull(message = "需要设定状态")
    private Integer status;

    @Null
    private java.sql.Timestamp updateTime;

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
