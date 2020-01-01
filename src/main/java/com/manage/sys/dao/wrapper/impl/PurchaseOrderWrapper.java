package com.manage.sys.dao.wrapper.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.dao.PurchaseOrderMapper;
import com.manage.sys.dao.wrapper.PurchaseOrderWrapperInterface;
import com.manage.sys.entity.po.PurchaseOrderPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PurchaseOrderWrapper implements PurchaseOrderWrapperInterface {

    @Autowired
    PurchaseOrderMapper purchaseOrderMapper;

    @Override
    public Boolean updatePurchaseOrderBySomeThing(PurchaseOrderPO purchaseOrderPO, UpdateWrapper<PurchaseOrderPO> wrapper) {
        return purchaseOrderMapper.update(purchaseOrderPO,wrapper)==1;
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
