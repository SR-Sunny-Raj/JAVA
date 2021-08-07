import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        String str = input.next();
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = false;
                break;
            }
        }
        System.out.println(flag ? "Palindrome" : "Not Palindrome");
        input.close();
    }
}
