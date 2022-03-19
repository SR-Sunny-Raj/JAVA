import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int X = input.nextInt();
            int n10 = 0, n5 = 0;
            n10 = X / 10;
            X %= 10;
            n5 = X / 5;
            X %= 5;
            if (X != 0) {
                System.out.println(-1);
            } else {
                System.out.println(n10 + n5);
            }
        }
        input.close();
    }
}
