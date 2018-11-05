package com.bms.system.service;

import com.bms.system.domain.Book;

import java.util.List;

/**
 * Service已I开头代表接口
 * 图书接口
 * @author Leslie
 */
public interface IBookService {
    /**
    * @Description: 图书接口
    * @Param: []
    * @return: java.util.List<com.bms.system.domain.Book>
    * @Author: Leslie
    * @Date: 2018/11/2
    */
    public List<Book> getBookList();

    /**
     *
     * @param bookId 图书id
     * @return
     */
    public Book getBookById(String bookId);

    public int insertBook(Book book);

    public int dropBookById(String bookId);

    public int updateBook(Book book);
}
