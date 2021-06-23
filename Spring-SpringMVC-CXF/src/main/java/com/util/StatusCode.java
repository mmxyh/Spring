package com.util;


/**
 * 状态码
 *
 */
public class StatusCode {
    //TODO**********************************************************公共部分**********************************************************

    //成功
    public static final int SUCCESS = 200;
    public static final String SUCCESS_MSG = "操作成功!";

    //失败
    public static final int FAIL = 301;
    public static final String FAIL_MSG = "操作失败!";



    //查询失败
    public static final int SELECT_FAIL = 202;
    public static final String SELECT_FAIL_MSG = "查询失败!";

    //添加失败
    public static final int INSERT_FAIL = 203;
    public static final String INSERT_FAIL_MSG = "新增失败!";

    //修改失败
    public static final int UPDATE_FAIL = 204;
    public static final String UPDATE_FAIL_MSG = "修改失败!";

    //删除失败
    public static final int DELETE_FAIL = 205;
    public static final String DELETE_FAIL_MSG = "删除失败!";

    //参数重复
    public static final int PARAM_REPEAT = 206;    //参数重复

    //参数为空
    public static final int PARAM_ISEMPTY = 207;    //参数为空

    //TODO**********************************************************Token**********************************************************

    //token认证失效
    public static final int TOKEN_INVALID = 300;
    public static final String TOKEN_INVALID_MSG = "对不起，您的登录已失效。请重新登录！"; //token失效

    //token参数缺失
    public static final int TOKEN_PARAM_ISEMPTY = 301;//token参数缺失

    //生成token失败
    public static final int BUILD_TOKEN_FAIL = 302;//生成token失败



}
