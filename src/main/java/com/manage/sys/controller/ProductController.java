package com.manage.sys.controller;

import com.manage.sys.entity.PO.ProductPO;
import com.manage.sys.manager.common.beans.ResultBean;
import com.manage.sys.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Objects;

@RestController
public class ProductController {
    /**
     * TODO 多个商品
     */
    @Autowired
    ProductService productService;

    @PostMapping
    public ResultBean<Boolean> addProduct(@Valid @RequestBody ProductPO productPO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            ResultBean<Boolean> resultBean = new ResultBean<>(Boolean.FALSE);
            resultBean.setCode(ResultBean.ARGUMENT_ERROR);
            resultBean.setMsg(Objects.requireNonNullElse(bindingResult.getFieldError(), "No ErrorMessage").toString());
            return resultBean;
        }
        return new ResultBean<>(productService.addProduct(productPO));
    }

}
