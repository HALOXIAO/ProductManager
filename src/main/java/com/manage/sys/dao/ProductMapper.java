package com.manage.sys.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.config.status.PRODUCT_STATUS_CODE;
import com.manage.sys.entity.po.ProductPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper  {

    @Autowired
    Product productMapper;

    
    public Boolean addProduct(ProductPO product) {
        return productMapper.insert(product) == 1;
    }

    
    public ProductPO searchProductById(int id) {
        return productMapper.selectById(id);
    }

    
    public Boolean updateProduct(ProductPO product) {
        return productMapper.update(product, null) == 1;
    }

    
    public Boolean deleteProductBySomething(ProductPO product, UpdateWrapper<ProductPO> updateWrapper) {
        product.setStatus(PRODUCT_STATUS_CODE.PRODUCT_STATUS_CODE_LAYOUT.getValue());
        return productMapper.update(product, updateWrapper) == 1;
    }

    
    public ProductPO searchProductBySomething(QueryWrapper<ProductPO> wrapper) {
        return productMapper.selectOne(wrapper);
    }
}
