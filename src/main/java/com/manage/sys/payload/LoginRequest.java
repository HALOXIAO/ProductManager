package com.manage.sys.payload;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class LoginRequest {

    /**
     * 用户名或邮箱或手机号
     */
    @NotBlank(message = "不能为空")
    private String usernameOrEmailOrPhone;

    @NotBlank(message = "密码不能为空")
    private String password;

    /**
     * 记住我设置
     */
    private Boolean rememberMe = false;
}
