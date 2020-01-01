package com.manage.sys.dao.wrapper.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.manage.sys.dao.EmployeeMapper;
import com.manage.sys.entity.po.EmployeePO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.manage.sys.config.status.EMPLOYEE_STATUS_CODE.EMPLOYEE_STATUS_CODE_QUIT;

@Component
public class EmployeeWrapper implements com.manage.sys.dao.wrapper.EmployeeWrapperInterface {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public Boolean addEmployee(EmployeePO employee) {
        return null;
    }

    @Override
    public EmployeePO searchEmployeeById(long id) {
        return employeeMapper.selectById(id);
    }

    @Override
    public Boolean updateEmployee(EmployeePO employee) {
        return employeeMapper.update(employee, null) == 1;
    }

    @Override
    public List<EmployeePO> searchEmployeeWithPage(Long sum, Long page, QueryWrapper<EmployeePO> wrapper) {
        IPage<EmployeePO> iPage = new Page<EmployeePO>().setPages(page).setSize(sum);
        List<EmployeePO> list = employeeMapper.selectPage(iPage, wrapper).getRecords();
        return list;
    }

    @Override
    public EmployeePO searchEmployeeBySomeThing(QueryWrapper<EmployeePO> queryWrapper) {
        return employeeMapper.selectOne(queryWrapper);
    }

    @Override
    public Boolean updateEmployeeBySomeThing(EmployeePO entity, UpdateWrapper<EmployeePO> updateWrapper) {
        return employeeMapper.update(entity, updateWrapper) == 1;
    }

    @Override
    public Boolean deleteEmployee(EmployeePO employee, UpdateWrapper<EmployeePO> updateWrapper) {
        employee.setStatus(EMPLOYEE_STATUS_CODE_QUIT.ordinal());
        return employeeMapper.update(employee, updateWrapper) == 1;
    }
}
