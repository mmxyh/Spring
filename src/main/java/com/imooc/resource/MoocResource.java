package com.imooc.resource;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

import java.io.IOException;


public class MoocResource implements ApplicationContextAware{

    private ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
this.applicationContext = applicationContext;
    }

    public void resource() throws IOException {
//        Resource resource = applicationContext.getResource("classpath:file.txt");
//      Resource resource = applicationContext.getResource("file:E:\\IDEA\\Other\\Spring\\src\\main\\resources\\file.txt");
//        Resource resource = applicationContext.getResource("url:https://docs.spring.io/spring/docs/4.0.5.RELEASE/spring-framework-reference/htmlsingle/");//网址路径
        Resource resource = applicationContext.getResource("file.txt");//网址路径

        System.out.println(resource.getFilename());
        System.out.println(resource.contentLength());
    }
}
