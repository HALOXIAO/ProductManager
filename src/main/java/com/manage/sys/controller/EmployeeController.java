package com.manage.sys.controller;


import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @PostMapping("/{employee}")
    public String addEmployee(HttpServletRequest request, @PathVariable String employee){
        request.
        return "";
    }



}
