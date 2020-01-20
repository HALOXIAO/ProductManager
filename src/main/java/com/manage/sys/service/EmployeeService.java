package com.manage.sys.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.dao.EmployeeMapper;
import com.manage.sys.dao.EmployeeRoleMapper;
import com.manage.sys.dao.UserMapper;
import com.manage.sys.entity.po.EmployeePO;
import com.manage.sys.entity.po.EmployeeRolePO;
import com.manage.sys.entity.po.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLDataException;
import java.util.List;

@Service
public class EmployeeService {


    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    UserMapper userMapper;

    @Autowired
    EmployeeRoleMapper employeeRoleMapper;


    public List<EmployeePO> getEmployeeWithPage(Long sum, Long page) {
        QueryWrapper<EmployeePO> wrapper = new QueryWrapper<>();
        return employeeMapper.searchEmployeeWithPage(sum, page, wrapper);
    }


    public EmployeePO searchEmployeeById(int id) {
        return employeeMapper.searchEmployeeById(id);
    }

    public EmployeePO searchEmployeeByInternalName(String name) {
        QueryWrapper<EmployeePO> wrapper = new QueryWrapper<EmployeePO>().eq("internal_name", name);
        return employeeMapper.searchEmployeeBySomeThing(wrapper);
    }

    @Transactional
    public Boolean addEmployee(EmployeePO employee, Integer roleId) throws SQLDataException {
        if (!employeeMapper.addEmployee(employee)) {
            throw new SQLDataException("addEmployee Error");
        }
        Long employeeId = employee.getEmployeeId();
        EmployeeRolePO employeeRolePo = new EmployeeRolePO();
        employeeRolePo.setEmployeeId(employeeId);
        employeeRolePo.setRoleId(roleId);
        if (!employeeRoleMapper.connectionEmployeeAndRole(employeeRolePo)) {
            throw new SQLDataException("Employee_Role Create Error");
        }
        return Boolean.TRUE;
    }


    public Boolean deleteEmployee(String username) {
        EmployeePO employee = new EmployeePO();
        employee.setInternalName(username);
        UpdateWrapper<EmployeePO> wrapper = new UpdateWrapper<EmployeePO>().eq("internal_name", username);
        return employeeMapper.deleteEmployee(employee, wrapper);

    }

    @Transactional()
    public Boolean updateEmployee(EmployeePO employee, Integer status) {
        if (status != null) {
            UserPO user = new UserPO();
            userMapper.updateUserByUsername(user)
        }
        return employeeMapper.updateEmployee(employee);
    }
//
//


//    private Boolean updateEmployeeFounderForSales(EmployeePO employee) {
//            UpdateCondition<SalesPO> updateCondition = new UpdateCondition<>();
//            UpdateMapper<SalesPO> wrapper = updateCondition.updateConditionByEqOne("founder_name", employee.getEmployeeName());
//            SalesPO salesPO = new SalesPO();
//            salesPO.setFounderName(employee.getEmployeeName());
//            return salesMapper.updateSalesBySomeThing(salesPO,wrapper);
//    }
//
//    private Boolean updateEmployeeReviewForSales(EmployeePO employee) {
//            UpdateCondition<SalesPO> updateCondition = new UpdateCondition<>();
//            UpdateMapper<SalesPO> wrapper = updateCondition.updateConditionByEqOne("review_name", employee.get);
//            SalesPO salesPO = new SalesPO();
//            salesPO.setCommodityName(employee.getEmployeeName());
//            return salesMapper.updateSalesBySomeThing(salesPO,wrapper);
//    }
//
//    private Boolean updateEmployeeStatusForUser(EmployeePO employee) {
//        employeeMapper.updateEmployee(employee);
//        boolean flag1 = employeeMapper.updateEmployee(employee);
//        if (!("").equals(employee.getEmployeeName())) {
//            UpdateCondition<UserPO> updateCondition = new UpdateCondition<>();
//            UpdateMapper<UserPO> wrapper = updateCondition.updateConditionByEqOne("employeeName", employee.getEmployeeName());
//            UserPO userPO = new UserPO();
//            return flag1;
//        }
//        return flag1;
//    }
//
//    private Boolean updateEmployeeFounderForPurchaseOrder(EmployeePO employee) {
//        employeeMapper.updateEmployee(employee);
//        boolean flag1 = employeeMapper.updateEmployee(employee);
//        if (!("").equals(employee.getEmployeeName())) {
//            UpdateCondition<PurchaseOrderPO> updateCondition = new UpdateCondition<>();
//            UpdateMapper<PurchaseOrderPO> wrapper = updateCondition.updateConditionByEqOne("founderName", employee.getEmployeeName());
//            PurchaseOrderPO purchaseOrderPO = new PurchaseOrderPO();
//            purchaseOrderPO.setCommodityName(employee.getEmployeeName());
//            return flag1;
//        }
//        return flag1;
//    }
//
//    private Boolean updateEmployeeReviewForPurchaseOrder(EmployeePO employee) {
//        employeeMapper.updateEmployee(employee);
//        boolean flag1 = employeeMapper.updateEmployee(employee);
//        if (!("").equals(employee.getEmployeeName())) {
//            UpdateCondition<PurchaseOrderPO> updateCondition = new UpdateCondition<>();
//            UpdateMapper<PurchaseOrderPO> wrapper = updateCondition.updateConditionByEqOne("reviewName", employee.getEmployeeName());
//            PurchaseOrderPO purchaseOrderPO = new PurchaseOrderPO();
//            purchaseOrderPO.setCommodityName(employee.getEmployeeName());
//            return flag1;
//        }
//        return flag1;
//    }

}
