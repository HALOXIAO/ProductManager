package com.manage.sys.dao.wrapper;

import com.manage.sys.entity.PO.WarehousePO;

public   interface WarehouseWrapperInterface {

      Boolean addWarehouseWrapper(WarehousePO warehouse);
      WarehousePO searchWarehouseById(long id);



}
