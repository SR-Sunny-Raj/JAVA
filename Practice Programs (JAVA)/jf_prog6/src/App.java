import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int sum = 0, tsum = 0, flag = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 6) {
                flag = 1;
            } else if (arr[i] == 7) {
                if (flag == 0) {
                    sum += arr[i];
                    continue;
                } else {
                    flag = 0;
                    tsum = 0;
                    continue;
                }
            }
            if (flag == 0) {
                sum += arr[i];
            } else if (flag == 1) {
                tsum = arr[i];
            }
            if (flag == 1 && arr[i] != 7 && i == n - 1) {
                sum += tsum;
            }
        }
        System.out.println(sum);
        input.close();
    }
}
