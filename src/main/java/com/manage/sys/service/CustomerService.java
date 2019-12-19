package com.manage.sys.service;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
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

    public CustomerPO searchCustomerById(int id){
        return customerWrapper.searchCustomerById(id);
    }

    public boolean addCustomer(CustomerPO customerPO){
        return customerWrapper.addCustomer(customerPO);
    }

    public boolean updateCustomerForSales(CustomerPO customerPO){
        customerWrapper.updateCustomer(customerPO);
        boolean flag1= customerWrapper.updateCustomer(customerPO);
        if(!("").equals(customerPO.getCustomerName())){
            UpdateCondition<String, SalesPO> updateCondition=new UpdateCondition<>();
            UpdateWrapper<SalesPO> wrapper = updateCondition.updateEmployeeBy("customerName",customerPO.getCustomerName());
            SalesPO salesPO=new SalesPO();
            salesPO.setCustomerName(customerPO.getCustomerName());
            boolean flag2=salesWrapper.updateSalesBySomeThing(salesPO,wrapper);
            return flag1 && flag2;
        }
        return flag1;
    }


}
