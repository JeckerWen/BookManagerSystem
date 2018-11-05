package system.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.dao.BookDao;
import system.domain.Book;
import system.service.IBookService;

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
