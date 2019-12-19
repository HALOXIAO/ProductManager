package com.manage.sys.dao.wrapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

public interface SalesWrapperInterface {
     Boolean createSales(SalesPO sales);

     SalesPO searchSalesById(Integer id);

     Boolean deleteSales(SalesPO sales);

     Boolean updateSales(SalesPO sales);

     Boolean updateSalesBySomeThing(SalesPO salesPO, QueryWrapper<SalesPO> wrapper);

}
