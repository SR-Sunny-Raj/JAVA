import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int N = in.nextInt(), X = in.nextInt(), Y = in.nextInt();
            int tsmoke = 0;
            if (N <= 100) {
                int s1;
                if (N % 4 == 0)
                    s1 = Y * (N / 4);
                else
                    s1 = Y * ((N / 4) + 1);
                if (X < s1)
                    tsmoke = X;
                else
                    tsmoke = s1;
            } else {
                int s1, s2, flag = 0;
                s1 = X * (N / 100);
                if (N % 4 == 0)
                    s2 = Y * (N / 4);
                else
                    s2 = Y * ((N / 4) + 1);
                if (s2 < s1) {
                    tsmoke = s2;
                    flag = 1;
                } else
                    tsmoke = s1;
                if (flag == 0) {
                    N = N % 100;
                    if (N % 4 == 0)
                        s2 = Y * (N / 4);
                    else
                        s2 = Y * ((N / 4) + 1);
                    if (X < s2)
                        tsmoke += X;
                    else
                        tsmoke += s2;
                }
            }
            System.out.println(tsmoke);
        }
        in.close();
    }
}
