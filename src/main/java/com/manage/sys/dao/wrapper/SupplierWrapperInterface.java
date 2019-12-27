package com.manage.sys.dao.wrapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.entity.PO.SupplierPO;

public interface SupplierWrapperInterface {
    Boolean updateSupplier(SupplierPO supplierPO);

    SupplierPO getById(Integer id);

    Boolean addSupplier(SupplierPO supplierPO);

    SupplierPO searchSupplier(QueryWrapper<SupplierPO> wrapper);

    Boolean updateSupplierBySomeThing(SupplierPO supplierPO, UpdateWrapper<SupplierPO> wrapper);

    Boolean deleteSupplier(UpdateWrapper<SupplierPO> wrapper);

}
