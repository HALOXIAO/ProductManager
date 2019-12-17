package com.manage.sys.entity.BO;

import javax.validation.constraints.NotBlank;

public class RoleBO {
    private Integer roleId;
    private String roleName;
    private String description;
    private int status;
    private java.sql.Timestamp updateTime;

    public RoleBO(String role_name, int status) {
        this.roleName = role_name;
        this.status = status;
    }

    public RoleBO(String role_name, int status, String description) {
        this.roleName = role_name;
        this.status = status;
        this.description = description;
    }
}
