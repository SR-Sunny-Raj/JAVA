import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter the number of numbers you want in your list -: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements in the list -: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("\nOur array is -:\n" + Arrays.toString(arr));
        int[] brr = new int[n];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                brr[k++] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                brr[k++] = arr[i];
            }
        }
        copyArray(brr, arr);
        System.out.println("\nOur updated array is -:\n" + Arrays.toString(arr));
    }

    private static void copyArray(int[] brr, int[] arr) {
        for (int i = 0; i < brr.length; i++) {
            arr[i] = brr[i];
        }
    }
}
