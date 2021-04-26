import java.util.ArrayList;
import scala.collection.JavaConversions._

object geeks
{
  def main(args: Array[String])
  {
    val students = new ArrayList[String]()
    students.add("Linda")
    students.add("Marco")
    students.add("Filippo")
    for (student <- students)
    {
      println("Salut " + student)
    }
  }
}