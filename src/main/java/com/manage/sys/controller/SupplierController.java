package com.manage.sys.controller;

import com.manage.sys.config.status.RESULT_BEAN_CODE;
import com.manage.sys.entity.PO.SupplierPO;
import com.manage.sys.manager.common.beans.ResultBean;
import com.manage.sys.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Objects;

import static java.util.Objects.requireNonNullElse;



@RestController
@RequestMapping("supplier")
public class SupplierController {

    @Autowired
    SupplierService supplierService;

    @GetMapping()
    @Cacheable("supplier")
    public ResultBean<SupplierPO> searchSupplier(@RequestParam String supplierName) {
        //TODO 数据校验
        SupplierPO supplier = supplierService.searchSupplierByName(supplierName);
        return new ResultBean<SupplierPO>(supplier);
    }

    @PostMapping()
    public ResultBean<Boolean> addSupplier(@Valid @RequestBody SupplierPO supplierPO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            ResultBean<Boolean> bean = new ResultBean<>(Boolean.FALSE);
            bean.setCode(ResultBean.ARGUMENT_ERROR);
            bean.setMsg(requireNonNullElse(bindingResult.getFieldError(), "No Error Message").toString());
            return bean;
        }
        return new ResultBean<>(supplierService.addSupplier(supplierPO));
    }

    @DeleteMapping()
    @CacheEvict("supplier")
    public ResultBean<Boolean> deleteSupplier(@RequestParam String supplierName) {
        return new ResultBean<>(supplierService.deleteSupplier(supplierName));
    }

    @PutMapping()
    @CacheEvict(value = "supplier", key = "#supplierPO.supplierName")
    public ResultBean<Boolean> updateSupplier(@Valid @RequestBody SupplierPO supplierPO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            ResultBean<Boolean> bean = new ResultBean<>(Boolean.FALSE);
            bean.setCode(RESULT_BEAN_CODE.ARGUMENT_ERROR.getValue());
            bean.setMsg(Objects.requireNonNullElse(bindingResult.getFieldError(),"No Message Error").toString());
            return bean;
        }
        return new ResultBean<>(supplierService.updateSupplier(supplierPO));
    }

}
