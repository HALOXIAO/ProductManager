package com.manage.sys.entity.convert;

import com.manage.sys.entity.front.ProductFront;
import com.manage.sys.entity.po.ProductPO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductFrontConvertToPo {
    ProductFrontConvertToPo INSTANCE = Mappers.getMapper(ProductFrontConvertToPo.class);


    ProductPO productFrontConvertToPo(ProductFront productFront);
}
