package company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testAudiobook {

    @Test
    public void testUse(){
        Audiobook a = new Audiobook("listen to this");
        assertEquals("incorrect output","Wow that sounds very interesting!",a.use());
    }
}
