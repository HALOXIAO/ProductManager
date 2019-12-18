package com.manage.sys.service;

import com.manage.sys.entity.PO.RolePO;
import com.manage.sys.manager.middledao.RoleBaseServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

public class RoleService {

    @Autowired
    RoleBaseServiceInterface roleBaseServiceInterface;


     public void searchRole(RolePO rolePO){
         roleBaseServiceInterface.selectRole(rolePO);
     }
     public void addRole(RolePO rolePO){
         roleBaseServiceInterface.addRole(rolePO);
     }
     public void updateRole(RolePO rolePO){
         roleBaseServiceInterface.updateRole(rolePO);
     }

}
