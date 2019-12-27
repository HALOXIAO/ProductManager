package com.manage.sys.service;

import com.manage.sys.dao.wrapper.impl.SalesWrapper;
import com.manage.sys.entity.PO.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesService {
    @Autowired
    SalesWrapper salesWrapper;
    @Autowired
    ProductService productService;
    @Autowired
    CustomerService customerService;
    @Autowired
    EmployeeService employeeService;

    public SalesPO searchSalesById(int id) {
        return salesWrapper.searchSalesById(id);
    }

    public boolean addSales(SalesPO salesPO) {
        return salesWrapper.createSales(salesPO);
    }


    public Boolean updateSales(SalesPO salesPO) {
        return salesWrapper.updateSales(salesPO);
    }

}
