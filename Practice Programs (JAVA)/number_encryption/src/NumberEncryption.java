import java.util.*;

public class NumberEncryption {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String str1 = input.next(), str2 = input.next();
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        int pos = 0;
        for (int i = 0; i < str2.length(); i++) {
            switch (ch2[i]) {
                case 'R':
                    if (pos + 1 < str1.length())
                        pos++;
                    break;
                case 'L':
                    if (pos > 0)
                        pos--;
                    break;
                case 'T':
                    if (ch1[pos] != '9')
                        ch1[pos]++;
                    break;
                case 'D':
                    if (ch1[pos] != '0')
                        ch1[pos]--;
                    break;
                case 'S':
                    // i++;
                    String number = "";
                    for (i++; (i < str2.length()) && ch2[i] >= '0' && ch2[i] <= '9'; i++)
                        number = number + ("" + ch2[i]);
                    i--;
                    int x = Integer.parseInt(number);
                    char ch = ch1[pos];
                    ch1[pos] = ch1[x - 1];
                    ch1[x - 1] = ch;
                    break;
            }
        }
        // for (int i = 0; i < ch1.length; i++) {
        // System.out.print(ch1[i]);
        // }
        String ans = String.copyValueOf(ch1);
        System.out.println(ans);
        input.close();
    }
}
