import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleListTest {

    @Test
    public void testJava() {
        SimpleList classTest1List = new SimpleList();

        assertEquals(0, classTest1List.getList().size());
        classTest1List.addElement(1);
        assertEquals(1, classTest1List.getList().size());

    }
}
