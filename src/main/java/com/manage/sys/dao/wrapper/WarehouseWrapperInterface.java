package com.manage.sys.dao.wrapper;

import com.manage.sys.entity.PO.WarehousePO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

public   interface WarehouseWrapperInterface {

      Boolean addWarehouseWrapper(WarehousePO warehouse);

      WarehousePO searchWarehouseById(long id);

      Boolean updateWarehouse(WarehousePO warehousePO);







}
