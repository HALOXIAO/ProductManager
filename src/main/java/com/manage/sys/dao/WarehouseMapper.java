package com.manage.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.manage.sys.entity.PO.WarehousePO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

public interface WarehouseMapper extends BaseMapper<WarehousePO> {
}
