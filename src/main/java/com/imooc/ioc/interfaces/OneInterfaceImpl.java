package com.imooc.ioc.interfaces;

public class OneInterfaceImpl implements OneInterface{

    @Override
    public String hello(String word){
        return "Worf from interface \"OneInterface\":" + word;
    }
}
