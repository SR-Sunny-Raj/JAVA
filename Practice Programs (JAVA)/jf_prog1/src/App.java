import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        String s2 = input.next();
        char ch1 = s1.charAt(0);
        char ch2 = s2.charAt(0);
        if ((int) ch1 > (int) ch2) {
            System.out.println(ch2 + "," + ch1);
        } else {
            System.out.println(ch1 + "," + ch2);
        }
        input.close();
    }
}
