package com.manage.sys.controller;

import com.manage.sys.entity.po.UserPO;
import com.manage.sys.manager.common.beans.ResultBean;
import com.manage.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Objects;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/{user}")
    @Cacheable(value = "user")
    public ResultBean<UserPO> getUser(@PathVariable String username) {
        return new ResultBean<>();
    }

    @PostMapping()
    public ResultBean<Boolean> createUser(@Valid @RequestBody UserPO userPO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            ResultBean<Boolean> resultBean = new ResultBean<>(Boolean.FALSE);
            resultBean.setCode(ResultBean.ARGUMENT_ERROR);
            resultBean.setMsg(Objects.requireNonNullElse(bindingResult.getFieldError(), "No ErrorMessage").toString());
            return resultBean;
        }
        return new ResultBean<>(userService.addUser(userPO));
    }

    @PutMapping()
    @CacheEvict(value = "user")
    public ResultBean<Boolean> updateUser(@Valid @RequestBody UserPO userPO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            ResultBean<Boolean> resultBean = new ResultBean<>(Boolean.FALSE);
            resultBean.setCode(ResultBean.ARGUMENT_ERROR);
            resultBean.setMsg(Objects.requireNonNullElse(bindingResult.getFieldError(), "No ErrorMessage").toString());
            return resultBean;
        }
        return new ResultBean<>(userService.updateUser(userPO));
    }


    @DeleteMapping("/{username}")
    @CacheEvict(value = "user")
    public ResultBean<Boolean> deleteUser(@PathVariable("username") String username) {
        return new ResultBean<>(userService.deleteUser(username));
    }
}
