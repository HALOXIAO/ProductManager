package com.manage.sys.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.dao.condition.UpdateCondition;
import com.manage.sys.dao.wrapper.impl.EmployeeWrapper;
import com.manage.sys.dao.wrapper.impl.ProductWrapper;
import com.manage.sys.dao.wrapper.impl.PurchaseOrderWrapper;
import com.manage.sys.dao.wrapper.impl.SupplierWrapper;
import com.manage.sys.entity.PO.PurchaseOrderPO;
import com.manage.sys.entity.PO.SupplierPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierService {
    @Autowired
    SupplierWrapper supplierWrapper;

    @Autowired
    PurchaseOrderWrapper purchaseOrderWrapper;

    public SupplierPO searchSupplierById(int id) {
        return supplierWrapper.getById(id);
    }

    public Boolean deleteSupplier(String name){
        UpdateWrapper<SupplierPO>wrapper = new UpdateWrapper<>();
        wrapper.eq("supplier_name",name);
        return supplierWrapper.deleteSupplier(wrapper);
    }
    public SupplierPO searchSupplierByName(String name) {
        QueryWrapper<SupplierPO> wrapper = new QueryWrapper<SupplierPO>().eq("supplier_name", name);
        return supplierWrapper.searchSupplier(wrapper);
    }

    public boolean addSupplier(SupplierPO supplierPO) {
        return supplierWrapper.addSupplier(supplierPO);
    }

    public Boolean updateSupplier(SupplierPO supplierPO) {
        Boolean flag1 = supplierWrapper.updateSupplier(supplierPO);
        if (!("".equals(supplierPO.getSupplierName()))) {
            UpdateCondition<PurchaseOrderPO> updateCondition = new UpdateCondition<>();
            UpdateWrapper<PurchaseOrderPO> wrapper = updateCondition.updateConditionByEqOne("customer_name", supplierPO.getSupplierName());
            PurchaseOrderPO purchaseOrder = new PurchaseOrderPO();
            purchaseOrder.setSupplierName(supplierPO.getSupplierName());
            return purchaseOrderWrapper.updatePurchaseOrderBySomeThing(purchaseOrder, wrapper) && flag1;
        }
        return flag1;

    }


}
