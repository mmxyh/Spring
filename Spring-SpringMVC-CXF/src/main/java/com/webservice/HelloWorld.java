package com.webservice;


import javax.jws.WebService;

/**
 * @Author: hmm
 * @Date: 2019/9/5 14:25
 */

@WebService
public interface HelloWorld {

     String sayHello( String username);
}
