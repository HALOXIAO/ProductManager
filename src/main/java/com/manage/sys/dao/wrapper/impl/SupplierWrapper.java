package com.manage.sys.dao.wrapper.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.config.status.SUPPLIER_STATUS_CODE;
import com.manage.sys.dao.wrapper.SupplierMapper;
import com.manage.sys.dao.wrapper.SupplierWrapperInterface;
import com.manage.sys.entity.PO.SupplierPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SupplierWrapper implements SupplierWrapperInterface {

    @Autowired
    SupplierMapper supplierMapper;

    @Override
    public SupplierPO searchSupplier( QueryWrapper<SupplierPO> wrapper){
        return supplierMapper.selectOne(wrapper);
    }

    @Override
    public Boolean updateSupplier(SupplierPO supplierPO) {
        return null;
    }

    @Override
    public SupplierPO getById(Integer id) {
        return null;
    }

    @Override
    public Boolean updateSupplierBySomeThing(SupplierPO supplierPO, UpdateWrapper<SupplierPO> wrapper) {
        return null;
    }

    @Override
    public Boolean deleteSupplier(UpdateWrapper<SupplierPO>wrapper){
        SupplierPO supplierPO = new SupplierPO();
        supplierPO.setStatus(SUPPLIER_STATUS_CODE.SUPPLIER_STATUS_CODE_FORMERSUPPLIER.getValue());
        return updateSupplierBySomeThing(supplierPO,wrapper);
    }

    @Override
    public Boolean addSupplier(SupplierPO supplierPO) {
        return null;
    }


}
