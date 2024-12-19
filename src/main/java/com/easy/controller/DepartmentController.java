package com.easy.controller;

import com.easy.bean.Department;
import com.easy.dao.DepartmentDao;
import com.easy.util.PageQuery;
import com.easy.util.ZhangHongQianLayData;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class DepartmentController {
    @Autowired
    DepartmentDao departmentDao;

    /**
    * @Description: getdepartmentbyid
    * @Param: [id]
    * @return: com.easy.bean.Department
    * @Author: Zhang_HongQian
    * @Date: 2024/12/18
    */
    @GetMapping("getdepartmentbyid")
    public Department getDepartmentById(int id) {
   return departmentDao.getDepartmentById(id);
    }



    /**
    * @Description: list
    * @Param: [checktext, page]
    * @return: com.easy.util.ZhangHongQianLayData
    * @Author: Zhang_HongQian
    * @Date: 2024/12/18
    */
    @GetMapping("department/list")
    public ZhangHongQianLayData getList(String checktext, PageQuery page){
        PageHelper.startPage(page.getPage(),page.getLimit());
    Page<Department> data=departmentDao.getDepartments(checktext);
  ZhangHongQianLayData result=new ZhangHongQianLayData();
  result.setData(data.getResult());
  result.setCount(data.getTotal());
  return result;
    }

    /**
    * @Description: addDepartment
    * @Param: [department]
    * @return: int
    * @Author: Zhang_HongQian
    * @Date: 2024/12/18
    */
    @PostMapping("/department/add")
    public int addDepartment(Department department) {
        return departmentDao.addDepartment(department);
    }

    /**
    * @Description: updateDepartment
    * @Param: [department]
    * @return: int
    * @Author: Zhang_HongQian
    * @Date: 2024/12/18
    */
    @PostMapping("/department/edit")
    public int updateDepartment(Department department) {
        return departmentDao.updateDepartment(department);
    }

    /**
    * @Description: deleteDepartment
    * @Param: [department]
    * @return: int
    * @Author: Zhang_HongQian
    * @Date: 2024/12/18
    */
   @DeleteMapping("/department/delete")
    public int deleteDepartment(Department department) {
        return departmentDao.deleteDepartment(department);
    }
    /** 
    * @Description: echartsA
    * @Param: []
    * @return: java.util.List
    * @Author: Zhang_HongQian
    * @Date: 2024/12/19
    */
    @GetMapping("echartsa")
    public List echartsA(){
       return departmentDao.echartsA();
    }


}
