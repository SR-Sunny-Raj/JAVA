import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> llist = new LinkedList<Integer>();
        llist.add(1);
        llist.add(2);
        llist.addFirst(10);
        llist.addLast(50);

        for (Integer i : llist) {
            System.out.print(i + " ");
        }
    }
}
