import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T != 0) {
            long A = in.nextLong();
            long B = in.nextLong();
            long noA = 0, noB = 0, neA = 0, neB = 0;
            if (A == 1) {
                noA = 1;
            } else if (A % 2 == 0) {
                noA = A / 2;
                neA = A / 2;
            } else {
                noA = (A / 2) + 1;
                neA = A / 2;
            }
            if (B == 1) {
                noB = 1;
            } else if (B % 2 == 0) {
                noB = B / 2;
                neB = B / 2;
            } else {
                noB = (B / 2) + 1;
                neB = B / 2;
            }
            long res = (noA * noB) + (neA * neB);
            System.out.println(res);
            T--;
        }
        in.close();
    }
}
