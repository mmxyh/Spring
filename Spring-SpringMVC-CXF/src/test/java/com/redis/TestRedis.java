package com.redis;

import com.util.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext-redis.xml"})
public class TestRedis {


    @Autowired
    private RedisUtil redisUtil;


    @Test
    public void test2()  {
        redisUtil.set("admin1","admin1");
        redisUtil.set("admin2","admin2");
        redisUtil.set("test1","test1");
        String name= (String) redisUtil.get("test1");
        System.out.println(name);

    }


    @Test
    public void de()  {

//        redisUtil.remove("admin");
//        redisUtil.remove("name","name2");

/*
        ArrayList list=new ArrayList();
        list.add("admin1");
        list.add("admin2");
        //失败
        redisUtil.remove(list.toString());*/

/*        //失败
        redisUtil.remove("admin1,admin2");*/
    }


/*    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @Test
    public void test()  {
        redisTemplate.opsForValue().set("admin2","admin2");
        String name= (String) redisTemplate.opsForValue().get("admin2");
        System.out.println(name);

    }*/
}
