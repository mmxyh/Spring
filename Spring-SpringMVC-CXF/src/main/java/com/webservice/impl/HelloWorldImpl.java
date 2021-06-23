package com.webservice.impl;

import com.webservice.HelloWorld;


import javax.jws.WebService;

/**
 * @Author: hmm
 * @Date: 2019/9/5 14:25
 */
@WebService(endpointInterface = "com.webservice.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
    public String sayHello(String username) {
        System.out.println("sayHello() is called");
        return username +" helloWorld";
    }
}
