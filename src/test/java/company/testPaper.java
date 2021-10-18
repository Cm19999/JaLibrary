package company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testPaper {

    @Test
    public void testUse(){
        Paperback a = new Paperback("usedd","kirby","7");
        assertEquals("Incorrect output","Flicks through pages...",a.use());
    }

}
