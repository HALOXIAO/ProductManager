package com.manage.sys.entity.PO;

import com.baomidou.mybatisplus.annotation.TableName;

import javax.validation.constraints.NotBlank;

@TableName("role")
public class RolePO {

    private Integer roleId;

    @NotBlank(message="role_name can not be null")
    private String roleName;
    private String description;

    @NotBlank(message = "status can't be null")
    private Integer status;
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
