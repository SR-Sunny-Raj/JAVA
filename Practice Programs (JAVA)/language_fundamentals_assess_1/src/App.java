import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // fill your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers :");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int great = (a > b && a > c) ? a : (b > c ? b : c);
        System.out.println(great + " is the greatest number");
        input.close();
    }

}
