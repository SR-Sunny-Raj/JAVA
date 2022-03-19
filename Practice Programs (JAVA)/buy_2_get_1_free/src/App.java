import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int N = input.nextInt(), X = input.nextInt();
            int nfree = N / 3;
            N -= nfree;
            System.out.println(N * X);
        }
        input.close();
    }
}
