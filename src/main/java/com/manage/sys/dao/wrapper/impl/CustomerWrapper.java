package com.manage.sys.dao.wrapper.impl;

import com.manage.sys.dao.CustomerMapper;
import com.manage.sys.dao.wrapper.CustomerWrapperInterface;
import com.manage.sys.entity.PO.CustomerPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public  class CustomerWrapper implements CustomerWrapperInterface {

    @Override
    public Boolean updateCustomer(CustomerPO customerPO) {
        return null;
    }

    @Autowired
    CustomerMapper customerMapper;

    @Override
    public Boolean addCustomer(CustomerPO customer) {
        return customerMapper.insert(customer)==1;

    }

    @Override
    public CustomerPO searchCustomerById(long id) {
        return customerMapper.selectById(id);
    }

}
