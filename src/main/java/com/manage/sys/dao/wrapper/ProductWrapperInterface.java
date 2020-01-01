package com.manage.sys.dao.wrapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.entity.po.ProductPO;

public interface ProductWrapperInterface {

    Boolean addProduct(ProductPO product);

    ProductPO searchProductById(int id);

    Boolean updateProduct(ProductPO product);

    public Boolean deleteProductBySomething(ProductPO product, UpdateWrapper<ProductPO> updateWrapper);

    public ProductPO searchProductBySomething(QueryWrapper<ProductPO> wrapper);

}
