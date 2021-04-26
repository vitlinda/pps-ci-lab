import java.util.ArrayList;
import scala.collection.JavaConversions._

object geeks
{
  def main(args: Array[String])
  {
    val students = new ArrayList[String]("Linda", "Alberto", "Federico", "Luca")

    for (student <- students)
    {
      println("Salut" + student)
    }
  }
}