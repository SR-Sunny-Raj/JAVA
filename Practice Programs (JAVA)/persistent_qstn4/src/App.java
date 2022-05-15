import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int count = 0;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < N; i++) {
            double d = Math.sqrt(arr[i]);
            if (d == (int) d) {
                count++;
            }
        }
        System.out.println(count);
        input.close();
    }
}
