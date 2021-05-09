import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("Enter a number between 1 and 10 -: ");
            n = s.nextInt();
            if (n < 1 || n > 10)
                continue;
            System.out.println(n + " is between 1 and 10. Thanks!");
            break;
        }
    }
}
