package com.easy.util;

import java.util.List;
//TODO name set ZhangHongQianLayData
public class ZhangHongQianLayData<T> {
    private int code=0;
    private String msg="";
    private Long count;
    private List<T> data;

    public ZhangHongQianLayData() {
    }

    public ZhangHongQianLayData(int code, String msg, long count, List data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    /**
     * 获取
     * @return code
     */
    public int getCode() {
        return code;
    }

    /**
     * 设置
     * @param code
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * 获取
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 设置
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 获取
     * @return count
     */
    public Long getCount() {
        return count;
    }

    /**
     * 设置
     * @param count
     */
    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * 获取
     * @return data
     */
    public List getData() {
        return data;
    }

    /**
     * 设置
     * @param data
     */
    public void setData(List data) {
        this.data = data;
    }

    public String toString() {
        return "LayData{code = " + code + ", msg = " + msg + ", count = " + count + ", data = " + data + "}";
    }
}
