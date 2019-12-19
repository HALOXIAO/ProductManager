package com.manage.sys.service;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.dao.ProductMapper;
import com.manage.sys.dao.condition.UpdateCondition;
import com.manage.sys.dao.wrapper.impl.ProductWrapper;
import com.manage.sys.dao.wrapper.impl.SalesWrapper;
import com.manage.sys.entity.PO.EmployeePO;
import com.manage.sys.entity.PO.ProductPO;
import com.manage.sys.entity.PO.PurchaseOrderPO;
import com.manage.sys.entity.PO.SalesPO;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {
    @Autowired
    ProductWrapper productWrapper;

    @Autowired
    ProductMapper productMapper;

    @Autowired
    PurchaseOrderWrapper purchaseOrderWrapper;

    @Autowired
    SalesWrapper salesWrapper;

    @Autowired
    EmployeeService employeeService;

    public ProductPO searchProductById(int id){return productMapper.getById(id); }

    public Boolean addProduct(ProductPO productPO){return productMapper.save(productPO);}

    public Boolean updateProductForPurchaseOrder(ProductPO productPO){
        productWrapper.updateProduct(productPO);
        boolean flag1=productWrapper.updateProduct(productPO);
        if(!("").equals(productPO.getCommodityName())){
            UpdateCondition<String,PurchaseOrderPO> updateCondition=new UpdateCondition<>();
            UpdateWrapper<PurchaseOrderPO> wrapper = updateCondition.updateEmployeeBy("commodityName",productPO.getCommodityName());
            PurchaseOrderPO purchaseOrderPO=new PurchaseOrderPO();
            purchaseOrderPO.setCommodityName(productPO.getCommodityName());
            boolean flag2 = purchaseOrderWrapper.updateProductBySomeThing(productPO, wrapper);
            return flag1 && flag2;
        }
        return flag1;
    }

    public Boolean updateProductForSales(ProductPO productPO ){
        productWrapper.updateProduct(productPO);
        boolean flag1=productWrapper.updateProduct(productPO);
        if(!("").equals(productPO.getCommodityName())){
            UpdateCondition<String,SalesPO> updateCondition=new UpdateCondition<>();
            UpdateWrapper<SalesPO> wrapper = updateCondition.updateEmployeeBy("commodityName",productPO.getCommodityName());
            SalesPO salesPO=new SalesPO();
            salesPO.setCommodityName(productPO.getCommodityName());
            boolean flag2=salesWrapper.updateSalesBySomeThing(salesPO,wrapper);
            return flag1 && flag2;
        }
        return flag1;
    }

}
