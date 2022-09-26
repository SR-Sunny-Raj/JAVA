import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String str = input.next();
        int count = -1, n = str.length();
        String ans = "";
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '1') {
                count++;
            } else if ((str.charAt(i) == '0' && count >= 0) || (i == n && count >= 0)) {
                ans += ("" + (char) (65 + count));
                count = -1;
            }
        }
        System.out.println(ans);
    }
}
