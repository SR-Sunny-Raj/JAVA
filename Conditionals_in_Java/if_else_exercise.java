import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter a four digit number -: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        if ((x < 1000) || (x > 9999)) {
            System.out.println(x + " is not a four digit number");
        } else {
            int a = (x / 1000);
            int b = (x / 100) % 10;
            int c = (x / 10) % 10;
            int d = x % 10;
            if ((a + b) == (c + d))
                System.out.println(x + " is a lucky number since " + a + " + " + b + " = " + c + " + " + d);
            else
                System.out.println(x + " is not a lucky number since " + a + " + " + b + " != " + c + " + " + d);
        }
    }
}
