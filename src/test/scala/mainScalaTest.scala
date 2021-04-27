import mainScala.sommaScala
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class mainScalaTest {

  @Test
  def testSommaScala: Unit = {
    assertEquals(sommaScala(10,6),16)
  }

}
