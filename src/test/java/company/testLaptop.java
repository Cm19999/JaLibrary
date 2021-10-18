package company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testLaptop {

    @Test
    public void testStore(){
        Laptop p = new Laptop("Dell");
        assertEquals("incorrect thing","Put this back with the laptops",p.store());
    }
    @Test
    public void borrowItem(){
        Laptop p1 = new Laptop("Dell");
        assertEquals("incorrect thing","You have borrowed a laptop",p1.borrowItem());
    }
    @Test
    public void returnItem(){
        Laptop p2 = new Laptop("Dell");
        assertEquals("incorrect thing",p2,p2.returnItem());
    }

}
