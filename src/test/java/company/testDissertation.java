package company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testDissertation {

    @Test
    public void testReturnItem(){
        Dissertation p = new Dissertation("book","liam");
        assertEquals("not the same", p ,p.returnItem());
    }
    @Test
    public void testUse(){
        Dissertation p3= new Dissertation("booked","adam");
        assertEquals("incorrect output","What an informative dissertation",p3.use());
    }

    @Test
    public void testStore(){
        Dissertation p3= new Dissertation("stored","ben");
        assertEquals("incorrect output","Store this with the other dissertations",p3.store());
    }

    @Test
    public void testBorrow(){
        Dissertation p4= new Dissertation("borrowed","ted");
        assertEquals("incorrect output","You have borrowed a dissertation",p4.borrowItem());
    }
}
