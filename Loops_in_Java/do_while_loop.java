import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int x;
        do {
            System.out.print("Enter a number between 1 and 10 -: ");
            x = s.nextInt();
        } while (x < 1 || x > 10);
        System.out.print(x + " is between 1 and 10.");
    }
}
