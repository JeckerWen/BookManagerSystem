package com.bms.system.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bms.system.dao.BookDao;
import com.bms.system.domain.Book;
import com.bms.system.service.IBookService;

import java.util.List;

@Service
public class BookServiceImpl implements IBookService {
    @Autowired
    private BookDao bookDao;

    public List<Book> getBookList() {
        return bookDao.getBookList();
    }

    public Book getBookById(String bookId) {
        return bookDao.getBookById(bookId);
    }

    public int insertBook(Book book) {
        return bookDao.insertBook(book);
    }

    public int dropBookById(String bookId) {
        return bookDao.dropBookById(bookId);
    }

    public int updateBook(Book book) {
        return bookDao.updateBook(book);
    }


}
