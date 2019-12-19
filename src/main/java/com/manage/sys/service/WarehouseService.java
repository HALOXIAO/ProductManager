package com.manage.sys.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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

    public WarehousePO searchWarehouseById(int id){return warehouseWrapper.searchWarehouseById(id);}

    public boolean addWarehouse(WarehousePO warehousePO){
        return warehouseWrapper.addWarehouseWrapper(warehousePO);
    }

    public boolean updateWarehouseForPurchaseOrder(WarehousePO warehousePO){
            warehouseWrapper.updateWarehouse(warehousePO);
            boolean flag1= warehouseWrapper.updateWarehouse(warehousePO);
            if(!("").equals(warehousePO.getWarehouseName())){
                UpdateCondition<String, PurchaseOrderPO> updateCondition=new UpdateCondition<>();
                UpdateWrapper<PurchaseOrderPO> wrapper = updateCondition.updateEmployeeBy("warehouseName",warehousePO.getWarehouseName());
                PurchaseOrderPO purchaseOrderPO=new PurchaseOrderPO();
                purchaseOrderPO.setCommodityName(warehousePO.getWarehouseName());
                return flag1 ;
            }
            return flag1;
        }

        public boolean updateWarehouseForSales(WarehousePO warehousePO){
            warehouseWrapper.updateWarehouse(warehousePO);
            boolean flag1= warehouseWrapper.updateWarehouse(warehousePO);
            if(!("").equals(warehousePO.getWarehouseName())){
                UpdateCondition<String, SalesPO> updateCondition=new UpdateCondition<>();
                UpdateWrapper<SalesPO> wrapper = updateCondition.updateEmployeeBy("warehouseName",warehousePO.getWarehouseName());
                SalesPO salesPO=new SalesPO();;
                return flag1 ;
            }
            return flag1;
    }

}
