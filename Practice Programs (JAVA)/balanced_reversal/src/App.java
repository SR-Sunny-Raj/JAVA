import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int N = input.nextInt();
            String str = input.next();
            char[] charr = str.toCharArray();
            Arrays.sort(charr);
            String resstr = new String(charr);
            System.out.println(resstr);
            // String resstr = "";
            // int count0 = 0, count1 = 0;
            // for (int i = 0; i < N; i++) {
            // if (str.charAt(i) == '0')
            // count0++;
            // else
            // count1++;
            // }
            // for (int i = 0; i < count0; i++) {
            // resstr += "0";
            // }
            // for (int i = 0; i < count1; i++) {
            // resstr += "1";
            // }
            // System.out.println(resstr);
        }
        input.close();
    }
}
