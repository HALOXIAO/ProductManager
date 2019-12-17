package com.manage.sys.dao.wrapper;

import com.manage.sys.dao.CustomerMapper;
import com.manage.sys.entity.PO.CustomerPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerWrapper {

    @Autowired
    CustomerMapper customerMapper;

    public Boolean addCustomer(CustomerPO customer) {
        return customerMapper.save(customer);

    }

    public CustomerPO searchCustomerById(long id) {
        return customerMapper.getById(id);
    }

}
