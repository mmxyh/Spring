package com.imooc.test.autowiring;

import com.imooc.autowiring.AutoWiringService;
import com.imooc.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAutoWiring extends UnitTestBase{
    public TestAutoWiring(){
        super("classpath:spring-autowiring.xml");//加载文件
    }

    @Test
    public void  testSay(){
        AutoWiringService service = super.getBean("autoWiringService");
        service.say("this is a test");
    }

}
