import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int N = input.nextInt();
            String str = input.next(), str1 = "", str2 = "";
            for (int i = 0; i < N; i += 2) {
                if (i == N - 1) {
                    str1 += str.charAt(i);
                } else {
                    str1 += str.charAt(i + 1);
                    str1 += str.charAt(i);
                }
            }
            for (int i = 0; i < N; i++) {
                if (str1.charAt(i) < 110) {
                    str2 += (char) (122 - (str1.charAt(i) - 97));
                } else {
                    str2 += (char) (97 + (122 - str1.charAt(i)));
                }
            }
            System.out.println(str2);
        }
        input.close();
    }
}
