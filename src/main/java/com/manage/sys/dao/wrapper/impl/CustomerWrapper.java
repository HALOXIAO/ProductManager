package com.manage.sys.dao.wrapper.impl;

import com.manage.sys.dao.CustomerMapper;
import com.manage.sys.dao.wrapper.CustomerWrapperInterface;
import com.manage.sys.entity.PO.CustomerPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class CustomerWrapper implements CustomerWrapperInterface {

    @Autowired
    CustomerMapper customerMapper;

    @Override
    public Boolean addCustomer(CustomerPO customer) {
        return customerMapper.save(customer);

    }

    @Override
    public CustomerPO searchCustomerById(long id) {
        return customerMapper.getById(id);
    }

}
