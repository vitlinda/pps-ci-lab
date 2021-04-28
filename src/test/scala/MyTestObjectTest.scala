import MyTestObject.Operator
import org.junit.jupiter.api.Assertions.{assertEquals, assertFalse}
import org.junit.jupiter.api.Test

class MyTestObjectTest {

  @Test
  def funTest(): Unit ={
    assertEquals(10, Operator.fun(5,5)(_+_))
  }
}
