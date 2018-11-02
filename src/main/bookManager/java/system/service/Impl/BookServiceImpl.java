package bookManager.java.system.service.Impl;

import bookManager.java.system.dao.BookDao;
import bookManager.java.system.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl {
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
