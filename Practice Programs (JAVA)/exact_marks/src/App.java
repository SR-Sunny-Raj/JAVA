import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            long N = input.nextLong(), X = input.nextLong();
            if ((X > (N * 3)) || (((N * 3) > X) && (X > ((N - 1) * 3)))
                    || ((((N - 1) * 3) - 1 > X) && (X > ((N - 2) * 3)))) {
                System.out.println("NO");
            } else if ((X != 0) && (X % 3 == 0)) {
                System.out.println("YES\n" + (X / 3) + " " + 0 + " " + (N - (X / 3)));
            } else if (X == 0) {
                System.out.println("YES\n" + 0 + " " + 0 + " " + N);
            } else {
                long sol = (X / 3) + 1, wr = (sol * 3) - X, unsol = N - (sol + wr);
                System.out.println("YES\n" + sol + " " + wr + " " + unsol);
            }
        }
        input.close();
    }
}
