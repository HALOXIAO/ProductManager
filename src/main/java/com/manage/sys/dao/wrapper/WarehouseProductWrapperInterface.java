package com.manage.sys.dao.wrapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.entity.po.WarehouseProductPO;

import java.util.List;

public interface WarehouseProductWrapperInterface {

    Boolean updateWarehouseProduct(WarehouseProductPO warehouseProductPO, UpdateWrapper<WarehouseProductPO> warehouseProductPOUpdateWrapper);

    Boolean deleteWarehouseProduct(UpdateWrapper<WarehouseProductPO> warehouseProductPOUpdateWrapper);

    List<WarehouseProductPO> getWarehouseProductBySomething(QueryWrapper<WarehouseProductPO> queryWrapper);

    Boolean addWarehouseProduct(WarehouseProductPO warehouseProductPO);
}
