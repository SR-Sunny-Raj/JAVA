import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T != 0) {
            int A = in.nextInt(), B = in.nextInt(), X = in.nextInt(), Y = in.nextInt();
            if ((X * Y) >= (A * B))
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
        in.close();
    }
}
