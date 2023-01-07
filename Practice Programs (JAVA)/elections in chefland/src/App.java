import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int A = input.nextInt(), B = input.nextInt(), C = input.nextInt();
            if (A > 50) {
                System.out.println("A");
            } else if (B > 50) {
                System.out.println("B");
            } else if (C > 50) {
                System.out.println("C");
            } else {
                System.out.println("NOTA");
            }
        }
        input.close();
    }
}
