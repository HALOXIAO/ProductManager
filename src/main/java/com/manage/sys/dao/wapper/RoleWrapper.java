package com.manage.sys.dao.wapper;

import com.manage.sys.dao.RoleMapper;
import com.manage.sys.entity.PO.RolePO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleWrapper {
    @Autowired
    RoleMapper roleMapper;

    public Boolean createRole(RolePO role) {
        return roleMapper.save(role);
    }

    public RolePO searchRoleById(int id){
        return roleMapper.getById(id);
    }


}
