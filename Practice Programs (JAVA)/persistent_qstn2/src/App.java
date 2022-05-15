import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String houses = in.next();
        String str = "";
        for (int i = 0; i < houses.length(); i++) {
            char ch = houses.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                continue;
            } else {
                str += ch;
            }
        }
        System.out.println(str);
        in.close();
    }
}
