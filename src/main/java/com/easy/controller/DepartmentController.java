package com.easy.controller;

import com.easy.bean.Department;
import com.easy.dao.DepartmentDao;
import com.easy.util.Page;
import com.easy.util.ZhangHongQianLayData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class DepartmentController {
    @Autowired
    DepartmentDao departmentDao;
    @GetMapping("getdepartmentbyid")
    public Department getDepartmentById(int id) {
   return departmentDao.getDepartmentById(id);
    }

    @GetMapping("department/list")
    public ZhangHongQianLayData getList(String checktext, Page page){
    int count=departmentDao.getCount(checktext);
    List<Department> data=departmentDao.getDepartments(checktext,page);
  ZhangHongQianLayData result=new ZhangHongQianLayData();
  result.setData(data);
  result.setCount(count);
  return result;
    }

    @PostMapping("/department/add")
    public int addDepartment(Department department) {
        return departmentDao.addDepartment(department);
    }
    @PostMapping("/department/edit")
    public int updateDepartment(Department department) {
        return departmentDao.updateDepartment(department);
    }
   @DeleteMapping("/department/delete")
    public int deleteDepartment(Department department) {
        return departmentDao.deleteDepartment(department);
    }


}
