import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int N = input.nextInt();
            int[] arr = new int[N], brr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = input.nextInt();
            }
            for (int i = 0; i < N; i++) {
                brr[i] = input.nextInt();
            }
            int maxdep = 0;
            for (int i = 0; i < N; i++) {
                if (maxdep < brr[i]) {
                    maxdep = brr[i];
                }
            }
            int[] count = new int[maxdep];
            for (int i = 0; i < N; i++) {
                for (int j = arr[i]; j < brr[i]; j++) {
                    count[j]++;
                }
            }
            Arrays.sort(count);
            System.out.println(count[maxdep - 1]);
        }
        input.close();
    }
}
