package com.manage.sys.service;

        import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
        import com.manage.sys.dao.condition.UpdateCondition;
        import com.manage.sys.dao.wrapper.impl.EmployeeWrapper;
        import com.manage.sys.dao.wrapper.impl.SalesWrapper;
        import com.manage.sys.dao.wrapper.impl.UserWrapper;
        import com.manage.sys.entity.PO.EmployeePO;
        import com.manage.sys.entity.PO.PurchaseOrderPO;
        import com.manage.sys.entity.PO.UserPO;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Component;

@Component
public class EmployeeService {


    @Autowired
    EmployeeWrapper employeeWrapper;
    @Autowired
    UserWrapper userWrapper;
    @Autowired
    SalesWrapper salesWrapper;
    @Autowired
    PurchaseWrapper purchaseWrapper;

    public void searchEmployeeById(int id){
        employeeWrapper.searchEmployeeById(id);
    }

    public boolean addEmployee(EmployeePO employeePO){
        return employeeWrapper.addEmployee(employeePO);
    }

    public boolean updateEmployee(EmployeePO employeePO){
        employeeWrapper.updateEmployee(employeePO);
        boolean flag1=employeeWrapper.updateEmployee(employeePO);
        if(employeePO.getStatus()!=null){
            UpdateCondition<Integer,UserPO> updateCondition = new UpdateCondition<>();
            UpdateWrapper<UserPO> wrapper = updateCondition.updateEmployeeBy("status",employeePO.getStatus());
            boolean flag2 =true;
            return flag1 && flag2;
        }
        return flag1;
    }


    public boolean updateEmployeeFounderForSales(EmployeePO employeePO){
        employeeWrapper.updateEmployee(employeePO);
        boolean flag1 = employeeWrapper.updateEmployee(employeePO);
        if (!("").equals(employeePO.getEmployeeName())) {
            UpdateCondition<String, SalesPO> updateCondition=new UpdateCondition<>();
            UpdateWrapper<SalesPO> wrapper = updateCondition.updateEmployeeBy("founderName",employeePO.getEmployeeName());
            SalesPO salesPO=new SalesPO();
            salesPO.setCommodityName(employeePO.getEmployeeName());
            boolean flag2 = salesWrapper.updateSalesBySomeThing(salesPO, wrapper);
            return flag1 && flag2;
        }
        return flag1;
    }

    public boolean updateEmployeeReviewForSales(EmployeePO employeePO){
        employeeWrapper.updateEmployee(employeePO);
        boolean flag1 = employeeWrapper.updateEmployee(employeePO);
        if (!("").equals(employeePO.getEmployeeName())) {
            UpdateCondition<String, SalesPO> updateCondition=new UpdateCondition<>();
            UpdateWrapper<SalesPO> wrapper = updateCondition.updateEmployeeBy("reviewName",employeePO.getEmployeeName());
            SalesPO salesPO=new SalesPO();
            salesPO.setCommodityName(employeePO.getEmployeeName());
            boolean flag2 = salesWrapper.updateSalesBySomeThing(salesPO, wrapper);
            return flag1 && flag2;
        }
        return flag1;
    }

    public boolean updateEmployeeStatusForUser(EmployeePO employeePO){
        employeeWrapper.updateEmployee(employeePO);
        boolean flag1 = employeeWrapper.updateEmployee(employeePO);
        if (!("").equals(employeePO.getEmployeeName())) {
            UpdateCondition<String,UserPO> updateCondition=new UpdateCondition<>();
            UpdateWrapper<UserPO> wrapper = updateCondition.updateEmployeeBy("employeeName",employeePO.getEmployeeName());
            UserPO userPO=new UserPO();
            userPO.setCommodityName(employeePO.getEmployeeName());
            boolean flag2 = userWrapper.updateUserBySomeThing(userPO, wrapper);
            return flag1 && flag2;
        }
        return flag1;
    }

    public boolean updateEmployeeFounderForPurchaseOrder(EmployeePO employeePO){
        employeeWrapper.updateEmployee(employeePO);
        boolean flag1 = employeeWrapper.updateEmployee(employeePO);
        if (!("").equals(employeePO.getEmployeeName())) {
            UpdateCondition<String, PurchaseOrderPO> updateCondition=new UpdateCondition<>();
            UpdateWrapper<PurchaseOrderPO> wrapper = updateCondition.updateEmployeeBy("founderName",employeePO.getEmployeeName());
       PurchaseOrderPO purchaseOrderPO=new PurchaseOrderPO();
            purchaseOrderPO.setCommodityName(employeePO.getEmployeeName());
            boolean flag2 = purchaseWrapper.updatePurchaseOrderBySomeThing(purchaseOrderPO, wrapper);
            return flag1 && flag2;
        }
        return flag1;
    }

    public boolean updateEmployeeReviewForPurchaseOrder(EmployeePO employeePO){
        employeeWrapper.updateEmployee(employeePO);
        boolean flag1 = employeeWrapper.updateEmployee(employeePO);
        if (!("").equals(employeePO.getEmployeeName())) {
            UpdateCondition<String, PurchaseOrderPO> updateCondition=new UpdateCondition<>();
            UpdateWrapper<PurchaseOrderPO> wrapper = updateCondition.updateEmployeeBy("reviewName",employeePO.getEmployeeName());
            PurchaseOrderPO purchaseOrderPO=new PurchaseOrderPO();
            purchaseOrderPO.setCommodityName(employeePO.getEmployeeName());
            boolean flag2 = purchaseWrapper.updatePurchaseOrderBySomeThing(purchaseOrderPO, wrapper);
            return flag1 && flag2;
        }
        return flag1;
    }

}
