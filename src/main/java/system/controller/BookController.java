package system.controller;

import common.support.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import system.domain.Book;
import system.service.IBookService;

@Controller
@RequestMapping("/book")
public class BookController extends BaseController {

    @Autowired
    private IBookService bookService;

    @GetMapping(value = "/user")
    @ResponseBody
    public String getAuthor(){
       Book book= bookService.getBookById("1");
       return book!=null?book.getAuthor():"未知";
    }
}
