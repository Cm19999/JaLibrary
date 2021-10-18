import company.PC;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PCTest {

    @Test
    public void testUse(){
        PC p = new PC("Dell");
        assertEquals("not the same","This PC runs well",p.use());
    }
}
