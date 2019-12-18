package com.manage.sys.dao;

import com.baomidou.mybatisplus.extension.service.IService;
import com.manage.sys.entity.PO.UserPO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface UserMapper extends IService<UserPO> {
}