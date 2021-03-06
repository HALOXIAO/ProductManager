package com.manage.sys.service;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.dao.wrapper.impl.CustomerWrapper;
import com.manage.sys.dao.wrapper.impl.SalesWrapper;
import com.manage.sys.entity.po.CustomerPO;
import com.manage.sys.entity.po.SalesPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustomerWrapper customerWrapper;

    @Autowired
    SalesWrapper salesWrapper;

    public CustomerPO searchCustomerById(int id) {
        return customerWrapper.searchCustomerById(id);
    }

    public Boolean addCustomer(CustomerPO customerPO) {
        return customerWrapper.addCustomer(customerPO);
    }

    public Boolean updateCustomer(CustomerPO customerPO) {
        Boolean flag1 = customerWrapper.updateCustomer(customerPO);
        if (!("".equals(customerPO.getCustomerName()))) {
            UpdateWrapper<SalesPO> wrapper = new UpdateWrapper<SalesPO>().eq("customer_name", customerPO.getCustomerName());
            SalesPO sales = new SalesPO();
            sales.setCustomerName(customerPO.getCustomerName());
            return salesWrapper.updateSalesBySomeThing(sales, wrapper) && flag1;
        }
        return flag1;
    }


}
