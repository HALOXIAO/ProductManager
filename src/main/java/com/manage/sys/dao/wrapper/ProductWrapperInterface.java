package com.manage.sys.dao.wrapper;

import com.manage.sys.entity.PO.ProductPO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

public interface ProductWrapperInterface {

    Boolean addProduct(ProductPO product);

    ProductPO searchProductById(int id);

}
