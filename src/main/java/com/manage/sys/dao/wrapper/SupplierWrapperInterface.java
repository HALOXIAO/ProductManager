package com.manage.sys.dao.wrapper;

import com.manage.sys.entity.PO.SupplierPO;

public interface SupplierWrapperInterface {
    Boolean updateSupplier(SupplierPO supplierPO);

    SupplierPO getById(Integer id);

    Boolean addSupplier(SupplierPO supplierPO);
}
