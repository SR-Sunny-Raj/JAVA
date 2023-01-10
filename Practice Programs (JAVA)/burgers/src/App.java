import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int A = input.nextInt(), B = input.nextInt();
            if (A < B) {
                System.out.println(A);
            } else {
                System.out.println(B);
            }
        }
        input.close();
    }
}
