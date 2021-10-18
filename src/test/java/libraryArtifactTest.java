import company.Paperback;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class libraryArtifactTest {

    @Test
    public void testGetName(){
        Paperback a = new Paperback("green","shaun","1");
        assertEquals("Incorrect answer","green",a.getName());
    }

    @Test
    public void testSetName(){
        Paperback b = new Paperback("blue","geoff","2");
        b.setName("darren");
        assertEquals("Incorrect answer","darren",b.getName());
    }
}
