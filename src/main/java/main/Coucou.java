import java.util.ArrayList;
import java.util.List;

public class CreateArrayList
{
    public static void main(String[] args)
    {
        List<String> students = new ArrayList<>("Linda", "Alberto", "Federico", "Luca");
        for (String student : students)
        {
            System.out.println("Salut" + student);
        }
    }
}