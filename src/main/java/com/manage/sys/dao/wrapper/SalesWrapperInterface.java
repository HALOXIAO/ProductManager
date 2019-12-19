package com.manage.sys.dao.wrapper;

import com.manage.sys.entity.PO.SalesPO;

public interface SalesWrapperInterface {
     Boolean createSales(SalesPO sales);

     SalesPO searchSalesById(Integer id);

     Boolean deleteSales(SalesPO sales);

     Boolean updateSales(SalesPO sales);

}
