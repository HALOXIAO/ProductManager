package com.manage.sys.dao.wrapper;

import com.manage.sys.entity.PO.ProductPO;

public interface ProductWrapperInterface {

    Boolean addProduct(ProductPO product);

    ProductPO searchProductById(int id);

}
