package com.manage.sys.dao.wrapper.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.manage.sys.dao.wrapper.PurchaseOrderWrapperInterface;
import com.manage.sys.entity.PO.PurchaseOrderPO;

public class PurchaseOrderWrapper implements PurchaseOrderWrapperInterface {
    @Override
    public Boolean updatePurchaseOrderBySomeThing(PurchaseOrderPO purchaseOrderPO, QueryWrapper<PurchaseOrderPO> wrapper) {
        return null;
    }

    @Override
    public Boolean addPurchaseOrder(PurchaseOrderPO purchaseOrderPO) {
        return null;
    }

    @Override
    public PurchaseOrderPO getById(Integer id) {
        return null;
    }
}
