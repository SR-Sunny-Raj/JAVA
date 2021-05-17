import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter a four digit number -: ");
        Scanner input = new Scanner(System.in);
        String x = input.next();
        if ((x.length()) != 4) {
            System.out.println(x + " is not a four digit number");
        } else {
            int a = ((int) x.charAt(0)) - 48;
            int b = ((int) x.charAt(1)) - 48;
            int c = ((int) x.charAt(2)) - 48;
            int d = ((int) x.charAt(3)) - 48;
            if ((a + b) == (c + d))
                System.out.println(x + " is a lucky number since " + a + " + " + b + " = " + c + " + " + d);
            else
                System.out.println(x + " is not a lucky number since " + a + " + " + b + " != " + c + " + " + d);
        }
    }
}
