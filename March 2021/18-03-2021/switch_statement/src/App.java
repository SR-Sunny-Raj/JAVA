import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter a number -: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        switch (x % 2) {
        case 0:
            System.out.println(x + " is an even number");
            break;
        case 1:
            System.out.println(x + " is an odd number");
            break;
        default:
            return;
        }
    }
}
