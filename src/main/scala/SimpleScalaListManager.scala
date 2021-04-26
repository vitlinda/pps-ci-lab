case class SimpleScalaListManager(var list: List[String]){
  def addElem(elem: String) = {
    list = elem :: list
  }
}

object ScalaTest extends App {
  System.out.println("Ciao Java da Scala")
}
