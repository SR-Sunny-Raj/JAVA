import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            Long N = input.nextLong(), B = input.nextLong(), M = input.nextLong(), time = 0L;
            while (N > 0) {
                Long ps;
                if (N % 2 == 0) {
                    ps = N / 2;
                } else {
                    ps = (N + 1) / 2;
                }
                time += ps * M;
                N -= ps;
                if (N != 1)
                    time += B;
                M *= 2;
            }
            System.out.println(time);
        }
        input.close();
    }
}
