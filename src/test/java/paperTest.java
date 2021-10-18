import company.Paperback;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class paperTest {

    @Test
    public void testUse(){
        Paperback a = new Paperback("usedd","kirby","7");
        assertEquals("Incorrect output","Flicks through pages...",a.use());
    }

    @Test
    public void testGetAuthor() {
        Paperback b = new Paperback("blue","jeff","7");
        assertEquals("Incorrect output","jeff",b.getAuthor());
    }

    public void testSetAuthor(){
        Paperback c = new Paperback("red","robbie","8");
        c.setISBN("alan");
        assertEquals("Incorrect output","alan",c.getAuthor());
    }

}
