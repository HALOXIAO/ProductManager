package com.manage.sys.controller;

import com.manage.sys.entity.PO.RolePO;
import com.manage.sys.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    RoleService roleService;

//    public String createRole(@Valid @RequestBody RolePO role) {
//       Boolean flag = roleService.addRole(role);
//       return flag.toString();
//    }
}
