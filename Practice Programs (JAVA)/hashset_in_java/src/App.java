import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Sunny");
        hs.add("Raj");
        hs.add("Gullu");
        hs.add("Bunny");
        hs.add("honey");

        System.out.println(hs.contains("Sunny"));
        hs.remove("honey");
        System.out.println(hs.size());

        for (String s : hs) {
            System.out.print(s);
        }
    }
}
