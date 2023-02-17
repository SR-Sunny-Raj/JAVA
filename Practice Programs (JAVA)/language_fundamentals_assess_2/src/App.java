import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = input.nextInt();
        int rev = 0;
        while (num != 0) {
            rev = (rev * 10) + (num % 10);
            num /= 10;
        }
        System.out.println("Reverse of the number is " + rev);
        input.close();
    }
}
