import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements you want in your array -: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        int count = 1;
        for (int i = 0; i < n - 1; i++) {
            if (i == n - 2 && arr[i] != arr[i + 1]) {
                System.out.println(arr[i + 1] + " occurs " + count + " times");
            }
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                System.out.println(arr[i] + " occurs " + count + " times");
                count = 1;
            }
        }
        input.close();
    }
}
