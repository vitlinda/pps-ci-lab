import java.util.ArrayList;
import java.util.List;

public class CoucouJava
{
    private String name = "";

    public String getName()
    {
        return name;
    }

    public String getMessage()
    {
        if(name==""){
            return "Salut!";
        }
        return "Salut " + name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}