package com.timberware.conroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @GetMapping("/departments")
    public String getDepartments(){

        return "departments";
    }

}
