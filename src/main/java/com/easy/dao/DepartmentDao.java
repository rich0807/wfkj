package com.easy.dao;

import com.easy.bean.Department;
import com.easy.util.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DepartmentDao {

 Department getDepartmentById(int id);

 int getCount(String checktext);

 List<Department> getDepartments(@Param("checktext") String checktext,
                                 @Param("page") Page page);
}
