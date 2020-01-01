package com.manage.sys.dao.wrapper;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.entity.po.PurchaseOrderPO;

public interface PurchaseOrderWrapperInterface {

    Boolean addPurchaseOrder(PurchaseOrderPO purchaseOrderPO);

    PurchaseOrderPO getById(Integer id);

    Boolean updatePurchaseOrderBySomeThing(PurchaseOrderPO purchaseOrderPO,  UpdateWrapper<PurchaseOrderPO> wrapper);



}
