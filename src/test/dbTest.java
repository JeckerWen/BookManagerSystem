import system.domain.Book;
import system.service.BookService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class dbTest {
    @Test
    public void test() {
        ApplicationContext applicationContext= new FileSystemXmlApplicationContext("classpath:application.xml");
        BookService bookService=applicationContext.getBean(BookService.class);
        List<Book> books = new ArrayList<Book>();
        books = bookService.getBookList();
    }
}
