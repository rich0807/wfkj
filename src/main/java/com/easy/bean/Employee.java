package com.easy.bean;

import java.math.BigDecimal;

/**
 * @Author Zhang_HongQian
 * @Date 2024-12-19-上午8:14
 * @Version 1.0 （版本号）
 * @Description:
 */
public class Employee {
    private int id;
    private String name;
    private String code;
    private String username;
    private  String userpass;
    private String sex;
    private String tel;
    private BigDecimal salary;
    private int departmentid;

    private Department department;

    public Employee() {
    }

    public Employee(int id, String name, String code, String username, String userpass, String sex, String tel, BigDecimal salary, int departmentid, Department department) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.username = username;
        this.userpass = userpass;
        this.sex = sex;
        this.tel = tel;
        this.salary = salary;
        this.departmentid = departmentid;
        this.department = department;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return code
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return userpass
     */
    public String getUserpass() {
        return userpass;
    }

    /**
     * 设置
     * @param userpass
     */
    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    /**
     * 获取
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取
     * @return tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * 获取
     * @return salary
     */
    public BigDecimal getSalary() {
        return salary;
    }

    /**
     * 设置
     * @param salary
     */
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    /**
     * 获取
     * @return departmentid
     */
    public int getDepartmentid() {
        return departmentid;
    }

    /**
     * 设置
     * @param departmentid
     */
    public void setDepartmentid(int departmentid) {
        this.departmentid = departmentid;
    }

    /**
     * 获取
     * @return department
     */
    public Department getDepartment() {
        return department;
    }

    /**
     * 设置
     * @param department
     */
    public void setDepartment(Department department) {
        this.department = department;
    }

    public String toString() {
        return "Employee{id = " + id + ", name = " + name + ", code = " + code + ", username = " + username + ", userpass = " + userpass + ", sex = " + sex + ", tel = " + tel + ", salary = " + salary + ", departmentid = " + departmentid + ", department = " + department + "}";
    }
}
