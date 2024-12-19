package com.easy.dao;

import com.easy.bean.Department;
import com.easy.bean.Employee;
import com.easy.util.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EmployeeDao {



 int getCount(String checktext);

 List<Employee> getEmployees(@Param("checktext") String checktext,
                                 @Param("page") Page page);

 //新增，修改，删除
 int addEmployee(Employee employee);
 int updateEmployee(Employee employee);
 int deleteEmployee(Employee employee);
}
