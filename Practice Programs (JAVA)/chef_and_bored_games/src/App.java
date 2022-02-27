import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T != 0) {
            int N = in.nextInt();
            int tSize = 0;
            for (int i = 1; i <= N; i += 2) {
                tSize += ((N - i + 1) * (N - i + 1));
            }
            System.out.println(tSize);
            T--;
        }
        in.close();
    }
}
