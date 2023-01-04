import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt(), flag;
        while (T-- > 0) {
            flag = 0;
            int N = input.nextInt();
            int[] arr = new int[2 * N];
            for (int i = 0; i < 2 * N; i++) {
                arr[i] = input.nextInt();
            }
            Arrays.sort(arr);
            for (int i = 0; i < 2 * N - 2; i++) {
                if (arr[i] == arr[i + 1]) {
                    if (arr[i] == arr[i + 2]) {
                        flag = 1;
                        break;
                    }
                }
            }
            if (flag == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        input.close();
    }
}
