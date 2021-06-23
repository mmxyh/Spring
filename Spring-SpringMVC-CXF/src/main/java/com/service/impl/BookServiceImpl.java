package com.service.impl;


import com.dao.BookDao;
import com.model.Book;
import com.service.BookService;
import com.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hisen on 17-4-24.
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public Book getById(long bookId) {
        return bookDao.queryById(bookId);
    }

    @Override
    public List<Book> getList(int start, int pageNum) {
        return bookDao.queryAll(start, pageNum);
    }

    @Override
    public int addBook(Book book) {

        return bookDao.addBook(book);
    }

    @Override
    public int updateBook(Book book) {
        return bookDao.updateBook(book);
    }

    @Override
    public int delBookById(long id) {
        return bookDao.deleteBookById(id);
    }


    @Override
    public Result getBookList(int start, int pageNum) {
        List<Book> books = bookDao.queryAll(start, pageNum);
        return Result.success(books);
    }

    @Override
    public Result insertBook(Book book) {

        Book hasBook = bookDao.queryById(book.getBookId());

        if (hasBook == null) {
            int i = bookDao.addBook(book);
            return i > 0 ? Result.success() : Result.fail("新增图书失败");
        } else {
            return Result.fail("图书ID重复");
        }
    }

    @Override
    public Result deleteBookById(long id) {
        int i = bookDao.deleteBookById(id);
        return i > 0 ? Result.success() : Result.fail("删除图书失败");
    }
}
