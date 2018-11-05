package com.bms.system.controller;

import com.bms.common.support.BaseController;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bms.system.domain.Book;
import com.bms.system.service.IBookService;

@Controller
@RequestMapping("/book")
public class BookController extends BaseController {

    Logger logger = Logger.getLogger(BookController.class);

    @Autowired
    private IBookService bookService;

    @GetMapping(value = "/user")
    @ResponseBody
    public String getAuthor(){
       Book book= bookService.getBookById("1");
       return "index";
    }
}
