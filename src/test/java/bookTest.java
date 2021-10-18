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
}
