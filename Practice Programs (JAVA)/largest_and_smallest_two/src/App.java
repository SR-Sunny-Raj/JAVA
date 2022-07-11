import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Smallest two values are -: " + arr[0] + ", " + arr[1]);
        System.out.println("Largest two values are -: " + arr[n - 2] + ", " + arr[n - 1]);
        input.close();
    }
}
