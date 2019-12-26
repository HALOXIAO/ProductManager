package com.manage.sys.service;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.dao.condition.UpdateCondition;
import com.manage.sys.dao.wrapper.impl.PurchaseOrderWrapper;
import com.manage.sys.dao.wrapper.impl.SalesWrapper;
import com.manage.sys.dao.wrapper.impl.WarehouseWrapper;
import com.manage.sys.entity.PO.PurchaseOrderPO;
import com.manage.sys.entity.PO.SalesPO;
import com.manage.sys.entity.PO.WarehousePO;
import org.springframework.beans.factory.annotation.Autowired;

public class WarehouseService {
    @Autowired
    WarehouseWrapper warehouseWrapper;
    @Autowired
    PurchaseOrderWrapper purchaseOrderWrapper;
    @Autowired
    SalesWrapper salesWrapper;

    public WarehousePO searchWarehouseById(int id) {
        return warehouseWrapper.searchWarehouseById(id);
    }

    public boolean addWarehouse(WarehousePO warehousePO) {
        return warehouseWrapper.addWarehouseWrapper(warehousePO);
    }

    public Boolean updateWarehouse(WarehousePO warehousePO) {
        Boolean flag1 = warehouseWrapper.updateWarehouse(warehousePO);
        if (!("").equals(warehousePO.getWarehouseName())) {
            return updateWarehouseForPurchaseOrder(warehousePO) && updateWarehouseForSales(warehousePO) && flag1;
        }
        return flag1;
    }


    private Boolean updateWarehouseForPurchaseOrder(WarehousePO warehousePO) {
        UpdateCondition<PurchaseOrderPO> updateCondition = new UpdateCondition<>();
        UpdateWrapper<PurchaseOrderPO> wrapper = updateCondition.updateConditionByEqOne("warehouse_name", warehousePO.getWarehouseName());
        PurchaseOrderPO purchaseOrderPO = new PurchaseOrderPO();
        purchaseOrderPO.setWarehouseName(warehousePO.getWarehouseName());
        return purchaseOrderWrapper.updatePurchaseOrderBySomeThing(purchaseOrderPO, wrapper);
    }

    private Boolean updateWarehouseForSales(WarehousePO warehousePO) {
        UpdateCondition<SalesPO> updateCondition = new UpdateCondition<>();
        UpdateWrapper<SalesPO> wrapper = updateCondition.updateConditionByEqOne("warehouse_name", warehousePO.getWarehouseName());
        SalesPO salesPO = new SalesPO();
        salesPO.setWarehouseName(warehousePO.getWarehouseName());
        return salesWrapper.updateSalesBySomeThing(salesPO, wrapper);
    }

}
