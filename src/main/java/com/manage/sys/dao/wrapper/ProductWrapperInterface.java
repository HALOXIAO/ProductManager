package com.manage.sys.dao.wrapper;

import com.manage.sys.entity.PO.ProductPO;

public interface ProductWrapperInterface {

    public Boolean addProduct(ProductPO product);

    public ProductPO searchProductById(int id);

}
