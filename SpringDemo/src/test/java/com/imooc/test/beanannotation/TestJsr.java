package com.imooc.test.beanannotation;

import com.imooc.beanannotation.jsr.JsrService;
import com.imooc.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestJsr extends UnitTestBase{

    public TestJsr(){
        super("classpath*:spring-beanannotation.xml");
    }

    @Test
    public void testsave(){
        JsrService service =getBean("jsrService");
        service.save();
    }

}
