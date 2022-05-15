import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                count += arr[i];
            }
        }
        System.out.println(count);
        in.close();
    }
}
