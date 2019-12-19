package com.manage.sys.controller;


import com.manage.sys.entity.PO.EmployeePO;
import com.manage.sys.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/employee")
public class EmployeeController {


    @PostMapping("/{employee}")
    public String addEmployee(HttpServletRequest request, @PathVariable String employee,@RequestBody EmployeePO employeePO){

        return "";
    }



}
