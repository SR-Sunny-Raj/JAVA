import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0 && i != index) {
                arr[index] = arr[index] ^ arr[i];
                arr[i] = arr[index] ^ arr[i];
                arr[index] = arr[index] ^ arr[i];
                index++;
            } else {
                continue;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        input.close();
    }
}
