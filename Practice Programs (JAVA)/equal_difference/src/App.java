import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T != 0) {
            int N = input.nextInt();
            long[] arr = new long[N];
            for (int i = 0; i < N; i++) {
                arr[i] = input.nextInt();
            }
            Arrays.sort(arr);
            int count = 1, tempCount = 1;
            if (N <= 2) {
                System.out.println(0);
            } else {
                for (int i = 0; i < N - 1; i++) {
                    if (arr[i] == arr[i + 1]) {
                        tempCount++;
                    } else {
                        if (count < tempCount) {
                            count = tempCount;
                            tempCount = 1;
                        }
                    }
                    if (i == N - 1) {
                        if (tempCount > count) {
                            count = tempCount;
                        }
                    }
                }
                if (count == 1)
                    System.out.println(N - 2);
                else
                    System.out.println(N - count);
            }
            T--;
        }
        input.close();
    }
}
