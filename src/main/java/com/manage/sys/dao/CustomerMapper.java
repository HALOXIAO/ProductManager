package com.manage.sys.dao;

import com.manage.sys.entity.po.CustomerPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public  class CustomerMapper {

    public Boolean updateCustomer(CustomerPO customerPO) {
        return null;
    }

    @Autowired
    Customer customer;

    public Boolean addCustomer(CustomerPO customer) {
        return this.customer.insert(customer)==1;

    }

    public CustomerPO searchCustomerById(long id) {
        return customer.selectById(id);
    }

}
