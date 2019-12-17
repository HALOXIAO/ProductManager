package com.manage.sys.dao.wrapper;

import com.manage.sys.entity.PO.WarehousePO;

public interface WarehouseWrapperInterface {

    public Boolean addWarehouseWrapper(WarehousePO warehouse);
    public WarehousePO searchWarehouseById(long id);



}
