package com.manage.sys.dao.wrapper.impl;

import com.manage.sys.dao.wrapper.SupplierWrapperInterface;
import com.manage.sys.entity.PO.SupplierPO;
import org.springframework.stereotype.Component;

@Component
public class SupplierWrapper implements SupplierWrapperInterface {
    @Override
    public Boolean updateSupplier(SupplierPO supplierPO) {
        return null;
    }

    @Override
    public SupplierPO getById(Integer id) {
        return null;
    }

    @Override
    public Boolean addSupplier(SupplierPO supplierPO) {
        return null;
    }
}
