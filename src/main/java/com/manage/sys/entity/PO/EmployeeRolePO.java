package com.manage.sys.entity.PO;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("employee_role")
public class EmployeeRolePO {
    @TableId("employee_id")
    private Long employeeId;

    @TableField("employee_internal_name")
    private String employeeInternalName;

    @TableField("role_id")
    private Integer roleId;

    @TableField("role_name")
    private String roleName;

    @TableField("status")
    private Integer status;


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeInternalName() {
        return this.employeeInternalName;
    }

    public void setEmployeeInternalName(String employeeInternalName) {
        this.employeeInternalName = employeeInternalName;
    }

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

    @Override
    public String toString() {
        return "EmployeeRole{" +
                "employeeId=" + employeeId +
                ", employeeInternalName='" + employeeInternalName + '\'' +
                ", roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", status=" + status +
                '}';
    }
}
