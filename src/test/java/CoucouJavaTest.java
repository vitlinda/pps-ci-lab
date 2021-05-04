import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoucouJavaTest {

    @Test
    public void testHelloEmpty()
    {
        CoucouJ c = new CoucouJ();
        c.setName("Linda");
        assertEquals(c.getName(),"Linda");
        assertEquals(c.getMessage(),"Salut Linda");
    }
}
