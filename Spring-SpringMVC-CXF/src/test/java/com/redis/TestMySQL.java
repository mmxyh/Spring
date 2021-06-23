package com.redis;

import com.dao.BookDao;
import com.model.Book;
import com.util.Result;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author: hmm
 * @Date: 2019/9/11 17:47
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext-dao.xml","classpath:mybatis/mybatis-config.xml"})
public class TestMySQL {
    @Autowired
    private BookDao bookDao;

    @Test
    public void terst(){
        List<Book> books = bookDao.queryAll(1, 10);

    }
}
