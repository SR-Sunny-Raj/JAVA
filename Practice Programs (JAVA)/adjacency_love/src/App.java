import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int N = input.nextInt();
            int[] arr = new int[N];
            int noeven = 0, noodd = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = input.nextInt();
                if (arr[i] % 2 == 0) {
                    noeven++;
                } else {
                    noodd++;
                }
            }
            int oddpair = noodd / 2, evenpair = noeven / 2;
            noeven %= 2;
            noodd %= 2;
            if (((oddpair % 2 == 1) && (!(noeven == 0 && noodd == 1)))
                    || ((oddpair % 2 == 0) && (noeven == 0 && noodd == 1))) {
                // int evenele = 0, oddele = 0;
                for (int i = 0; i < N; i++) {
                    if (arr[i] % 2 == 0) {
                        System.out.print(arr[i] + " ");
                    }
                }
                for (int i = 0; i < N; i++) {
                    if (arr[i] % 2 == 1) {
                        System.out.print(arr[i] + " ");
                    }
                }
            } else {
                System.out.print(-1);
            }
            System.out.println();
        }
        input.close();
    }
}
