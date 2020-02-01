package com.manage.sys.service;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.dao.OrderProductMapper;
import com.manage.sys.dao.ProductMapper;
import com.manage.sys.entity.po.OrderProductPO;
import com.manage.sys.entity.po.ProductPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductMapper productMapper;

    @Autowired
    OrderProductMapper orderProductMapper;


    public ProductPO searchProductById(int id) {
        return productMapper.searchProductById(id);
    }


    public Boolean addProduct(ProductPO productPO) {
        return productMapper.addProduct(productPO);
    }

    @Transactional(propagation = Propagation.NESTED)
    public Boolean updateProduct(ProductPO productPO) throws Exception {
        Boolean orderProductFlag = Boolean.TRUE;
        Boolean productFlag = productMapper.updateProduct(productPO);
        if (!("").equals(productPO.getProductName())) {
            OrderProductPO orderProduct = new OrderProductPO();
            orderProduct.setProductName(productPO.getProductName());
            UpdateWrapper<OrderProductPO> wrapper = new UpdateWrapper<OrderProductPO>().eq("product_name", orderProduct.getProductName());
            orderProductFlag = orderProductMapper.updateOrderProduct(orderProduct, wrapper);
            return orderProductFlag && productFlag;
        }
        return productFlag;
    }


    public Boolean deleteProduct(Integer id, String number) {
        ProductPO productPO = new ProductPO();
        UpdateWrapper<ProductPO> wrapper = new UpdateWrapper<>();
        if (id != null) {
            wrapper.eq("product_id", id);
        } else {
            wrapper.eq("product_number", number);
        }
        productMapper.deleteProductBySomething(productPO, wrapper);
    }

    public List<ProductPO> searchProduct(String idOrNumberOrName, Integer status) {

    }

}
