import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T != 0) {
            int N = in.nextInt();
            long a = in.nextLong();
            long b = in.nextLong();
            long[] arr = new long[N];
            for (int i = 0; i < N; i++) {
                arr[i] = in.nextLong();
            }
            int bob = 0, alice = 0, comm = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i] % a == 0 && arr[i] % b == 0)
                    comm += 1;
                else if (arr[i] % a == 0)
                    bob += 1;
                else if (arr[i] % b == 0)
                    alice += 1;
            }
            if (comm > 0)
                bob += 1;
            if (bob > alice)
                System.out.println("BOB");
            else
                System.out.println("ALICE");
            // int p = 0, flag = 0;
            // while (flag == 0) {
            // flag = 1;
            // for (int i = 0; i < N; i++) {
            // if (p == 0) {
            // if (arr[i] % a == 0 && arr[i] >= 0) {
            // arr[i] = -1;
            // flag = 0;
            // }
            // } else {
            // if (arr[i] % b == 0 && arr[i] >= 0) {
            // arr[i] = -1;
            // flag = 0;
            // }
            // }
            // if (p == 0 && i == N - 1)
            // p = 1;
            // else if (p == 1 && i == N - 1)
            // p = 0;
            // }
            // }
            // if (p == 1)
            // System.out.println("ALICE");
            // else
            // System.out.println("BOB");
            T--;
        }
        in.close();
    }
}
