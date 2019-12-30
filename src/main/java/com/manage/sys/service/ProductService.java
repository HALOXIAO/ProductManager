package com.manage.sys.service;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.dao.wrapper.impl.OrderProductWrapper;
import com.manage.sys.dao.wrapper.impl.ProductWrapper;
import com.manage.sys.dao.wrapper.impl.PurchaseOrderWrapper;
import com.manage.sys.dao.wrapper.impl.SalesWrapper;
import com.manage.sys.entity.PO.OrderProductPO;
import com.manage.sys.entity.PO.ProductPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {
    @Autowired
    ProductWrapper productWrapper;

    @Autowired
    OrderProductWrapper orderProductWrapper;


    public ProductPO searchProductById(int id) {
        return productWrapper.searchProductById(id);
    }



    public Boolean addProduct(ProductPO productPO) {

        return productWrapper.addProduct(productPO);
    }

    @Transactional(propagation = Propagation.NESTED)
    public Boolean updateProduct(ProductPO productPO) throws Exception {
        Boolean orderProductFlag = Boolean.TRUE;
        Boolean productFlag = productWrapper.updateProduct(productPO);
        if (!("").equals(productPO.getProductName())) {
            OrderProductPO orderProduct = new OrderProductPO();
            orderProduct.setProductName(productPO.getProductName());
            UpdateWrapper<OrderProductPO> wrapper = new UpdateWrapper<OrderProductPO>().eq("product_name", orderProduct.getProductName());
            orderProductFlag = orderProductWrapper.updateOrderProduct(orderProduct, wrapper);
            return orderProductFlag && productFlag;
        }
        return productFlag;
    }



}
