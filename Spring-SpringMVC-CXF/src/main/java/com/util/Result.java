package com.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.ValueFilter;

/**
 * JSON结果集
 */
public class Result {


    private int code;       //响应业务状态：状态码
    private String msg;     //响应消息：描述
    private Object data;    // 响应中的数据：数据


    public Result() {
    }

    public Result(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    //返回规定格式的JSON字符串
    public String toJSONString() {

        JSONObject res = new JSONObject();
        res.put("code", this.code);
        res.put("data", this.data);
        res.put("msg", this.msg);

        return FastJsonUtil.toJSONString(res);
    }


    public static Result success() {

        return new Result(StatusCode.SUCCESS, StatusCode.SUCCESS_MSG, null);
    }

    public static Result success(Object data) {

        return new Result(StatusCode.SUCCESS, StatusCode.SUCCESS_MSG, data);
    }

    public static Result fail() {
        return new Result(StatusCode.FAIL, StatusCode.FAIL_MSG, null);
    }

    public static Result fail(String msg) {
        return new Result(StatusCode.FAIL, msg,null);
    }

    public static Result fail(int code,String msg) {
        return new Result(code, msg, null);
    }




}
