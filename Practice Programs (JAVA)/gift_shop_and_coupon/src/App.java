import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int N = input.nextInt(), K = input.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = input.nextInt();
            }
            Arrays.sort(arr);
            int count = 0, flag = 0;
            for (int i = 0; (i < N) && (K != 0); i++) {
                if (arr[i] <= K) {
                    K -= arr[i];
                    count++;
                } else if ((arr[i] > K) && flag == 0) {
                    if (arr[i] % 2 == 1) {
                        arr[i] = (arr[i] / 2) + 1;
                    } else {
                        arr[i] = (arr[i] / 2);
                    }
                    if (arr[i] <= K) {
                        K -= arr[i];
                        count++;
                    }
                    flag = 1;
                }
            }
            System.out.println(count);
        }
        input.close();
    }
}
