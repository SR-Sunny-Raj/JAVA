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
        int sum = 0, prod = 1;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            prod *= arr[i];
        }
        System.out.println("Sum = " + sum + " Product = " + prod + " and Average = " + ((double) sum / n));
        input.close();
    }
}
