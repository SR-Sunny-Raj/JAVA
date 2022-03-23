import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            long N = input.nextLong(), prevorval = 0L, orval = 1L, ans = 0L;
            // int[] arr = new int[N];
            // arr[0] = 1;
            for (int i = 1; i < N; i++) {
                // arr[i] = arr[i - 1] | (i + 1);
                prevorval = orval;
                orval = prevorval | (i + 1);
                if (prevorval == orval) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
        input.close();
    }
}
