package com.manage.sys.dao.wrapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.entity.po.EmployeePO;

import java.util.List;

public interface EmployeeWrapperInterface {

    Boolean addEmployee(EmployeePO employee);

    EmployeePO searchEmployeeById(long id);

    Boolean updateEmployee(EmployeePO employee);

    EmployeePO searchEmployeeBySomeThing(QueryWrapper<EmployeePO> queryWrapper);

    Boolean updateEmployeeBySomeThing(EmployeePO employee, UpdateWrapper<EmployeePO> updateWrapper);

    public Boolean deleteEmployee(EmployeePO employee, UpdateWrapper<EmployeePO> updateWrapper);

    public List<EmployeePO> searchEmployeeWithPage(Long sum, Long page, QueryWrapper<EmployeePO> wrapper);
}
