import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T != 0) {
            int B = input.nextInt();
            int C = input.nextInt();
            int A = C - B;
            A = C / A;
            System.out.println(A);
            T--;
        }
        input.close();
    }
}
