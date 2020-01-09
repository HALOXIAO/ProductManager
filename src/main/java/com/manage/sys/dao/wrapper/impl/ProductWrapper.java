package com.manage.sys.dao.wrapper.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.config.status.PRODUCT_STATUS_CODE;
import com.manage.sys.dao.ProductMapper;
import com.manage.sys.dao.wrapper.ProductWrapperInterface;
import com.manage.sys.entity.po.ProductPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductWrapper implements ProductWrapperInterface {

    @Autowired
    ProductMapper productMapper;

    @Override
    public Boolean addProduct(ProductPO product) {
        return productMapper.insert(product) == 1;
    }

    @Override
    public ProductPO searchProductById(int id) {
        return productMapper.selectById(id);
    }

    @Override
    public Boolean updateProduct(ProductPO product) {
        return productMapper.update(product, null) == 1;
    }

    @Override
    public Boolean deleteProductBySomething(ProductPO product, UpdateWrapper<ProductPO> updateWrapper) {
        product.setStatus(PRODUCT_STATUS_CODE.PRODUCT_STATUS_CODE_LAYOUT.getValue());
        return productMapper.update(product, updateWrapper) == 1;
    }

    @Override
    public ProductPO searchProductBySomething(QueryWrapper<ProductPO> wrapper) {
        return productMapper.selectOne(wrapper);
    }
}
