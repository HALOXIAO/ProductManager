package com.manage.sys.controller;

import com.manage.sys.entity.PO.SalesPO;
import com.manage.sys.manager.common.beans.ResultBean;
import com.manage.sys.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Objects;

@RestController
@RequestMapping("/sales")
public class SalesController {

    @Autowired
    SalesService salesService;

    @PostMapping("")
    public ResultBean<Boolean> createSales(@Valid @RequestBody SalesPO sales, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            ResultBean<Boolean> bean = new ResultBean<>(Boolean.FALSE);
            bean.setMsg(Objects.requireNonNullElse(bindingResult.getFieldError(), "No Error Message").toString());
            return bean;
        }
        return new ResultBean<>(salesService.addSales(sales));

    }

}
