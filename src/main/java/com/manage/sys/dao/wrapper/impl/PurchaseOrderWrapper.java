package com.manage.sys.dao.wrapper.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.dao.condition.UpdateCondition;
import com.manage.sys.dao.wrapper.PurchaseOrderWrapperInterface;
import com.manage.sys.entity.PO.PurchaseOrderPO;
import org.springframework.stereotype.Component;

@Component
public class PurchaseOrderWrapper implements PurchaseOrderWrapperInterface {




    @Override
    public Boolean addPurchaseOrder(PurchaseOrderPO purchaseOrderPO) {
        return null;
    }

    @Override
    public PurchaseOrderPO getById(Integer id) {
        return null;
    }
}
