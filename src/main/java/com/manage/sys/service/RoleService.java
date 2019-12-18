package com.manage.sys.service;

import com.manage.sys.dao.wrapper.impl.RoleWrapper;
import com.manage.sys.entity.PO.RolePO;
import org.springframework.beans.factory.annotation.Autowired;

public class RoleService {

    @Autowired
    RoleWrapper roleWrapper;


     public void searchRole(RolePO rolePO){
         roleWrapper.selectRole(rolePO);
     }
     public void addRole(RolePO rolePO){
         roleWrapper.addRole(rolePO);
     }
     public void updateRole(RolePO rolePO){
         roleWrapper.updateRole(rolePO);
     }

}
