package com.manage.sys.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.manage.sys.dao.condition.QueryCondition;
import com.manage.sys.dao.condition.UpdateCondition;
import com.manage.sys.dao.wrapper.impl.EmployeeWrapper;
import com.manage.sys.dao.wrapper.impl.PurchaseOrderWrapper;
import com.manage.sys.dao.wrapper.impl.SalesWrapper;
import com.manage.sys.dao.wrapper.impl.UserWrapper;
import com.manage.sys.entity.PO.EmployeePO;
import com.manage.sys.entity.PO.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {


    @Autowired
    EmployeeWrapper employeeWrapper;

    @Autowired
    UserWrapper userWrapper;

    public EmployeePO searchEmployeeById(int id) {
        return employeeWrapper.searchEmployeeById(id);
    }

    public EmployeePO searchEmployeeByInternalName(String name) {
        QueryWrapper<EmployeePO> wrapper = new QueryCondition<EmployeePO>().queryConditionBy("internal_name", name);
        return employeeWrapper.searchEmployeeBySomeThing(wrapper);
    }

    public Boolean addEmployee(EmployeePO employeePO) {
        if (employeePO.getStatus() != null) {
            UserPO userPO = new UserPO();
            UpdateWrapper<UserPO> userUpdateWrapper = new UpdateCondition<UserPO>().updateConditionByEqOne("username", employeePO.getInternalName());
            userPO.setStatus(employeePO.getStatus());
            return userWrapper.updateUserByUsername(userPO, userUpdateWrapper);
        }


        return employeeWrapper.addEmployee(employeePO);
    }

    public Boolean deleteEmployee(String username) {
        EmployeePO employeePO = new EmployeePO();
        employeePO.setInternalName(username);
        UpdateWrapper<EmployeePO> wrapper = new UpdateCondition<EmployeePO>().updateConditionByEqOne("internal_name", username);
        return employeeWrapper.deleteEmployee(employeePO,wrapper);

    }

    public Boolean updateEmployee(EmployeePO employeePO) {
        return employeeWrapper.updateEmployee(employeePO);
    }
//
//


//    private Boolean updateEmployeeFounderForSales(EmployeePO employeePO) {
//            UpdateCondition<SalesPO> updateCondition = new UpdateCondition<>();
//            UpdateWrapper<SalesPO> wrapper = updateCondition.updateConditionByEqOne("founder_name", employeePO.getEmployeeName());
//            SalesPO salesPO = new SalesPO();
//            salesPO.setFounderName(employeePO.getEmployeeName());
//            return salesWrapper.updateSalesBySomeThing(salesPO,wrapper);
//    }
//
//    private Boolean updateEmployeeReviewForSales(EmployeePO employeePO) {
//            UpdateCondition<SalesPO> updateCondition = new UpdateCondition<>();
//            UpdateWrapper<SalesPO> wrapper = updateCondition.updateConditionByEqOne("review_name", employeePO.get);
//            SalesPO salesPO = new SalesPO();
//            salesPO.setCommodityName(employeePO.getEmployeeName());
//            return salesWrapper.updateSalesBySomeThing(salesPO,wrapper);
//    }
//
//    private Boolean updateEmployeeStatusForUser(EmployeePO employeePO) {
//        employeeWrapper.updateEmployee(employeePO);
//        boolean flag1 = employeeWrapper.updateEmployee(employeePO);
//        if (!("").equals(employeePO.getEmployeeName())) {
//            UpdateCondition<UserPO> updateCondition = new UpdateCondition<>();
//            UpdateWrapper<UserPO> wrapper = updateCondition.updateConditionByEqOne("employeeName", employeePO.getEmployeeName());
//            UserPO userPO = new UserPO();
//            return flag1;
//        }
//        return flag1;
//    }
//
//    private Boolean updateEmployeeFounderForPurchaseOrder(EmployeePO employeePO) {
//        employeeWrapper.updateEmployee(employeePO);
//        boolean flag1 = employeeWrapper.updateEmployee(employeePO);
//        if (!("").equals(employeePO.getEmployeeName())) {
//            UpdateCondition<PurchaseOrderPO> updateCondition = new UpdateCondition<>();
//            UpdateWrapper<PurchaseOrderPO> wrapper = updateCondition.updateConditionByEqOne("founderName", employeePO.getEmployeeName());
//            PurchaseOrderPO purchaseOrderPO = new PurchaseOrderPO();
//            purchaseOrderPO.setCommodityName(employeePO.getEmployeeName());
//            return flag1;
//        }
//        return flag1;
//    }
//
//    private Boolean updateEmployeeReviewForPurchaseOrder(EmployeePO employeePO) {
//        employeeWrapper.updateEmployee(employeePO);
//        boolean flag1 = employeeWrapper.updateEmployee(employeePO);
//        if (!("").equals(employeePO.getEmployeeName())) {
//            UpdateCondition<PurchaseOrderPO> updateCondition = new UpdateCondition<>();
//            UpdateWrapper<PurchaseOrderPO> wrapper = updateCondition.updateConditionByEqOne("reviewName", employeePO.getEmployeeName());
//            PurchaseOrderPO purchaseOrderPO = new PurchaseOrderPO();
//            purchaseOrderPO.setCommodityName(employeePO.getEmployeeName());
//            return flag1;
//        }
//        return flag1;
//    }

}
