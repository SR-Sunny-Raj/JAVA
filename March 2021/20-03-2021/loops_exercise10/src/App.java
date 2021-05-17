import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter a string to check if it's palindrome or not -: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String r = "";
        for (int n = s.length() - 1; n >= 0; n--)
            r += s.charAt(n);
        boolean isPalindrome = true;
        for (int j = 0; j <= s.length() - 1; j++) {
            if (s.charAt(j) == r.charAt(j))
                continue;
            else {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome ? (s + " is palindrome.") : (s + " is not palindrome."));
    }
}
