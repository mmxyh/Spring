package com.imooc.beanannotation.jsr;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

//@Service
@Named
public class JsrService {
//    @Resource
    @Inject
    private JsrDAO jsrDAO;

    //    @Resource
//    @Inject
    public void setJsrDAO(@Named("jsrDAO") JsrDAO jsrDAO) {
        this.jsrDAO = jsrDAO;
    }

    @PostConstruct
    public void init() {
        System.out.println("JsrService init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("JsrService destroy");
    }

    public void save() {
        jsrDAO.save();
    }
}
