package com.manage.sys.service;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.dao.wrapper.impl.PurchaseOrderWrapper;
import com.manage.sys.dao.wrapper.impl.SalesWrapper;
import com.manage.sys.dao.wrapper.impl.WarehouseProductWrapper;
import com.manage.sys.dao.wrapper.impl.WarehouseWrapper;
import com.manage.sys.entity.po.WarehousePO;
import com.manage.sys.entity.po.WarehouseProductPO;
import org.springframework.beans.factory.annotation.Autowired;

public class WarehouseService {
    @Autowired
    WarehouseWrapper warehouseWrapper;
    @Autowired
    PurchaseOrderWrapper purchaseOrderWrapper;
    @Autowired
    SalesWrapper salesWrapper;

    @Autowired
    WarehouseProductWrapper warehouseProductWrapper;


    public WarehousePO searchWarehouseById(int id) {
        return warehouseWrapper.searchWarehouseById(id);
    }

    public boolean addWarehouse(WarehousePO warehousePO) {
        return warehouseWrapper.addWarehouseWrapper(warehousePO);
    }

    public Boolean updateWarehouse(WarehousePO warehousePO) {
        Boolean productFlag1= Boolean.TRUE;
        if(!("").equals(warehousePO.getWarehouseName())){
            WarehouseProductPO warehouseProductPO = new WarehouseProductPO();
            warehouseProductPO.setWarehouseName(warehousePO.getWarehouseName());
            UpdateWrapper<WarehouseProductPO> wrapper = new UpdateWrapper<WarehouseProductPO>().eq("warehouse_name",warehouseProductPO.getWarehouseName());
            productFlag1= warehouseProductWrapper.updateWarehouseProduct(warehouseProductPO,wrapper);
        }
        return warehouseWrapper.updateWarehouse(warehousePO)&&productFlag1;

    }

}
