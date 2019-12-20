package com.manage.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.manage.sys.entity.PO.ProductPO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

public interface ProductMapper extends BaseMapper<ProductPO> {
}
