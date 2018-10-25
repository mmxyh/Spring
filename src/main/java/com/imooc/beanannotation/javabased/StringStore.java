package com.imooc.beanannotation.javabased;

public class StringStore implements Store<String> {
    public void init(){
        System.out.println("This is init.");
    }

    public void destory(){
        System.out.println("This is destory.");
    }
}
