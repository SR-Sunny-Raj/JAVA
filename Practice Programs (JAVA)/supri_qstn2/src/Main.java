import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < N; i++) {
            hs.add(arr[i]);
        }
        for (Integer i : hs) {
            System.out.println(i);
        }
    }
}
