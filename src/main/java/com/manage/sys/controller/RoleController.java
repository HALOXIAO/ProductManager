package com.manage.sys.controller;

import com.manage.sys.entity.po.RolePO;
import com.manage.sys.manager.common.beans.ResultBean;
import com.manage.sys.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Objects;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    RoleService roleService;

    @PostMapping()
    public ResultBean<Boolean> createRole(@Valid @RequestBody RolePO role, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            ResultBean<Boolean> resultBean = new ResultBean<>(Boolean.FALSE);
            resultBean.setCode(ResultBean.ARGUMENT_ERROR);
            resultBean.setMsg(Objects.requireNonNullElse(bindingResult.getFieldError(), "No ErrorMessage").toString());
            return resultBean;
        }
        return new ResultBean<>(roleService.addRole(role));
    }

    @DeleteMapping("/{rolename}")
    @CacheEvict(value = "role")
    public ResultBean<Boolean> deleteRole(@PathVariable("rolename") String roleName) {
        return new ResultBean<>(roleService.deleteRole(roleName));
    }

    @PutMapping()
    @CacheEvict(value = "role")
    public ResultBean<Boolean> updateRole(@Valid @RequestBody RolePO role, BindingResult  bindingResult) {
        if (bindingResult.hasErrors()) {
            ResultBean<Boolean> resultBean = new ResultBean<>(Boolean.FALSE);
            resultBean.setCode(ResultBean.ARGUMENT_ERROR);
            resultBean.setMsg(Objects.requireNonNullElse(bindingResult.getFieldError(), "No ErrorMessage").toString());
            return resultBean;
        }
        return new ResultBean<>(roleService.updateRole(role));
    }

    @GetMapping("/{rolename}")
    @Cacheable(value = "role")
    public ResultBean<RolePO> getRoleByName(@PathVariable("rolename") String username) {
        return new ResultBean<>(roleService.searchRoleByUsername(username));
    }


}
