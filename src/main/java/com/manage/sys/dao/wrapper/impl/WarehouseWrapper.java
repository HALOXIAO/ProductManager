package com.manage.sys.dao.wrapper.impl;

import com.manage.sys.dao.WarehouseMapper;
import com.manage.sys.dao.wrapper.WarehouseWrapperInterface;
import com.manage.sys.entity.PO.WarehousePO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WarehouseWrapper implements WarehouseWrapperInterface {

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


