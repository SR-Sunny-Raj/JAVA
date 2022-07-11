import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);
        if (ch >= 65 && ch <= 90) {
            System.out.println((ch + "").toLowerCase());
        } else if (ch >= 97 && ch <= 122) {
            System.out.println((ch + "").toUpperCase());
        }
        input.close();
    }
}
