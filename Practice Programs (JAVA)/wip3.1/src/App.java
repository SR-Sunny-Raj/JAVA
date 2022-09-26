import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int sum = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}