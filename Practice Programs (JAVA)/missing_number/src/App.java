import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            long[] arr = new long[4];
            for (int i = 0; i < 4; i++) {
                arr[i] = input.nextLong();
            }
            Arrays.sort(arr);
            long x1 = (arr[2] + arr[0]) / 2;
            long y1 = arr[2] - x1;
            long x2 = (arr[2] + arr[1]) / 2;
            long y2 = arr[2] - x2;
            long x3 = (arr[3] + arr[0]) / 2;
            long y3 = arr[3] - x3;
            long x4 = (arr[3] + arr[1]) / 2;
            long y4 = arr[3] - x4;
            int flag = 0;
            if ((x1 % 1 == 0) && (x1 != 0) && (y1 % 1 == 0) && (y1 != 0)) {
                if (((x1 / y1) == arr[1]) && (x1 * y1 == arr[3]) && (x1 >= 1) && (y1 >= 1)
                        && (x1 <= 10000) && (y1 <= 10000)) {
                    flag = 1;
                    System.out.println(x1 + " " + y1);
                }
            }
            if ((x2 % 1 == 0) && (x2 != 0) && (y2 % 1 == 0) && (y2 != 0)) {
                if (((x2 / y2) == arr[0]) && (x2 * y2 == arr[3]) && (x2 >= 1) && (y2 >= 1)
                        && (x2 <= 10000) && (y2 <= 10000)) {
                    flag = 1;
                    System.out.println(x2 + " " + y2);
                }
            }
            if ((x3 % 1 == 0) && (x3 != 0) && (y3 % 1 == 0) && (y3 != 0)) {
                if (((x3 / y3) == arr[1]) && (x3 * y3 == arr[2]) && (x3 >= 1) && (y3 >= 1)
                        && (x3 <= 10000) && (y3 <= 10000)) {
                    flag = 1;
                    System.out.println(x3 + " " + y3);
                }
            }
            if ((y4 % 1 == 0) && (y4 != 0) && (y4 % 1 == 0) && (y4 != 0)) {
                if (((x4 / y4) == arr[0]) && (x4 * y4 == arr[2]) && (x4 >= 1) && (y4 >= 1)
                        && (x4 <= 10000) && (y4 <= 10000)) {
                    flag = 1;
                    System.out.println(x4 + " " + y4);
                }
            }
            if (flag == 0)
                System.out.println("-1 -1");
        }
        input.close();
    }

    int binarySearch(int arr[], int l, int r, int x) {
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
