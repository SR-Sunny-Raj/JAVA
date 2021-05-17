import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n;
        int[] arr;
        do {
            System.out.print("Enter the length (max length 20) of your list -: ");
            Scanner input = new Scanner(System.in);
            n = input.nextInt();
            arr = new int[n];
        } while (n < 1 || n > 20);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the numbers -: ");
            arr[i] = new Scanner(System.in).nextInt();
        }
        System.out.println("\nOur array is -:\n" + (Arrays.toString(arr)));
    }
}
