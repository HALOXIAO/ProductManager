package com.manage.sys.dao.wrapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.manage.sys.entity.PO.PurchaseOrderPO;
import com.manage.sys.entity.PO.RolePO;

public interface PurchaseOrderWrapperInterface {
    Boolean updatepurchaseOrderBySomeThing(PurchaseOrderPO purchaseOrderPO, QueryWrapper<PurchaseOrderPO> wrapper);

    Boolean addPurchaseOrder(PurchaseOrderPO purchaseOrderPO);

    PurchaseOrderPO getById(Integer id);



}
