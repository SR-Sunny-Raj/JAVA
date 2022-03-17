import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int D1 = input.nextInt(), T1 = input.nextInt(), DM1 = input.nextInt(), D2 = input.nextInt(),
                    T2 = input.nextInt(), DM2 = input.nextInt();
            int total1 = D1 + T1 + DM1, total2 = D2 + T2 + DM2, flag = 0;
            if (total1 > total2)
                flag = 0;
            else if (total1 < total2)
                flag = 1;
            else {
                if (D1 > D2)
                    flag = 0;
                else if (D1 < D2)
                    flag = 1;
                else {
                    if (T1 > T2)
                        flag = 0;
                    else if (T1 < T2)
                        flag = 1;
                    else {
                        flag = 2;
                    }
                }
            }
            if (flag == 2) {
                System.out.println("TIE");
            } else if (flag == 0)
                System.out.println("DRAGON");
            else
                System.out.println("SLOTH");
        }
        input.close();
    }
}
