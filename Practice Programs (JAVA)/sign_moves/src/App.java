import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            long N = input.nextInt(), ans = 0L;
            if (N == 1L) {
                ans = -1;
            } else if (N % 2 == 1) {
                ans = (N / 2) - ((N / 2) * 2) - 1;
            } else {
                ans = N / 2;
            }
            System.out.println(ans);
        }
        input.close();
    }
}
