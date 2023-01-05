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
            int rem = 0, flag = 0;
            for (int i = 0; i < N; i++) {
                int s = arr[i] + rem;
                if (s < K) {
                    flag = i + 1;
                    break;
                } else {
                    rem = s - K;
                }
            }
            if (flag == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO " + flag);
            }
        }
        input.close();
    }
}
