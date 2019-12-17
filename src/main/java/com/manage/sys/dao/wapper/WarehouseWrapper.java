package com.manage.sys.dao.wapper;

import com.manage.sys.dao.WarehouseMapper;
import com.manage.sys.entity.PO.WarehousePO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WarehouseWrapper {

    @Autowired
    WarehouseMapper warehouseMapper;

    public Boolean addWarehouseWrapper(WarehousePO warehouse) {
        return warehouseMapper.save(warehouse);
    }

    public WarehousePO searchWarehouseById(long id){
        return warehouseMapper.getById(id);
    }

}
