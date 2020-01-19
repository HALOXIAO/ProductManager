package com.manage.sys.dao;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.entity.po.SalesPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SalesMapper  {

    @Autowired
    Sales salesMapper;

    
    public Boolean createSales(SalesPO sales) {
        return null;
    }

    
    public SalesPO searchSalesById(Integer id) {
        return null;
    }

    
    public Boolean deleteSales(SalesPO sales) {
        return null;
    }

    
    public Boolean updateSales(SalesPO sales) {
        return null;
    }

    
    public Boolean updateSalesBySomeThing(SalesPO salesPO, UpdateWrapper<SalesPO> wrapper) {
        return salesMapper.update(salesPO, wrapper) == 1;
    }
}
