import company.Paperback;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class bookTest {

    @Test
    public void testRead(){
        Paperback b= new Paperback("book","Gabe","1");
        assertEquals("incorrect output","Wow this is a good book",b.read());
    }

    @Test
    public void testStore(){
        Paperback b= new Paperback("paper","Lenny","1");
        assertEquals("incorrect output","You have borrowed a paperback",b.borrowItem());
    }

    @Test
    public void testgetISBN() {
        Paperback b= new Paperback("paper","Lenny","1");
        assertEquals("incorrect output","1",b.getISBN());
    }

    @Test
    public void testsetISBN() {
        Paperback b= new Paperback("paper","Lenny","1");
        b.setISBN("2");
        assertEquals("incorrect output","2",b.getISBN());
    }


}
