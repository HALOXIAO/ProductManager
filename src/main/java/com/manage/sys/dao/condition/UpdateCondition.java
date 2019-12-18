package com.manage.sys.dao.condition;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.entity.PO.EmployeePO;

public class UpdateCondition {

    public UpdateWrapper<EmployeePO> updateEmployeeBy(String column, String value) {
        UpdateWrapper<EmployeePO> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq(column,value);
        return updateWrapper;
    }
}
