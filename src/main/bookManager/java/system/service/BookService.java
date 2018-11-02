package bookManager.java.system.service;

import bookManager.java.system.domain.Book;

import java.util.List;

public interface BookService {
    public List<Book> getBookList();

    public Book getBookById(String bookId);

    public int insertBook(Book book);

    public int dropBookById(String bookId);

    public int updateBook(Book book);
}
