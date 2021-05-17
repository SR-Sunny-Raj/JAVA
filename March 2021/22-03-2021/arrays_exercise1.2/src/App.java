import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Point[] arr;
        int n;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter the number of points (max 20) you want in your list -: ");
            n = input.nextInt();
            arr = new Point[n];
        } while (n < 1 || n > 20);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the x and y for point " + (i + 1) + " -: ");
            arr[i] = new Point(input.nextInt(), input.nextInt());
        }
        // System.out.println("Our points are -: " + (Arrays.toString(arr))); //We can
        // also use this to print the list
        System.out.println("\nOur list is -: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("( " + arr[i].x + " , " + arr[i].y + " )");
        }
    }
}
