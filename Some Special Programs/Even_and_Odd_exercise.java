import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Even and Odd number checker
        System.out.print("Enter a number :- ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        if (x % 2 == 0) {
            System.out.println(x + " is an even number");
        }
        if (x % 2 == 1) {
            // else {
            System.out.println(x + " is an odd number");
        }
    }
}
