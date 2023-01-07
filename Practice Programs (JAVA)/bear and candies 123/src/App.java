import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int A = input.nextInt(), B = input.nextInt();
            int AT = 0, BT = 0;
            for (int i = 1; AT <= A || BT <= B; i++) {
                if (i % 2 == 1) {
                    AT += i;
                    if (AT > A) {
                        System.out.println("Bob");
                        break;
                    }
                } else {
                    BT += i;
                    if (BT > B) {
                        System.out.println("Limak");
                        break;
                    }
                }
            }
        }
        input.close();
    }
}
