import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String revStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revStr += str.charAt(i);
        }
        System.out.println(revStr);
        input.close();
    }
}
