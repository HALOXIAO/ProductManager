package com.manage.sys.dao.wrapper.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.dao.SalesMapper;
import com.manage.sys.dao.wrapper.SalesWrapperInterface;
import com.manage.sys.entity.PO.SalesPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SalesWrapper implements SalesWrapperInterface {

    @Autowired
    SalesMapper salesMapper;

    @Override
    public Boolean createSales(SalesPO sales) {
        return null;
    }

    @Override
    public SalesPO searchSalesById(Integer id) {
        return null;
    }

    @Override
    public Boolean deleteSales(SalesPO sales) {
        return null;
    }

    @Override
    public Boolean updateSales(SalesPO sales) {
        return null;
    }

    @Override
    public Boolean updateSalesBySomeThing(SalesPO salesPO, UpdateWrapper<SalesPO> wrapper) {
        return salesMapper.update(salesPO, wrapper) == 1;
    }
}
