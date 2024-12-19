package com.easy.util;

public class PageQuery {
    //start 开始位置
    //page 当前页
    //limit 每页显示的数量
    private int page=-1;
    private int limit=-1;

    public PageQuery() {
    }

    public PageQuery( int page, int limit) {
        this.page = page;
        this.limit = limit;
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
        return "Page{ page = " + page + ", limit = " + limit + "}";
    }
}
