import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter a number -: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= (n / 2); i++) {
            if (n % i == 0) {
                System.out.print(i + " + ");
            }
        }
    }
}
