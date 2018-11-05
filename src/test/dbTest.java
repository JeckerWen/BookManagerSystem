import base.BaseTest;
import org.junit.Test;
import com.bms.system.domain.Book;
import com.bms.system.service.IBookService;

import java.util.ArrayList;
import java.util.List;

public class dbTest extends BaseTest {
    @Test
    public void test() {
        IBookService IBookService =this.wac.getBean(com.bms.system.service.IBookService.class);
        List<Book> books = new ArrayList<Book>();
        books = IBookService.getBookList();
    }
}
