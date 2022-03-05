import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Character> charr = new ArrayList<>();
        charr.add('s');
        charr.add('U');
        charr.add('N');
        charr.add('n');
        charr.add('y');

        System.out.println(charr.get(1));

        for (char ch : charr) {
            System.out.print(ch + " ");
        }
        System.out.println();

        Collections.sort(charr);
        for (char ch : charr) {
            System.out.print(ch + " ");
        }
        System.out.println();

    }
}
