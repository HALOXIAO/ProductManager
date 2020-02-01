package com.manage.sys.entity.convert;

import com.manage.sys.entity.front.EmployeeFront;
import com.manage.sys.entity.po.EmployeePO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeFrontConvertToPo {
    EmployeeFrontConvertToPo INSTANCE = Mappers.getMapper(EmployeeFrontConvertToPo.class);

    //    @Mapping(target = "status",ignore = true)
    EmployeePO employeeFrontToEmployeePo(EmployeeFront employeeFront);
}
