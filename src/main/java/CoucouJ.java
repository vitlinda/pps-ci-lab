public class CoucouJ
{
    private String name = "";

    public String getName()
    {
        return name;
    }

    public String getMessage()
    {
        if(name.isEmpty()){
            return "Salut!";
        }
        return "Salut " + name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}