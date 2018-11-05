package system.dao;

import system.domain.Book;

import java.util.List;

public interface BookDao {

    public List<Book> getBookList();

    public Book getBookById(String bookId);

    public int insertBook(Book book);

    public int dropBookById(String bookId);

    public int updateBook(Book book);
}
