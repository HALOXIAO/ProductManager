package com.manage.sys.service;

import com.manage.sys.manager.middledao.EmployeeBaseServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeBaseServiceInterface employeeBaseServiceInterface;



}
