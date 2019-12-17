package com.manage.sys.dao.wrapper.impl;

import com.manage.sys.dao.ProductMapper;
import com.manage.sys.dao.wrapper.ProductWrapperInterface;
import com.manage.sys.entity.PO.ProductPO;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductWrapper implements ProductWrapperInterface {

    @Autowired
    ProductMapper productMapper;

    @Override
    public Boolean addProduct(ProductPO product) {
        return productMapper.save(product);
    }

    @Override
    public ProductPO searchProductById(int id) {
        return productMapper.getById(id);
    }


}
