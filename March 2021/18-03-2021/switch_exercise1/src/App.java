import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter num1 operator num2 -: ");
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        char op = input.next().charAt(0);
        double y = input.nextDouble();
        switch (op) {
        case '+':
            System.out.println(x + " + " + y + " results " + (x + y));
            break;
        case '-':
            System.out.println(x + " - " + y + " results " + (x - y));
            break;
        case '*':
            System.out.println(x + " * " + y + " results " + (x * y));
            break;
        case '/':
            System.out.println(x + " / " + y + " results " + (x / y));
            break;
        case '%':
            System.out.println(x + " % " + y + " results " + (x % y));
            break;
        default:
            System.out.println("Invalid operator");
        }
    }
}
