package com.manage.sys.dao.wrapper.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.dao.ProductMapper;
import com.manage.sys.dao.wrapper.ProductWrapperInterface;
import com.manage.sys.entity.PO.ProductPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public  class ProductWrapper implements ProductWrapperInterface {

    @Autowired
    ProductMapper productMapper;

    @Override
    public Boolean addProduct(ProductPO product) {
        return productMapper.save(product);
    }

    @Override
    public ProductPO searchProductById(int id) {
        return null;
    }

    @Override
    public Boolean updateProduct(ProductPO product) {
        return null;
    }

    @Override
    public Boolean deleteProductBySomething(ProductPO product, UpdateWrapper<ProductPO> updateWrapper) {
        return null;
    }

    @Override
    public ProductPO searchProductBySomething(QueryWrapper<ProductPO> wrapper) {
        return null;
    }
}
