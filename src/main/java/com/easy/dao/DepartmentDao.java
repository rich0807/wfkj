package com.easy.dao;

import com.easy.bean.Department;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepartmentDao {

 Department getDepartmentById(int id);
}
