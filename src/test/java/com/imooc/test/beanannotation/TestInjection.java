package com.imooc.test.beanannotation;

import com.imooc.beanannotation.injection.service.InjectionService;
import com.imooc.beanannotation.multibean.BeanInvoker;
import com.imooc.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;



@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestBase {

    public TestInjection(){
        super("classpath*:spring-beanannotation.xml");
    }

    @Test
    public void testAutowired(){
        InjectionService service = super.getBean("injectionServiceImpl");
        service.save("This is autowired");
    }

    @Test
    public void testMultibean(){
        BeanInvoker invoker = super.getBean("beanInvoker");
        invoker.say();
    }
}
