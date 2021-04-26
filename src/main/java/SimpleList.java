import java.util.LinkedList;
import java.util.List;

public class SimpleList {

    private final List<Integer> list = new LinkedList<>();

    public void addElement(final Integer elem) {
        list.add(elem);
    }

    public List<Integer> getList(){
        return list;
    }


    public static void main(String... args) {
        System.out.println("Hello, world!");
    }

}
