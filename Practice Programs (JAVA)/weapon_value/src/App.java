import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int N = input.nextInt();
            String[] arr = new String[N];
            for (int i = 0; i < N; i++) {
                arr[i] = input.next();
            }
            for (int i = 0; i < N - 1; i++) {
                char[] ch1 = arr[i].toCharArray();
                char[] ch2 = arr[i + 1].toCharArray();
                String str = "";
                for (int j = 0; j < arr[i].length(); j++) {
                    if (ch1[j] == ch2[j])
                        str += "0";
                    else
                        str += "1";
                }
                arr[i + 1] = str;
            }
            int count1 = 0;
            for (int i = 0; i < arr[N - 1].length(); i++) {
                if (arr[N - 1].charAt(i) == '1')
                    count1++;
            }
            System.out.println(count1);
        }
        input.close();
    }
}
