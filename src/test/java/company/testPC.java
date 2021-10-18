package company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testPC {

    @Test
    public void testUse(){
        PC p = new PC("Dell");
        assertEquals("not the same","This PC runs well",p.use());
    }
}
