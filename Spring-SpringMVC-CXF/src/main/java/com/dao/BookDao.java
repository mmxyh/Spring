package com.dao;


import com.model.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface BookDao {
    Book queryById(long id);
    List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);
    int addBook(Book book);
    int updateBook(Book book);

    @Delete({"DELETE FROM book WHERE book_id = #{bookId}"})
    int deleteBookById(long id);
}

