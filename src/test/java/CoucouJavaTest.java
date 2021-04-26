import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoucouJavaTest {

    @Test
    public void testHelloEmpty()
    {
        CoucouJava c = new CoucouJava();
        c.setName("Linda");
        assertEquals(c.getName(),"Linda");
        assertEquals(c.getMessage(),"Salut Linda");
    }
}
