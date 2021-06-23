package com.imooc.aop.api;

public class BizlogicImpl implements BigLogic{
    @Override
    public String save() {
        System.out.println("BizlogicImpl : BizlogicImpl save. ");
        return "BizlogicImpl save";
    }
}
