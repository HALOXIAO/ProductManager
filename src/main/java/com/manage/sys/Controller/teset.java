package com.manage.sys.Controller;


import com.manage.sys.DAO.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class teset {

    @Autowired
    RoleMapper roleMapper;

    @GetMapping("/test")
    public String getxxX() {
        var x = roleMapper.getBaseMapper();
        System.out.println(x.selectById(1));
        return x.toString();
    }

}
