import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T != 0) {
            int N = input.nextInt(), K = input.nextInt(), V = input.nextInt();
            int sum = 0;
            for (int i = 0; i < N; i++) {
                sum += input.nextInt();
            }
            int x = (V * (N + K)) - sum;
            if (((x % K) == 0) && x > 0) {
                System.out.println(x / K);
            } else {
                System.out.println(-1);
            }
            T--;
        }
        input.close();
    }
}
