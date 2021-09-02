import java.awt.Point;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements you want in the array -: ");
        int n = input.nextInt();
        while (n < 1 || n > 20) {
            System.out.print("Enter only a number between 1 and 20 -: ");
            n = input.nextInt();
        }
        Point[] arr = new Point[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Point(input.nextInt(), input.nextInt());
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        input.close();
    }
}
