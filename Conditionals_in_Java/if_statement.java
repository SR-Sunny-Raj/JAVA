import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Max of two numbers
        System.out.print("Enter two numbers to find the max among them -: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        if (x > y) {
            System.out.println("The max number among " + x + " and " + y + " is " + x);
        }
        if (x < y) {
            System.out.println("The max number among " + x + " and " + y + " is " + y);
        }
        if (x == y) {
            System.out.println("Both " + x + " and " + y + " are equal");
        }
    }
}
