package com.manage.sys.dao.condition;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.manage.sys.entity.PO.EmployeePO;

public class QueryCondition {
    public QueryWrapper<EmployeePO> queryEmployeeBy(String column,String roleName){
        QueryWrapper<EmployeePO> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(column,roleName);
        return queryWrapper;
    }


}


