package com.easy.dao;

import com.easy.bean.Department;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface DepartmentDao {

 Department getDepartmentById(int id);

 int getCount(String checktext);

 Page<Department> getDepartments(@Param("checktext") String checktext);
 //新增，修改，删除
 int addDepartment(Department department);

 int updateDepartment(Department department);

 int deleteDepartment(Department department);

 List<HashMap> echartsA();
}
