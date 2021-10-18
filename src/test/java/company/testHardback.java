package company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testHardback {

    @Test
    public void testReturnBook(){
        Hardback p = new Hardback("book","liam","2");
        assertEquals("not the same", p ,p.returnItem());
    }
    @Test
    public void testUse(){
        Hardback p3= new Hardback("booked","adam","3");
        assertEquals("incorrect output","Flicks through pages...",p3.use());
    }

    @Test
    public void testStore(){
        Hardback p3= new Hardback("stored","ben","4");
        assertEquals("incorrect output","Put this with the hardback books",p3.store());
    }

    @Test
    public void testBorrow(){
        Hardback p4= new Hardback("borrowed","ted","5");
        assertEquals("incorrect output","You have borrowed a hardback book",p4.borrowItem());
    }

}
