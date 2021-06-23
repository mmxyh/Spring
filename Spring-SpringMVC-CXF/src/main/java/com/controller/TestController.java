package com.controller;

import com.alibaba.fastjson.JSON;
import com.model.Student;
import com.util.FastJsonUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: hmm
 * @Date: 2019/9/12 11:11
 */
@Controller
public class TestController {
    /**
     * 测试JSON
     *
     * @return
     */
    @RequestMapping(value = "/testJson", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> testJson(String id) {
        Map<String, Object> map = new HashMap<>();
        Map<String, Object> data = new HashMap<>();
        data.put("id", id);
        map.put("result", 0);
        map.put("message", "成功 success");
        map.put("data", data);
        return map;
    }


    /**
     * 测试JSON
     *
     * @return
     */
    @RequestMapping(value = "/testJsonString", method = RequestMethod.GET)
    @ResponseBody
    public String testJsonString(String id) {
        Map<String, Object> map = new HashMap<>();
        Map<String, Object> data = new HashMap<>();
        data.put("id", id);
        data.put("code", null);
        map.put("result", 0);
        map.put("message", "成功 success");
        map.put("data", data);
        return FastJsonUtil.toJSONString(map);
    }

    //TODO==================================================================

    /**
     * 跳转到test.jsp
     *
     * @return
     */
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    private String add() {
        return "/test";
    }

    /**
     * RequestBody注解会自动将json串转换为java对象
     * ResponseBody会将java对象转为json对象
     *
     * @param student
     * @return 测试json, 请求json返回json
     */
    @RequestMapping("/requestJson")
    public @ResponseBody Student jsonTest(@RequestBody Student student) {
        return student;
    }

    /**
     * RequestBody注解会自动将json串转换为java对象
     * ResponseBody会将java对象转为json对象
     *
     * @param student 测试key/value返回json
     */
    @RequestMapping("/responseJson")
    public @ResponseBody Student responseJson(Student student) {
        return student;
    }


}
