package com.weisg.cloud.utils;

import java.io.Serializable;

/**
 * Description 这个类作用是什么
 * Author WEISANGENG
 * Date 2019/1/5
 **/
public class ResponseResult<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final String SUCCESS = "00000";

    public static final String FAIL = "99999";

    private String msg = "success";

    private String code = SUCCESS;

    private T data;

    public ResponseResult() {
        super();
    }

    public ResponseResult(T data) {
        super();
        this.data = data;
    }

    public ResponseResult(T data, String msg) {
        super();
        this.data = data;
        this.msg = msg;
    }

    public ResponseResult(Throwable e) {
        super();
        this.msg = e.getMessage();
        this.code = FAIL;
    }

    public ResponseResult(Exception e) {
        super();
        this.msg = e.getMessage();
        this.code = FAIL;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
