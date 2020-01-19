package com.manage.sys.dao;

import com.manage.sys.entity.po.WarehousePO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public  class WarehouseMapper {

    @Autowired
    Warehouse warehouseMapper;


    
    public Boolean updateWarehouse(WarehousePO warehousePO) {
        return null;
    }

    
    public Boolean addWarehouseWrapper(WarehousePO warehouse) {
        return warehouseMapper.insert(warehouse)==1;
    }

    
    public WarehousePO searchWarehouseById(long id) {
        return warehouseMapper.selectById(id);
    }

}


