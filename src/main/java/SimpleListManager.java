import java.util.LinkedList;
import java.util.List;

public class SimpleListManager {

    private final List<String> list = new LinkedList<>();

    public void addElement(final String elem) {
        list.add(elem);
    }

    public List<String> getList(){
        return list;
    }


    public static void main(String... args) {
        System.out.println("Hello, world!");
    }

}
