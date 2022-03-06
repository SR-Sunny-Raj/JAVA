import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int n = input.nextInt(), m = input.nextInt(), k = input.nextInt();
            String str = Integer.toString(n), str1 = "";
            for (int i = 0; i < m; i++) {
                if (i != 0)
                    str = str1;
                str1 = "";
                for (int j = 0; j < str.length(); j++) {
                    str1 += Integer.parseInt(str.charAt(j) + "") + k;
                }
            }
            str = str1;
            System.out.println(str.length());
        }
        input.close();
    }
}
