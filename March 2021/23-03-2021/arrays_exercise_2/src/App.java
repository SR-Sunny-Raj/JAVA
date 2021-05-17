import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter the number of elements you want in the list -: ");
        int n = new Scanner(System.in).nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements in the list -: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }
        System.out.println("Our array is -: " + Arrays.toString(arr));
        System.out.println("Sum = " + sum(arr) + " , Product = " + product(arr) + " , Average = " + average(arr));
    }

    private static double average(int arr[]) {
        return (sum(arr) / arr.length);
    }

    private static int product(int[] arr) {
        int product = 1;
        for (int i = 0; i < arr.length; i++)
            product *= arr[i];
        return product;
    }

    private static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum;
    }
}
