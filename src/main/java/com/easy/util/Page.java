package com.easy.util;

public class Page {
    //start 开始位置
    //page 当前页
    //limit 每页显示的数量
    private int start=-1;
    private int page=-1;
    private int limit=-1;

    public Page() {
    }

    public Page(int start, int page, int limit) {
        this.start = start;
        this.page = page;
        this.limit = limit;
    }

    /**
     * 获取
     * @return start
     */
    public int getStart() {
     if(start!=-1&&limit!=-1){
         start=(page-1)*limit;
     }
        return start;
    }

    /**
     * 设置
     * @param start
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * 获取
     * @return page
     */
    public int getPage() {
        return page;
    }

    /**
     * 设置
     * @param page
     */
    public void setPage(int page) {
        this.page = page;
    }

    /**
     * 获取
     * @return limit
     */
    public int getLimit() {
        return limit;
    }

    /**
     * 设置
     * @param limit
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String toString() {
        return "Page{start = " + start + ", page = " + page + ", limit = " + limit + "}";
    }
}
