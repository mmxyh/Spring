package com.service;


import com.model.Book;
import com.util.Result;

import java.util.List;

/**
 * Created by hisen on 17-4-24.
 */
public interface BookService {
  Book getById(long bookId);
  List<Book> getList(int start, int pageNum);
  int addBook(Book book);
  int updateBook(Book book);
  int delBookById(long id);


  Result getBookList(int start, int pageNum);

  Result insertBook(Book book);


  Result deleteBookById(long id);
}
