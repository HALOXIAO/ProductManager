package com.manage.sys.dao;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.entity.po.PurchaseOrderPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PurchaseOrderMapper  {

    @Autowired
    PurchaseOrder purchaseOrderMapper;

    
    public Boolean updatePurchaseOrderBySomeThing(PurchaseOrderPO purchaseOrderPO, UpdateWrapper<PurchaseOrderPO> wrapper) {
        return purchaseOrderMapper.update(purchaseOrderPO,wrapper)==1;
    }


    
    public Boolean addPurchaseOrder(PurchaseOrderPO purchaseOrderPO) {
        return null;
    }

    
    public PurchaseOrderPO getById(Integer id) {
        return null;
    }
}
