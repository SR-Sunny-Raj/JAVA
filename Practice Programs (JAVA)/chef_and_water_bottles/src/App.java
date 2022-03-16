import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int N = input.nextInt(), X = input.nextInt(), K = input.nextInt();
            int filled = K / X;
            if (filled >= N)
                System.out.println(N);
            else
                System.out.println(filled);
        }
        input.close();
    }
}
