package com.easy.controller;

import com.easy.bean.Department;
import com.easy.dao.DepartmentDao;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    private DepartmentDao departmentDao;
    public Department getDepartmentById(int id) {

    }
}
