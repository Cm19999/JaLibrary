package company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testJournal {

    @Test
    public void testReturnItem(){
        Journal p = new Journal("book","liam");
        assertEquals("not the same", p ,p.returnItem());
    }
    @Test
    public void testUse(){
        Journal p3= new Journal("booked","adam");
        assertEquals("incorrect output","What an informative journal",p3.use());
    }

    @Test
    public void testStore(){
        Journal p3= new Journal("stored","ben");
        assertEquals("incorrect output","Store this with the other journals",p3.store());
    }

    @Test
    public void testBorrow(){
        Journal p4= new Journal("borrowed","ted");
        assertEquals("incorrect output","You have borrowed a journal",p4.borrowItem());
    }
}
