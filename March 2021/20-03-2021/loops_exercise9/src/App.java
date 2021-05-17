import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter a string -: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        for (int n = s.length() - 1; n >= 0; n--)
            System.out.print(s.charAt(n));
    }
}
