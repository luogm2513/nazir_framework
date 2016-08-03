package com.nazir.controller.base;

/**
 * @author luogm
 */
public class AbstractPageParam {
    /**
     * 当前页
     */
    private Integer pageNo;

    /**
     * 分页大小
     */
    private Integer pageSize;

    public Integer getPageNo() {
        return pageNo == null ? 1 : pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize == null ? 20 : pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
