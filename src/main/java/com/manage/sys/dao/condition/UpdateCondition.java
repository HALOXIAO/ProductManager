package com.manage.sys.dao.condition;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.entity.PO.EmployeePO;

public class UpdateCondition<U> {

    public UpdateWrapper<U> updateConditionByEqOne(String column, String value) {
        UpdateWrapper<U> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq(column,value);
        return updateWrapper;
    }
    public UpdateWrapper<U> updateConditionByEqOne(String column,Integer value){
        UpdateWrapper<U> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq(column,value);
        return updateWrapper;
    }


}
