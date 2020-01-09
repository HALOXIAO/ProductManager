package com.manage.sys.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.dao.wrapper.impl.EmployeeRoleWrapper;
import com.manage.sys.dao.wrapper.impl.EmployeeWrapper;
import com.manage.sys.dao.wrapper.impl.UserWrapper;
import com.manage.sys.entity.po.EmployeePO;
import com.manage.sys.entity.po.EmployeeRolePO;
import com.manage.sys.entity.po.UserPO;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLData;
import java.sql.SQLDataException;
import java.util.List;

@Service
public class EmployeeService {


    @Autowired
    EmployeeWrapper employeeWrapper;

    @Autowired
    UserWrapper userWrapper;

    @Autowired
    EmployeeRoleWrapper employeeRoleWrapper;


    public List<EmployeePO> getEmployeeWithPage(Long sum, Long page) {
        QueryWrapper<EmployeePO> wrapper = new QueryWrapper<>();
        return employeeWrapper.searchEmployeeWithPage(sum, page, wrapper);
    }


    public EmployeePO searchEmployeeById(int id) {
        return employeeWrapper.searchEmployeeById(id);
    }

    public EmployeePO searchEmployeeByInternalName(String name) {
        QueryWrapper<EmployeePO> wrapper = new QueryWrapper<EmployeePO>().eq("internal_name", name);
        return employeeWrapper.searchEmployeeBySomeThing(wrapper);
    }

    @Transactional
    public Boolean addEmployee(EmployeePO employee, Integer roleId) throws SQLDataException {
        if (!employeeWrapper.addEmployee(employee)) {
            throw new SQLDataException("addEmployee Error");
        }
        Long employeeId = employee.getEmployeeId();
        EmployeeRolePO employeeRolePo = new EmployeeRolePO();
        employeeRolePo.setEmployeeId(employeeId);
        employeeRolePo.setRoleId(roleId);
        if (!employeeRoleWrapper.connectionEmployeeAndRole(employeeRolePo)) {
            throw new SQLDataException("Employee_Role Create Error");
        }
        return Boolean.TRUE;
    }


    public Boolean deleteEmployee(String username) {
        EmployeePO employee = new EmployeePO();
        employee.setInternalName(username);
        UpdateWrapper<EmployeePO> wrapper = new UpdateWrapper<EmployeePO>().eq("internal_name", username);
        return employeeWrapper.deleteEmployee(employee, wrapper);

    }

    @Transactional()
    public Boolean updateEmployee(EmployeePO employee, Integer status) {
        if (status != null) {
            UserPO user = new UserPO();
            userWrapper.updateUserByUsername(user)
        }
        return employeeWrapper.updateEmployee(employee);
    }
//
//


//    private Boolean updateEmployeeFounderForSales(EmployeePO employee) {
//            UpdateCondition<SalesPO> updateCondition = new UpdateCondition<>();
//            UpdateWrapper<SalesPO> wrapper = updateCondition.updateConditionByEqOne("founder_name", employee.getEmployeeName());
//            SalesPO salesPO = new SalesPO();
//            salesPO.setFounderName(employee.getEmployeeName());
//            return salesWrapper.updateSalesBySomeThing(salesPO,wrapper);
//    }
//
//    private Boolean updateEmployeeReviewForSales(EmployeePO employee) {
//            UpdateCondition<SalesPO> updateCondition = new UpdateCondition<>();
//            UpdateWrapper<SalesPO> wrapper = updateCondition.updateConditionByEqOne("review_name", employee.get);
//            SalesPO salesPO = new SalesPO();
//            salesPO.setCommodityName(employee.getEmployeeName());
//            return salesWrapper.updateSalesBySomeThing(salesPO,wrapper);
//    }
//
//    private Boolean updateEmployeeStatusForUser(EmployeePO employee) {
//        employeeWrapper.updateEmployee(employee);
//        boolean flag1 = employeeWrapper.updateEmployee(employee);
//        if (!("").equals(employee.getEmployeeName())) {
//            UpdateCondition<UserPO> updateCondition = new UpdateCondition<>();
//            UpdateWrapper<UserPO> wrapper = updateCondition.updateConditionByEqOne("employeeName", employee.getEmployeeName());
//            UserPO userPO = new UserPO();
//            return flag1;
//        }
//        return flag1;
//    }
//
//    private Boolean updateEmployeeFounderForPurchaseOrder(EmployeePO employee) {
//        employeeWrapper.updateEmployee(employee);
//        boolean flag1 = employeeWrapper.updateEmployee(employee);
//        if (!("").equals(employee.getEmployeeName())) {
//            UpdateCondition<PurchaseOrderPO> updateCondition = new UpdateCondition<>();
//            UpdateWrapper<PurchaseOrderPO> wrapper = updateCondition.updateConditionByEqOne("founderName", employee.getEmployeeName());
//            PurchaseOrderPO purchaseOrderPO = new PurchaseOrderPO();
//            purchaseOrderPO.setCommodityName(employee.getEmployeeName());
//            return flag1;
//        }
//        return flag1;
//    }
//
//    private Boolean updateEmployeeReviewForPurchaseOrder(EmployeePO employee) {
//        employeeWrapper.updateEmployee(employee);
//        boolean flag1 = employeeWrapper.updateEmployee(employee);
//        if (!("").equals(employee.getEmployeeName())) {
//            UpdateCondition<PurchaseOrderPO> updateCondition = new UpdateCondition<>();
//            UpdateWrapper<PurchaseOrderPO> wrapper = updateCondition.updateConditionByEqOne("reviewName", employee.getEmployeeName());
//            PurchaseOrderPO purchaseOrderPO = new PurchaseOrderPO();
//            purchaseOrderPO.setCommodityName(employee.getEmployeeName());
//            return flag1;
//        }
//        return flag1;
//    }

}
