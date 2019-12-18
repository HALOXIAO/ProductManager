package com.manage.sys.dao.condition;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.entity.PO.EmployeePO;

public class UpdateCondition<T,U> {

    public UpdateWrapper<U> updateEmployeeBy(String column, T value) {
        UpdateWrapper<U> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq(column,value);
        return updateWrapper;
    }
}
