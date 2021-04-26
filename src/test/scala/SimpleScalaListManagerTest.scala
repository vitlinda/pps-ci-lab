import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SimpleScalaListManagerTest {

  @Test def testScala(): Unit = {
    val simpleScalaListManager = SimpleScalaListManager(List("a"))
    assertEquals(1, simpleScalaListManager.list.length)
    simpleScalaListManager.addElem("b")
    assertEquals(2, simpleScalaListManager.list.size)
  }
}
