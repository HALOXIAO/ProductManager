package com.manage.sys.service;

import com.manage.sys.dao.wrapper.impl.PurchaseOrderWrapper;
import com.manage.sys.entity.PO.*;
import org.springframework.beans.factory.annotation.Autowired;

public class PurchaseOrderService {
    @Autowired
    PurchaseOrderWrapper purchaseOrderWrapper;


    public PurchaseOrderPO searchPurchaseOrderById(int id) {
        return purchaseOrderWrapper.getById(id);
    }

    public boolean addPurchaseOrder(PurchaseOrderPO purchaseOrderPO) {
        return purchaseOrderWrapper.addPurchaseOrder(purchaseOrderPO);
    }

    public Boolean updatePurchaseOrderByProductNumber(PurchaseOrderPO purchaseOrderPO,String ProductNumber) {
        return purchaseOrderWrapper.updatePurchaseOrderBySomeThing(purchaseOrderPO,null);
    }

}
