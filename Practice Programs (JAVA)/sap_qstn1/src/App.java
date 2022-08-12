import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        int q = input.nextInt();
        int answer = 0;
        String str1 = Integer.toBinaryString(p);
        String str2 = Integer.toBinaryString(q);
        int add = 0;
        if (str1.length() < str2.length()) {
            add = str2.length() - str1.length();
            for (int i = 0; i < add; i++) {
                if (str2.charAt(i) == '1') {
                    answer++;
                }
            }
            for (int i = add; i < str2.length(); i++) {
                if (str1.charAt(i - add) != str2.charAt(i)) {
                    answer++;
                }
            }
        } else {
            add = str1.length() - str2.length();
            for (int i = 0; i < add; i++) {
                if (str1.charAt(i) == '1') {
                    answer++;
                }
            }
            for (int i = add; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i - add)) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
        input.close();
    }
}
