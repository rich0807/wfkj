package com.easy.controller;

import com.easy.bean.Department;
import com.easy.bean.Employee;
import com.easy.dao.DepartmentDao;
import com.easy.dao.EmployeeDao;
import com.easy.util.Page;
import com.easy.util.ZhangHongQianLayData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class EmployeeController {
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    private DepartmentDao departmentDao;

    /**
    * @Description: getList
    * @Param: [checktext, page]
    * @return: com.easy.util.ZhangHongQianLayData
    * @Author: Zhang_HongQian
    * @Date: 2024/12/19
    */
    @GetMapping("employee/list")
    public ZhangHongQianLayData getList(String checktext, Page page){
    int count=employeeDao.getCount(checktext);
    List<Employee> data=employeeDao.getEmployees(checktext,page);
    // List<Employee> data存储的是员工表中的信息，对象中还没有该员工部门的信息
        //需要动手查询设置进入每一个对象
        for(Employee e:data){
            int departmentId=e.getDepartmentid();
            Department department=departmentDao.getDepartmentById(departmentId);
            e.setDepartment(department);
        }
  ZhangHongQianLayData result=new ZhangHongQianLayData();
  result.setData(data);
  result.setCount(count);
  return result;
    }



/**
* @Description: addEmployee
* @Param: [employee]
* @return: int
* @Author: Zhang_HongQian
* @Date: 2024/12/19
*/
    @PostMapping("/employee/add")
    public int addEmployee(Employee employee) {
        return employeeDao.addEmployee(employee);
    }



/**
* @Description: updateEmployee
* @Param: [employee]
* @return: int
* @Author: Zhang_HongQian
* @Date: 2024/12/19
*/
    @PostMapping("/employee/edit")
    public int updateEmployee(Employee employee) {
        return employeeDao.updateEmployee(employee);
    }



/** 
* @Description: deleteEmployee
* @Param: [employee]
* @return: int
* @Author: Zhang_HongQian
* @Date: 2024/12/19
*/
   @DeleteMapping("/employee/delete")
    public int deleteEmployee(Employee employee) {
        return employeeDao.deleteEmployee(employee);
    }
}
