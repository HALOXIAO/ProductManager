package com.manage.sys.Manager;

import com.manage.sys.DAO.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapperWapper {

    @Autowired
    CustomerMapper customerMapper;
}
