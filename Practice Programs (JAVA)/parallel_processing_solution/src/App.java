import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T != 0) {
            int N = input.nextInt();
            long sum = 0L, presum = 0L;
            long[] arr = new long[N];
            for (int i = 0; i < N; i++) {
                arr[i] = input.nextLong();
                sum += arr[i];
            }
            long[] exetime = new long[N];
            for (int i = 0; i < N; i++) {
                presum += arr[i];
                exetime[i] = Math.max(presum, (sum - presum));
            }
            Arrays.sort(exetime);
            System.out.println(exetime[0]);
            T--;
        }
        input.close();
    }
}
