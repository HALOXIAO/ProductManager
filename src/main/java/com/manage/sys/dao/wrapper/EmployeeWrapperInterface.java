package com.manage.sys.dao.wrapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.entity.PO.EmployeePO;

public interface EmployeeWrapperInterface {

    Boolean addEmployee(EmployeePO employee);

    EmployeePO searchEmployeeById(long id);

    Boolean updateEmployee(EmployeePO employee);

    EmployeePO searchEmployeeBySomeThing(QueryWrapper<EmployeePO> queryWrapper);

    Boolean updateEmployeeBySomeThing(UpdateWrapper<EmployeePO> queryWrapper);
    public Boolean deleteEmployee(EmployeePO employee);
}
