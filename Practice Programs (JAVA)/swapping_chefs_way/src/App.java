import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int N = input.nextInt();
            String str = input.next();
            char[] arr = str.toCharArray();
            char[] brr = str.toCharArray();
            for (int i = 0; i < N / 2; i++) {
                if (arr[i] > arr[N - 1 - i]) {
                    char ch = arr[i];
                    arr[i] = arr[N - 1 - i];
                    arr[N - 1 - i] = ch;
                }
            }
            String cpystr = new String(arr);
            Arrays.sort(brr);
            String str1 = new String(brr);
            if (str1.equals(cpystr))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        input.close();
    }
}
