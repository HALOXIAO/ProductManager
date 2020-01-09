package com.manage.sys.entity.po;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("employee_role")
public class EmployeeRolePO {
    @TableId("employee_role_id")
    private Long employeeRoleId;

    @TableField("employee_id")
    private Long employeeId;

    @TableField("role_id")
    private Integer roleId;

    @TableField("status")
    private Integer status;


    public Long getEmployeeRoleId() {
        return this.employeeRoleId;
    }


    public Long getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getRoleId() {
        return this.roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "EmployeeRolePO{" +
                "employeeRoleId=" + employeeRoleId +
                ", employeeId=" + employeeId +
                ", roleId=" + roleId +
                ", status=" + status +
                '}';
    }
}
