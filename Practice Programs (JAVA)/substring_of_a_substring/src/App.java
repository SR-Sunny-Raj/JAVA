import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            String s = input.next();
            int maxi = 0, pos = 1;
            for (int i = 0; i < s.length(); i++) {
                if ((s.charAt(0) == s.charAt(i)) || (s.charAt(s.length() - 1) == s.charAt(i))) {
                    maxi = Math.max(maxi, (i - pos));
                    pos = i + 1;
                }
            }
            if ((s.length() == 1) || maxi == 0) {
                System.out.println(-1);
            } else {
                System.out.println(maxi);
            }
        }
        input.close();
    }
}
