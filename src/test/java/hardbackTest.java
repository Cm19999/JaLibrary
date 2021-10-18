import company.Hardback;
import company.Paperback;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class hardbackTest {

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


    @Test
    public void testToString(){
        Hardback p5= new Hardback("yes","hilda","6");
        assertEquals("Incorrect message",  p5.toString(), new String("Hardback{" +
                " Name= "+p5.getName()+'\''+
                " Author= "+p5.getAuthor()+'\''+
                " ISBN='" + p5.getISBN() + '\'' +
                '}'));
    }
}
