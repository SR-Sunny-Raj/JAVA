import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T != 0) {
            int N = input.nextInt();
            int K = input.nextInt();
            int[] arr = new int[N];
            String str = "";
            for (int i = 0; i < N; i++) {
                arr[i] = input.nextInt();
            }
            for (int i = 0; i < N; i++) {
                if (K >= arr[i]) {
                    str += '1';
                    K -= arr[i];
                } else {
                    str += '0';
                }
            }
            System.out.println(str);
            T--;
        }
        input.close();
    }
}
