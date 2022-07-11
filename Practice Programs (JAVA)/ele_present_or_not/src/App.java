import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int key = input.nextInt();
        int index = Arrays.binarySearch(arr, key);
        if (index < 0) {
            System.out.println(-1);
        } else
            System.out.println(index);
    }
}
