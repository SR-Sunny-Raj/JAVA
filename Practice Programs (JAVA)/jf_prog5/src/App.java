import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int index = 0, count = 0;
        for (int i = 0; i < n; i++) {
            int flag = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < n - count; i++) {
            System.out.print(arr[i] + " ");
        }
        input.close();
    }
}
