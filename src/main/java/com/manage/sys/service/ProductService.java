package com.manage.sys.service;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.dao.ProductMapper;
import com.manage.sys.dao.condition.UpdateCondition;
import com.manage.sys.dao.wrapper.impl.ProductWrapper;
import com.manage.sys.dao.wrapper.impl.PurchaseOrderWrapper;
import com.manage.sys.dao.wrapper.impl.SalesWrapper;
import com.manage.sys.entity.PO.ProductPO;
import com.manage.sys.entity.PO.PurchaseOrderPO;
import com.manage.sys.entity.PO.SalesPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {
    @Autowired
    ProductWrapper productWrapper;

    @Autowired
    PurchaseOrderWrapper purchaseOrderWrapper;

    @Autowired
    SalesWrapper salesWrapper;

    @Autowired
    EmployeeService employeeService;

    public ProductPO searchProductById(int id) {
        return productWrapper.searchProductById(id);
    }

    public Boolean addProduct(ProductPO productPO) {
        return productWrapper.addProduct(productPO);
    }

    public Boolean updateProduct(ProductPO productPO) {
        Boolean flag1 = productWrapper.updateProduct(productPO);
        if (!("").equals(productPO.getCommodityName())) {
            UpdateCondition<SalesPO> updateCondition = new UpdateCondition<>();
            UpdateWrapper<SalesPO> wrapper = updateCondition.updateConditionByEqOne("commodity_name", productPO.getCommodityName());
            SalesPO sales = new SalesPO();
            sales.setCommodityName(productPO.getCommodityName());
            PurchaseOrderPO purchaseOrder = new PurchaseOrderPO();
            UpdateCondition<PurchaseOrderPO> orderCondition = new UpdateCondition<>();
            UpdateWrapper<PurchaseOrderPO> updateWrapper = orderCondition.updateConditionByEqOne("commodity_name", purchaseOrder.getCommodityName());
            Boolean flag2 = purchaseOrderWrapper.updatePurchaseOrderBySomeThing(purchaseOrder, updateWrapper);
            Boolean flag3 = salesWrapper.updateSalesBySomeThing(sales, wrapper);
            return flag1 && flag2 && flag3;
        }
        return flag1;
    }

}
