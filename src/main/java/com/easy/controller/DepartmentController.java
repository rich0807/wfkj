package com.easy.controller;

import com.easy.bean.Department;
import com.easy.dao.DepartmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DepartmentController {
    @Autowired
    DepartmentDao departmentDao;
    @GetMapping("getdepartmentbyid")
    public Department getDepartmentById(int id) {
   return departmentDao.getDepartmentById(id);
    }
}
