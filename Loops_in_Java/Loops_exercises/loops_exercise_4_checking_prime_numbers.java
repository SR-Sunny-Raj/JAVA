import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter a number -: ");
        Scanner input = new Scanner(System.in);
        int flag = 0;
        int x = input.nextInt();
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                System.out.println(x + " is not a prime number.");
                flag = 1;
                break;
            } else {
                continue;
            }
        }
        if (flag == 0)
            System.out.println(x + " is a prime number.");
    }
}
