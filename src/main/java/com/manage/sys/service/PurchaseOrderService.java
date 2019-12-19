package com.manage.sys.service;

import com.manage.sys.entity.PO.*;
import org.springframework.beans.factory.annotation.Autowired;

public class PurchaseOrderService {
    @Autowired
    PurchaseOrderWrapper purchaseOrderWrapper;
    @Autowired
    ProductService productService;
    @Autowired
    WarehouseService warehouseService;
    @Autowired
    SupplierService supplierService;
    @Autowired
    EmployeeService employeeService;

    public PurchaseOrderPO searchPurchaseOrderById(int id){
       return  purchaseOrderWrapper.getById(id);
    }

    public boolean addPurchaseOrder(PurchaseOrderPO purchaseOrderPO){
        return purchaseOrderWrapper.addPurchaseOrder(purchaseOrderPO);
    }

    public void updateCommodityName(ProductPO productPO){productService.updateProductForPurchaseOrder(productPO);}

    public void updateWarehouseName(WarehousePO warehousePO){warehouseService.updateWarehouseForPurchaseOrder(warehousePO);}

    public void updateSupplierName(SupplierPO supplierPO){supplierService.updateSupplierForPurchaseOrder(supplierPO);}

    public void updateFounderName(EmployeePO employeePO){employeeService.updateEmployeeNameForFounder(employeePO); }

    public void updateReviewName(EmployeePO employeePO){employeeService.updateEmployeeNameForReviewer(employeePO);}

}
