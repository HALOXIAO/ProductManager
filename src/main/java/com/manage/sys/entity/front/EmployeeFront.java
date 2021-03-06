package com.manage.sys.entity.front;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;

public class EmployeeFront {


    @Null
    private Long employeeId;

    @NotEmpty
    @Length(min = 2, max = 20, message = "长度需要大于2且小于20")
    private String internalName;

    @NotEmpty
    @Length(min = 2, max = 20, message = "长度需要大于2且小于20")
    private String employeeName;

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

    @NotNull
    private Integer nation;

    @Past
    private java.sql.Date birthDate;

    @Min(3000)
    @NotNull
    private Integer wage;


    @Length(min = 0, max = 255)
    private String employeeAddress;

    @Email
    private String eMail;


    @Digits(integer = 1, fraction = 0, message = "状态需符合而规定")
    @Range(min = 0, max = 2, message = "状态需符合规定")
    @NotNull(message = "需要设定状态")
    private Integer status;

    @NotNull
    private Integer roleId;

    @Null
    private java.sql.Timestamp updateTime;


    public Integer getNation() {
        return nation;
    }

    public void setNation(Integer nation) {
        this.nation = nation;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

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

    public Integer getNationality() {
        return this.nation;
    }

    public void setNationality(Integer nation) {
        this.nation = nation;
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
        return "EmployeeFront{" +
                "employeeId=" + employeeId +
                ", internalName='" + internalName + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", sex=" + sex +
                ", nation=" + nation +
                ", birthDate=" + birthDate +
                ", wage=" + wage +
                ", employeeAddress='" + employeeAddress + '\'' +
                ", eMail='" + eMail + '\'' +
                ", status=" + status +
                ", roleId=" + roleId +
                ", updateTime=" + updateTime +
                '}';
    }
}
