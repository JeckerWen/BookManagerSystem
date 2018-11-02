package bookManager.java.test.Controller;

import bookManager.java.system.domain.Book;
import bookManager.java.system.service.BookService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class dbTest {
    @Autowired
    private BookService bookService;
    @Test
    public void test() {
        List<Book> books = new ArrayList<Book>();
        books = bookService.getBookList();
    }
}
