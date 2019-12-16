package com.manage.sys.entity.BO;

public class UserBO {
    private Long userId;

    private String username;

    private String password;

    private Long employeeId;
    private String telephone;
    private int status;

    public UserBO(String username, String password, Long employeeId, String telephone, int status) {
        this.username = username;
        this.password = password;
        this.employeeId = employeeId;
        this.telephone = telephone;
        this.status = status;
    }
}
