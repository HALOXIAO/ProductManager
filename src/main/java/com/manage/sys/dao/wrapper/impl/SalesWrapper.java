package com.manage.sys.dao.wrapper.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.manage.sys.dao.wrapper.SalesWrapperInterface;
import com.manage.sys.entity.PO.SalesPO;
import org.springframework.stereotype.Component;

@Component
public class SalesWrapper implements SalesWrapperInterface {
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
    public  Boolean updateSalesBySomeThing(SalesPO salesPO, QueryWrapper<SalesPO> wrapper){return null;}
}
