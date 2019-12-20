package com.manage.sys.service;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.dao.SalesMapper;
import com.manage.sys.dao.condition.UpdateCondition;
import com.manage.sys.dao.wrapper.impl.CustomerWrapper;
import com.manage.sys.dao.wrapper.impl.SalesWrapper;
import com.manage.sys.entity.PO.CustomerPO;
import com.manage.sys.entity.PO.SalesPO;
import org.springframework.beans.factory.annotation.Autowired;

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
            UpdateCondition<SalesPO> updateCondition = new UpdateCondition<>();
            UpdateWrapper<SalesPO> wrapper = updateCondition.updateConditionByEqOne("customer_name", customerPO.getCustomerName());
            SalesPO sales = new SalesPO();
            sales.setCustomerName(customerPO.getCustomerName());
            return salesWrapper.updateSalesBySomeThing(sales, wrapper) && flag1;
        }
        return flag1;
    }


}
