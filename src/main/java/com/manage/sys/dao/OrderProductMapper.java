package com.manage.sys.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.dao.wrapper.OrderProductWrapperInterface;
import com.manage.sys.entity.po.OrderProductPO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderProductMapper implements OrderProductWrapperInterface {
    @Override
    public Boolean updateOrderProduct(OrderProductPO orderProductPO, UpdateWrapper<OrderProductPO> wrapper) {
        return null;
    }

    @Override
    public List<OrderProductPO> getOrderProduct(QueryWrapper<OrderProductPO> queryWrapper) {
        return null;
    }

    @Override
    public Boolean deleteOrderProduct(OrderProductPO orderProductPO, QueryWrapper<OrderProductPO> wrapper) {
        return null;
    }

    @Override
    public Boolean addOrderProduct(OrderProductPO orderProductPO) {
        return null;
    }
}
