import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CoucouScalaTest {

  @Test def test(): Unit = {
    val s = new CoucouJava()
    s.setName("Linda")
    assertEquals("Linda", s.getName)
    assertEquals("Salut Linda", s.getMessage)
  }
}

