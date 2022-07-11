import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);
        if (ch >= 48 && ch <= 57) {
            System.out.println("Digit");
        } else if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
            System.out.println("Alphabet");
        } else {
            System.out.println("Special Character");
        }
        input.close();
    }
}
