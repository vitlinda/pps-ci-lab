import java.util.ArrayList;
import java.util.List;

public class Coucou
{
    public static void main(String[] args)
    {
        List<String> students = new ArrayList<String>();
        students.add("Linda");
        students.add("Marco");
        students.add("Filippo");
        for (String student : students)
        {
            System.out.println("Salut " + student);
        }
    }
}