package com.manage.sys.service;

import com.baomidou.mybatisplus.extension.api.R;
import com.manage.sys.manager.middledao.RoleBaseServiceInterface;
import com.manage.sys.manager.middledao.impl.RoleBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class RoleService {

    @Autowired
    RoleBaseService roleBaseServiceInterface;


}
