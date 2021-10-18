

import company.Laptop;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class computerTest {

    @Test
    public void testUse(){
        Laptop c = new Laptop("dell");
        assertEquals("Incorrect output","The internet is cool",c.use());
    }

}
