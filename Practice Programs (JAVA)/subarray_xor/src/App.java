import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            long N = input.nextLong();
            String str = input.next();
            ArrayList<String> srr = new ArrayList<String>();
            for (int i = 0; i < N; i++) {
                for (int j = i; j < N; j++) {
                    srr.add(str.substring(i, j + 1));
                }
            }

            long[] decarr = new long[srr.size()];
            for (int i = 0; i < srr.size(); i++) {
                String temp = srr.get(i);
                long count = 0L;
                for (int k = 0, j = temp.length() - 1; j >= 0; j--, k++) {
                    if (temp.charAt(k) == '1') {
                        count += (Math.pow(2, j));
                    }
                }
                decarr[i] = count;
            }
            // testing purpose
            // for (int s : decarr) {
            // System.out.print(s + " ");
            // }
            // System.out.println();

            long res = decarr[0];
            for (int i = 1; i < decarr.length; i++) {
                res ^= decarr[i];
            }
            System.out.println(res % 998244353);
        }
        input.close();
    }
}
