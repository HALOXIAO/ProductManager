package com.manage.sys.entity.PO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.io.Serializable;

@TableName("role")
public class RolePO implements Serializable {

    @Null(message = "拒绝手动设置id")
    @TableId(type = IdType.AUTO)
    private Integer roleId;


    @NotEmpty
    @TableId(type = IdType.INPUT)
    @Length(min = 2, max = 20,message = "长度需要大于1且小于20")
    private String roleName;

    @TableField
    @Length(max = 210,message = "长度需要小于210")
    private String description;

    @TableField
    @Digits(integer = 1, fraction = 0,message = "状态需符合而规定")
    @Range(min = 0, max = 2, message = "状态需符合规定")
    @NotNull(message = "需要设定状态")
    private Integer status;

    @Null(message = "拒绝手动设置更新时间")
    @TableField
    private java.sql.Timestamp updateTime;


    public Integer getRoleId() {
        return this.roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


    public java.sql.Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(java.sql.Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "RolePO{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", updateTime=" + updateTime +
                '}';
    }
}
