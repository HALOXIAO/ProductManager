package com.manage.sys.service;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.dao.condition.UpdateCondition;
import com.manage.sys.dao.wrapper.impl.EmployeeWrapper;
import com.manage.sys.dao.wrapper.impl.ProductWrapper;
import com.manage.sys.dao.wrapper.impl.PurchaseOrderWrapper;
import com.manage.sys.dao.wrapper.impl.SupplierWrapper;
import com.manage.sys.entity.PO.PurchaseOrderPO;
import com.manage.sys.entity.PO.SupplierPO;
import org.springframework.beans.factory.annotation.Autowired;

public class SupplierService {
    @Autowired
    SupplierWrapper supplierWrapper;
    @Autowired
    PurchaseOrderWrapper purchaseOrderWrapper;

    public SupplierPO searchSupplierById(int id){
        return supplierWrapper.getById(id);
    }

    public boolean addSupplier(SupplierPO supplierPO){
        return supplierWrapper.addSupplier(supplierPO);
    }

    public Boolean updateSupplierForPurchaseOrder(SupplierPO supplierPO){
        supplierWrapper.updateSupplier(supplierPO);
        boolean flag1=supplierWrapper.updateSupplier(supplierPO);
        if(!("").equals(supplierPO.getSupplierName())){
            UpdateCondition<String,PurchaseOrderPO> updateCondition=new UpdateCondition<>();
            UpdateWrapper<PurchaseOrderPO> wrapper = updateCondition.updateEmployeeBy("supplierName",supplierPO.getSupplierName());
            PurchaseOrderPO purchaseOrderPO=new PurchaseOrderPO();
            purchaseOrderPO.setCommodityName(supplierPO.getSupplierName());
            boolean flag2 = purchaseOrderWrapper.updatepurchaseOrderBySomeThing(purchaseOrderPO, wrapper);
            return flag1 && flag2;
        }
        return flag1;
    }



}
