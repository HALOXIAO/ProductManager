package com.manage.sys.dao.wrapper;

public interface SalesWrapperInterface {
     Boolean createSales(SalesPO sales);

     SalesPO searchSalesById(int id);

     Boolean deleteSales(SalesPO sales);

     Boolean updateSales(SalesPO sales);

}
