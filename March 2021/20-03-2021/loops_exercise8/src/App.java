import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter a string -: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        char n;
        for (int i = 0; i <= s.length() - 1; i++) {
            n = s.charAt(i);
            System.out.print(n + " ");
        }
    }
}
