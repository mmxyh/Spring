package com.webservice.impl;


import com.google.gson.Gson;
import com.model.Book;
import com.service.BookService;
import com.webservice.DemoWebservice;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebService;
import java.util.List;


@WebService(endpointInterface = "com.webservice.DemoWebservice")
public class DemoWebserviceImpl implements DemoWebservice {
    @Autowired
    private BookService bookService;

    @Override
    public String queryBaseTx() {
        List<Book> list = bookService.getList(0, 1000);

        return new Gson().toJson(list);
    }

    @Override
    public String queryBaseTxById(long id) {
        Book basetx = bookService.getById(id);
        return new Gson().toJson(basetx);
    }
}