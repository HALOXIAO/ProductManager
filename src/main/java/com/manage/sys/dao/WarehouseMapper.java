package com.manage.sys.dao;

import com.baomidou.mybatisplus.extension.service.IService;
import com.manage.sys.entity.PO.WarehousePO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface WarehouseMapper extends IService<WarehousePO> {
}
