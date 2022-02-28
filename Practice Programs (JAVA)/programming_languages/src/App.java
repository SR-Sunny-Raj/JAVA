import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T != 0) {
            int A = input.nextInt(), B = input.nextInt(), A1 = input.nextInt(), B1 = input.nextInt(),
                    A2 = input.nextInt(), B2 = input.nextInt();
            if (((A == A1 || A == B1) && (B == A1 || B == B1)))
                System.out.println(1);
            else if (((A == A2 || A == B2) && (B == A2 || B == B2)))
                System.out.println(2);
            else
                System.out.println(0);
            T--;
        }
        input.close();
    }
}
