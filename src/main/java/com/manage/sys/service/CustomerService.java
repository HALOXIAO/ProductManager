package com.manage.sys.service;

import com.manage.sys.dao.wrapper.impl.CustomerWrapper;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerService {
    @Autowired
    CustomerWrapper customerWrapper;

    @Autowired
    SalesWrapper salesWrapper;


}
