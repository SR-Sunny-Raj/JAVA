import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T > 0) {
            int A = input.nextInt();
            int B = input.nextInt();
            int C = input.nextInt();
            int D = input.nextInt();
            int E = input.nextInt();
            if ((A + B <= D && C <= E) || (A + C <= D && B <= E) || (B + C <= D && A <= E)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            T--;
        }
        input.close();
    }
}
