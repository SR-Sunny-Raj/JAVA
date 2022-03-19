import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            long N = input.nextLong();
            int counteven = 0, countodd = 0;
            while (N != 0) {
                long x = N % 10;
                if (x % 2 == 0) {
                    counteven++;
                } else {
                    countodd++;
                }
                N /= 10;
            }
            if ((counteven >= 2) || (countodd >= 2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        input.close();
    }
}
