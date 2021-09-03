import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T > 0) {
            int N = input.nextInt();
            int A = input.nextInt();
            int B = input.nextInt();
            String S = input.next();
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == '0')
                    count += A;
                else
                    count += B;
            }
            System.out.println(count);
            T--;
        }
        input.close();
    }
}
