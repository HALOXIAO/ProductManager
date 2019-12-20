package com.manage.sys.dao.condition;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.manage.sys.entity.PO.EmployeePO;

public class QueryCondition<T> {
    public QueryWrapper<T> queryEmployeeBy(String column,String roleName){
        QueryWrapper<T> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(column,roleName);
        return queryWrapper;
    }


}


