import base.BaseTest;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import system.domain.Book;
import system.service.IBookService;

import java.util.ArrayList;
import java.util.List;

public class dbTest extends BaseTest {
    @Test
    public void test() {
        IBookService IBookService =this.wac.getBean(system.service.IBookService.class);
        List<Book> books = new ArrayList<Book>();
        books = IBookService.getBookList();
    }
}
