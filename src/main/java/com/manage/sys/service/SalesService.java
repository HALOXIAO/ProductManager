package com.manage.sys.service;

import com.manage.sys.dao.wrapper.impl.SalesWrapper;
import com.manage.sys.entity.PO.*;
import org.springframework.beans.factory.annotation.Autowired;

public class SalesService {
    @Autowired
    SalesWrapper salesWrapper;
    @Autowired
    WarehouseService warehouseService;
    @Autowired
    ProductService productService;
    @Autowired
    CustomerService customerService;
    @Autowired
    EmployeeService employeeService;

    public SalesPO searchSalesById(int id){
        return salesWrapper.searchSalesById(id);
    }

    public boolean addSales(SalesPO salesPO){
        return salesWrapper.createSales(salesPO);
    }

    public void updateWarehouseName(WarehousePO warehousePO){warehouseService.updateWarehouseForSales(warehousePO);}

    public void updateCommodityName(ProductPO productPO){productService.updateProductForSales(productPO);}

    public void updateCustomerName(CustomerPO customerPO){customerService.updateCustomerForSales(customerPO);}

    public void updateFounderName(EmployeePO employeePO){employeeService.updateEmployeeNameForFounder(employeePO);}

    public void updateReviewName(EmployeePO employeePO){employeeService.updateEmployeeNameForReviewer(employeePO);}
}
