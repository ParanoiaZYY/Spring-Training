package com.wisdom.domain;

public class Result {
    private Integer returnCode;

    private String returnMsg;

    private Object returnData;

    public Result(Integer returnCode, String returnMsg) {
        this.returnCode = returnCode;
        this.returnMsg = returnMsg;
    }

    public Result(Integer returnCode, String returnMsg, Object returnData) {
        this.returnCode = returnCode;
        this.returnMsg = returnMsg;
        this.returnData = returnData;
    }

    public Integer getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(Integer returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public Object getReturnData() {
        return returnData;
    }

    public void setReturnData(Object returnData) {
        this.returnData = returnData;
    }
}
