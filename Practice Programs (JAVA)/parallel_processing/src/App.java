import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T != 0) {
            int N = input.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = input.nextInt();
            }
            int p1sum = 0, p2sum = 0;
            Arrays.sort(arr);
            int fp = 0, lp = N - 1;
            while (fp <= lp) {
                if (p1sum < p2sum) {
                    p1sum += arr[fp];
                    fp++;
                } else {
                    p2sum += arr[lp];
                    lp--;
                }
            }
            if (p1sum < p2sum)
                System.out.println(p1sum);
            else
                System.out.println(p2sum);
            input.close();
        }
    }
}
