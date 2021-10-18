import company.Audiobook;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class audiobookTest {

    @Test
    public void testUse(){
        Audiobook a = new Audiobook("listen to this");
        assertEquals("incorrect output","Wow that sounds very interesting!",a.use());
    }
}
