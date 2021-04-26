import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleListManagerTest {

    @Test
    public void testJava() {
        SimpleListManager simpleListManager = new SimpleListManager();

        assertEquals(0, simpleListManager.getList().size());
        simpleListManager.addElement("ciao");
        assertEquals(1, simpleListManager.getList().size());

    }
}
