import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int K = input.nextInt(), X = input.nextInt();
            System.out.println(K - X);
        }
        input.close();
    }
}
