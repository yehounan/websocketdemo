package com.yezi.luframe.vo;

import lombok.Data;

/**
 * @author yezi
 * @date 2019/3/4 10:59
 */
@Data
public class JsonResult<T> {

    /**
     * 响应码
     */
    private Integer code;

    /**
     * 响应信息
     */
    private String message;

    /**
     * 响应数据
     */
    private T data;

    /**
     * 接口执行时间
     */
    private Long cost;

    public JsonResult() {
    }

    public JsonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public JsonResult<T> OK() {
        this.code = 0;
        this.message = "success";
        this.data = null;
        return this;
    }

    public JsonResult<T> OK(T t) {
        this.code = 0;
        this.message = "success";
        this.data = t;
        return this;
    }

    public JsonResult<T> isNotLogin() {
        this.code = 1;
        this.message = "没有登录信息";
        this.data = null;
        return this;
    }

    public JsonResult<T> tokenIsExpired() {
        this.code = 2;
        this.message = "token已过期";
        this.data = null;
        return this;
    }

    @Override
    public String toString() {
        return "JsonResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                ", cost=" + cost +
                '}';
    }
}
