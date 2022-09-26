import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int fp = 0, lp = str.length() - 1;
        int flag = 0;
        while (fp < lp) {
            if (str.charAt(fp) != str.charAt(lp)) {
                flag = 1;
                break;
            }
            fp++;
            lp--;
        }
        if (flag == 0) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
