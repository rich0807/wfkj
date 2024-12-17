package com.easy.bean;

public class Department {
    private int id;
    private String name;
    private String code;
    private  String info;

    public Department() {
    }

    public Department(int id, String name, String code, String info) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.info = info;
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
     * @return info
     */
    public String getInfo() {
        return info;
    }

    /**
     * 设置
     * @param info
     */
    public void setInfo(String info) {
        this.info = info;
    }

    public String toString() {
        return "DepartmentDao{id = " + id + ", name = " + name + ", code = " + code + ", info = " + info + "}";
    }
}
