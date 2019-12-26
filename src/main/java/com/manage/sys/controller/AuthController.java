package com.manage.sys.controller;


import com.manage.sys.manager.common.beans.ResultBean;
import com.manage.sys.payload.LoginRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping("/auth")
public class AuthController {


    @PostMapping("/login")
    public ResultBean<Boolean> login(@Valid @RequestBody LoginRequest loginRequest, HttpSession session) {

        return new ResultBean<>(false);

    }

    @PostMapping("/logout")
    public ResultBean<Boolean> logout(HttpServletRequest request, HttpSession session) {
        request.getSession();
        return new ResultBean<>(false);
    }
}
