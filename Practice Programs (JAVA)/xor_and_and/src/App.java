import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int N = input.nextInt();
            long[] arr = new long[N];
            for (int i = 0; i < N; i++) {
                arr[i] = input.nextLong();
            }
            int count = 0;
            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    long xor = arr[i] ^ arr[j], and = arr[i] & arr[j];
                    if (xor < and) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
        input.close();
    }
}
