import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int X = input.nextInt();
            int[] arr = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = input.nextInt();
            }
            Arrays.sort(arr);
            System.out.println((arr[0] * (X - 1)) + arr[1]);
        }
        input.close();
    }
}
