package com.manage.sys.dao.wrapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.entity.PO.OrderProductPO;

import java.util.List;

public interface OrderProductWrapperInterface {

    Boolean updateOrderProduct(OrderProductPO orderProductPO, UpdateWrapper<OrderProductPO>wrapper);

    List<OrderProductPO> getOrderProduct(QueryWrapper<OrderProductPO>queryWrapper);

    Boolean deleteOrderProduct(OrderProductPO orderProductPO,QueryWrapper<OrderProductPO>wrapper);

    Boolean addOrderProduct(OrderProductPO orderProductPO);

}
