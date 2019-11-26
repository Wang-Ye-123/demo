package com.itrip.beans.dto;

/**
 * 数据传输对象
 *
 * @param <T>
 */
public class Dto<T> {
    private String success;//
    private String errorCode;//错误码
    private String msg;//消息
    private T data;//封装的数据

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
