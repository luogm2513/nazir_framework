package com.nazir.controller.base;

/**
 * @author luogm
 */

public class ErrorModel extends AbstractFlagModel {
    /**
     * 错误信息
     */
    private String errorInfo = "";

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

}
