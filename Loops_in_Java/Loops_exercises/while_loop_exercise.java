import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter a number between 1 and 10 -: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        while (x < 1 || x > 10) {
            System.out.print(x + " is not between 1 and 10. Try again : ");
            x = input.nextInt();
        }
        System.out.println(x + " is between 1 and 10. Thanks!");
    }
}
