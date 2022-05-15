import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }
        // Arrays.sort(arr);
        int numbottle = 0;
        for (int i = 0; i < N; i++) {
            numbottle = 0;
            while (arr[i] > 0) {
                if (arr[i] >= 10) {
                    numbottle += (arr[i] / 10);
                    arr[i] %= 10;
                }
                if (arr[i] >= 7) {
                    numbottle += (arr[i] / 7);
                    arr[i] %= 7;
                }
                if (arr[i] >= 5) {
                    numbottle += (arr[i] / 5);
                    arr[i] %= 5;
                } else {
                    numbottle += 1;
                    arr[i] = 0;
                }
                // if (arr[i] >= 1) {
                // numbottle += (arr[i] / 1);
                // arr[i] %= 1;
                // }
            }
            System.out.println(numbottle);
        }
        input.close();
    }
}
