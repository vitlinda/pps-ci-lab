import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyTestClassTest {

    @Test
    void sayHello() {
        assertEquals("Hello world", MyTestClass.sendHello());
    }
}