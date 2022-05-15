import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int N = input.nextInt();
            solve(input);
        }
        input.close();
        System.exit(0);
    }

    public static void solve(Scanner input) {
        // int N = input.nextInt();
        // flush();
        String str = input.next();
        int c11 = 0, c01 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1' && (i % 2 == 0)) {
                c11++;
            } else if (str.charAt(i) == '0' && (i % 2 == 1)) {
                c01++;
            }
            if (str.charAt(i) == '1' && (i % 2 == 1)) {
                c11++;
            } else if (str.charAt(i) == '0' && (i % 2 == 0)) {
                c01++;
            }
        }
        int res = 0;
        int X = str.length();
        if ((X & 1) != 0)
            X--;
        boolean flag1 = true, flag2 = true;
        for (int i = 0; i <= X - 2; i += 2) {
            if (str.charAt(i) == '0' && str.charAt(i + 1) == '1') {
            } else {
                flag1 = false;
            }
            if (str.charAt(i) == '1' && str.charAt(i + 1) == '0') {
            } else {
                flag2 = false;
            }
        }
        if (flag1) {
            System.out.println(X / 2);
            return;
        } else if (flag2) {
            if (str.charAt(X) == '1') {
                System.out.println(X / 2);
                return;
            }
        }
        if (c11 == c01) {
            res = c11 - 1;
        } else if (c11 < c01) {
            res = c11;
        } else if (c11 > c01) {
            res = c01;
        }
        System.out.println(res);
        // System.exit(0);
    }

    public static int binarySearch(int arr[], int l, int r, int x) {
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
