package com.manage.sys.dao.wrapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.dao.condition.UpdateCondition;
import com.manage.sys.entity.PO.PurchaseOrderPO;
import com.manage.sys.entity.PO.RolePO;

public interface PurchaseOrderWrapperInterface {

    Boolean addPurchaseOrder(PurchaseOrderPO purchaseOrderPO);

    PurchaseOrderPO getById(Integer id);

    Boolean updatePurchaseOrderBySomeThing(PurchaseOrderPO purchaseOrderPO,  UpdateWrapper<PurchaseOrderPO> wrapper);



}
