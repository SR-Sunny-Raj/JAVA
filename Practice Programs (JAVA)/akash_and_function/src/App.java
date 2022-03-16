import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            long N = input.nextLong();
            long ans;
            if (N % 2 == 0) {
                ans = N / 2;
            } else {
                ans = (N / 2) + 1;
            }
            System.out.println(ans);
        }
        input.close();
    }
}
