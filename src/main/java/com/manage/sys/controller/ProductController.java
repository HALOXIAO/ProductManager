package com.manage.sys.controller;

        import com.google.common.collect.ImmutableList;
        import com.manage.sys.entity.convert.ProductFrontConvertToPo;
        import com.manage.sys.entity.front.ProductFront;
        import com.manage.sys.entity.po.ProductPO;
        import com.manage.sys.manager.common.beans.ResultBean;
        import com.manage.sys.service.ProductService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.validation.BindingResult;
        import org.springframework.web.bind.annotation.*;


        import javax.validation.Valid;
        import java.util.List;
        import java.util.Objects;

@RestController
@RequestMapping("/products")
public class ProductController {
    /**
     * TODO 多个商品
     */

    private final Integer PRODUCT_ID = 1;
    private final Integer PRODUCT_NUMBER = 2;
    private final Integer PRODUCT_NAME = 3;
    private final ImmutableList<Integer> list = ImmutableList.of(PRODUCT_ID, PRODUCT_NAME, PRODUCT_NUMBER);


    @Autowired
    ProductService productService;

    @PostMapping
    public ResultBean<Boolean> addProduct(@Valid @RequestBody ProductFront productFront, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            ResultBean<Boolean> resultBean = new ResultBean<>(Boolean.FALSE);
            resultBean.setCode(ResultBean.ARGUMENT_ERROR);
            resultBean.setMsg(Objects.requireNonNullElse(bindingResult.getFieldError(), "No ErrorMessage").toString());
            return resultBean;
        }
        ProductPO productPO = ProductFrontConvertToPo.INSTANCE.productFrontConvertToPo(productFront);
        return new ResultBean<>(productService.addProduct(productPO));
    }

    @DeleteMapping()
    public ResultBean<Boolean> deleteProduct(@RequestParam(value = "id") Integer id, @RequestParam(value = "number") String number) {
        if (id == null && number == null) {
            return new ResultBean<>(Boolean.FALSE);
        }
        return new ResultBean<>(productService.deleteProduct(id, number));
    }

    @GetMapping("/{information}")
    public ResultBean<ProductPO> searchProduct(@PathVariable(value = "id") String information, @RequestParam(value = "status", required = true) Integer status) {
        ResultBean<ProductPO> bean = new ResultBean<>();
        if (!list.contains(status)) {
            bean.setCode(ResultBean.ARGUMENT_ERROR);
            bean.setMsg("status wrong");
            return bean;
        }
        productService.searchProduct()
    }

    @GetMapping("/")
    public ResultBean<List<ProductPO>> searchProductBySomething() {

    }

}
