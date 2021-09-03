import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T > 0) {
            int N = input.nextInt();
            Long[] A = new Long[N];
            int oddval = 0, evenval = 0, evenpos = (N / 2), oddpos = N - evenpos, count = 0;
                if (N == 1) {
                    evenpos = 0;
                    oddpos = 1;
                } else if (N == 2) {
                    evenpos = 1;
                    oddpos = 1;
                }
                for (int i = 0; i < N; i++) {
                A[i] = input.nextLong();
                if (A[i] % 2 == 0)
                    evenval++;
                else
                    oddval++;
            }
            while ((oddval != 0 && evenpos != 0) || (evenval != 0 && oddpos != 0)) {
                if (oddval > 0 && evenpos > 0) {
                    count++;
                    oddval--;
                    evenpos--;
                }
                if (evenval > 0 && oddpos > 0) {
                    count++;
                    evenval--;
                    oddpos--;
                }
            }
            System.out.println(count);
            T--;
        }
        input.close();
    }
}
