import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int N = input.nextInt(), M = input.nextInt();
            if ((N * M) % 2 == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        input.close();
    }
}
