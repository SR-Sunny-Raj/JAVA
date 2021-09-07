import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double A = input.nextInt();
        double B = input.nextInt();
        char C = input.next().charAt(0);
        if (C == '+') {
            System.out.println(A+B);
        } else if (C == '-') {
            System.out.println(A-B);
        } else if (C == '*') {
            System.out.println(A*B);
        } else if (C == '/') {
            System.out.println(A/B);
        }
        input.close();
    }
}
