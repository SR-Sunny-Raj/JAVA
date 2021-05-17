import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter a number -: ");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int sum = 0;
        while (x > 0) {
            sum += (x % 10);
            x /= 10;
        }
        System.out.println("Sum of all the digits of the number is : " + sum);
    }
}
