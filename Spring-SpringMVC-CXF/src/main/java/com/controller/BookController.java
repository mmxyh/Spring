package com.controller;


import com.model.Book;
import com.service.BookService;
import com.util.FastJsonUtil;
import com.util.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping("/book")
public class BookController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BookService bookService;

    /**
     * 对登录页面输入的用户名和密码做简单的判断
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/dologin", method = RequestMethod.POST)
    @ResponseBody
    public Result dologin(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username + password);
        if ("admin".equals(username) && "123".equals(password)) {
            return Result.success();
        }

        return Result.fail("用户名和密码错误，请重新输入！！");


    }


    /**
     * 查询图书信息并跳转到list.jsp
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    private String list(Model model) {
        Result result = bookService.getBookList(0, 1000);

        model.addAttribute("result", result);
        // WEB-INF/jsp/"list".jsp 返回的list映射到此目录下的jsp文件
        return "list";
    }


    /**
     * 跳转到add.jsp
     *
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    private String add() {
        return "add";
    }

    /**
     * 新增
     *
     * @param book
     * @return
     */
    @RequestMapping(value = "/doAdd", method = RequestMethod.POST)
    @ResponseBody
    private Result doAdd(Book book) {
        logger.info("add req: " + book.toString());
        Result res = bookService.insertBook(book);
        logger.info("add res: " + res);
        return res;
    }


    /**
     * 编辑并跳转到detail.jsp
     *
     * @param bookId
     * @param model
     * @return
     */
    @RequestMapping(value = "/detail/{bookId}", method = RequestMethod.GET)
    private String detail(@PathVariable("bookId") Long bookId, Model model) {
        Book book = bookService.getById(bookId);
        model.addAttribute("book", book);
        return "detail";
    }


    /**
     * 删除
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/del/{bookId}", method = RequestMethod.GET)
    @ResponseBody
    private String deleteBookById(@PathVariable("bookId") Long id) {

        return bookService.deleteBookById(id).toJSONString();
    }




}
