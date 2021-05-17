import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter how many fibonacci number you want to display -: ");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int prev = 0;
        int curr = 1;
        System.out.print(curr + "\t");
        for (int i = 1; i < x; i++) {
            curr = curr + prev;
            prev = curr - prev;
            System.out.print(curr + "\t");
        }
    }
}
