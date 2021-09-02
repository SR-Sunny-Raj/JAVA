import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers do you want in your array ?  ");
        int n = input.nextInt();
        while (n < 1 || n > 20) {
            System.out.print("Please enter only  a number between 1 and 20 -: ");
            n = input.nextInt();
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        input.close();
    }
}
