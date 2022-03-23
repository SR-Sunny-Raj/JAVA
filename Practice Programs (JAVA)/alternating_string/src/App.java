import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int N = input.nextInt();
            String str = input.next();
            int count0 = 0, count1 = 0, ans = 1;
            for (int i = 0; i < N; i++) {
                if (str.charAt(i) == '0')
                    count0++;
                else
                    count1++;
            }
            if (count0 == count1)
                ans = count0 + count1;
            else if (count0 > count1) {
                ans = 2 * count1 + 1;
            } else {
                ans = 2 * count0 + 1;
            }
            System.out.println(ans);
        }
        input.close();
    }
}
