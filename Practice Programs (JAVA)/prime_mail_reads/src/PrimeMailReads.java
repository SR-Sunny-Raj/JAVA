import java.util.*;

public class PrimeMailReads {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int sum = 0, X, N = input.nextInt(), ans = 1;
        while (N > 1) {
            sum = 0;
            ans += 1;
            for (X = 1; X <= N; X++) {
                if (primeNum(X))
                    sum += 1;
            }
            N -= sum;
        }
        System.out.print(ans);
    }

    private static boolean primeNum(int N) {
        if (N == 1 || N == 0)
            return false;

        for (int k = 2; k < N; k++) {
            if (N % k == 0)
                return false;
        }
        return true;
    }

    public int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }
}
