import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n + (n - 1)); j++) {
                if (i == n)
                    System.out.print("*");
                else if (j == ((n + (n - 1)) / 2 + i) || j == ((n + (n - 1)) / 2) - i + 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        input.close();
    }
}
