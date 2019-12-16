package com.manage.sys.manager;

import com.manage.sys.dao.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapperWapper {

    @Autowired
    CustomerMapper customerMapper;
}
