import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList arr = new ArrayList(5);
        arr.add("Sunny");
        arr.add("Raj");
        arr.add("abcd");
        arr.add(1, "cd");
        Iterator it = arr.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
