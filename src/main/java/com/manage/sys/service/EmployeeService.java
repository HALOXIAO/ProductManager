package com.manage.sys.service;

        import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
        import com.manage.sys.dao.condition.UpdateCondition;
        import com.manage.sys.dao.wrapper.EmployeeWrapperInterface;
        import com.manage.sys.dao.wrapper.impl.EmployeeWrapper;
        import com.manage.sys.dao.wrapper.impl.UserWrapper;
        import com.manage.sys.entity.PO.EmployeePO;
        import com.manage.sys.entity.PO.UserPO;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.context.annotation.ComponentScan;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.security.core.userdetails.UserDetailsByNameServiceWrapper;
        import org.springframework.stereotype.Component;
        import org.springframework.stereotype.Service;

@Component
public class EmployeeService {


    @Autowired
    EmployeeWrapper employeeWrapper;
    @Autowired
    UserWrapper userWrapper;

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


    public boolean updateEmployeeNameForFounder(EmployeePO employeePO){

    }

    public boolean updateEmployeeNameForReviewer(EmployeePO employeePO){

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



}
