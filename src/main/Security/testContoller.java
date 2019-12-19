package com.manage.sys.Security;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testContoller {

    @GetMapping("/index")
    public String test(){
        return "Hello World";
    }
}
