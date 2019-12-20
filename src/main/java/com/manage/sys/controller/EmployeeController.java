package com.manage.sys.controller;


import com.manage.sys.entity.PO.EmployeePO;
import com.manage.sys.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping()
    public String addEmployee(HttpServletRequest request, @Valid @RequestBody EmployeePO employee) {
        employeeService.addEmployee(employee);
        return "";
    }

    @GetMapping("{employee}")
    public EmployeePO getEmployee(@PathVariable String username) {
        return employeeService.searchEmployeeByInternalName(username);
    }

    @PutMapping()
    public String updateEmployee() {
        return "";
    }

    @DeleteMapping()
    public String deleteEmployee() {
        return "";
    }

}
