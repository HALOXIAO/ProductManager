package com.manage.sys.dao.wrapper.impl;

import com.manage.sys.dao.WarehouseMapper;
import com.manage.sys.entity.PO.WarehousePO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public  class WarehouseWrapper implements com.manage.sys.dao.wrapper.WarehouseWrapperInterface {

    @Autowired
    WarehouseMapper warehouseMapper;

    @Override
    public Boolean addWarehouseWrapper(WarehousePO warehouse) {
        return warehouseMapper.save(warehouse);
    }

    @Override
    public WarehousePO searchWarehouseById(long id) {
        return warehouseMapper.getById(id);
    }

}


