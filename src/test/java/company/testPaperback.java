package company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testPaperback {

    @org.junit.Test
    public void testReturnBook(){
        Paperback p = new Paperback("book","liam","2");
        assertEquals("not the same", p ,p.returnItem());
    }
    @Test
    public void testUse(){
        Paperback p3= new Paperback("booked","adam","3");
        assertEquals("incorrect output","Flicks through pages...",p3.use());
    }

    @Test
    public void testStore(){
        Paperback p3= new Paperback("stored","ben","4");
        assertEquals("incorrect output","Put this with the paperback books",p3.store());
    }

    @Test
    public void testBorrowItem(){
        Paperback p4= new Paperback("stored","ben","4");
        assertEquals("incorrect output","You have borrowed a paperback",p4.borrowItem());
    }

}
