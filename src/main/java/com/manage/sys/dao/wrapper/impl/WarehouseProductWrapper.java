package com.manage.sys.dao.wrapper.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.dao.wrapper.WarehouseProductWrapperInterface;
import com.manage.sys.entity.po.WarehouseProductPO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WarehouseProductWrapper implements WarehouseProductWrapperInterface {

    @Override
    public Boolean updateWarehouseProduct(WarehouseProductPO warehouseProductPO, UpdateWrapper<WarehouseProductPO> warehouseProductPOUpdateWrapper) {
        return null;
    }

    @Override
    public Boolean deleteWarehouseProduct(UpdateWrapper<WarehouseProductPO> warehouseProductPOUpdateWrapper) {
        return null;
    }

    @Override
    public List<WarehouseProductPO> getWarehouseProductBySomething(QueryWrapper<WarehouseProductPO> queryWrapper) {
        return null;
    }

    @Override
    public Boolean addWarehouseProduct(WarehouseProductPO warehouseProductPO) {
        return null;
    }
}
