import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int N = input.nextInt(), flag = 0, count = 0;
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = input.nextInt();
            }
            for (int i = 0; i < N - 1; i++) {
                if (flag == 0 && arr[i] != arr[i + 1]) {
                    count += 2;
                    flag = 1;
                } else if (flag == 1 && arr[i] != arr[i + 1]) {
                    count += 1;
                    flag = 1;
                } else {
                    flag = 0;
                }
            }
            System.out.println(count);
        }
        input.close();
    }
}
