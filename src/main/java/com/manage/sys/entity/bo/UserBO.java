package com.manage.sys.entity.bo;

public class UserBO {
    private Long userId;

    private String username;

    private String password;

    private Long employeeId;
    private String telephone;
    private Integer status;

    public UserBO(String username, String password, Long employeeId, String telephone, Integer status) {
        this.username = username;
        this.password = password;
        this.employeeId = employeeId;
        this.telephone = telephone;
        this.status = status;
    }
}
