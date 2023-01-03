import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int N = input.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = input.nextInt();
            }
            Arrays.sort(arr);
            for (int i = 0; i < N;) {
                if (i == N - 1) {
                    System.out.println(arr[i]);
                    i++;
                } else if (arr[i] == arr[i + 1]) {
                    i += 2;
                } else if (arr[i] != arr[i + 1]) {
                    System.out.println(arr[i]);
                    i++;
                }
            }
        }
        input.close();
    }
}
