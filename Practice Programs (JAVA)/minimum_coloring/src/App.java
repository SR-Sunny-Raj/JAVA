import java.util.*;

public class App {

    void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            StringBuilder sbuild = new StringBuilder();
            int N = input.nextInt(), M = input.nextInt();
            int[][] arr = new int[N][M];
            int x1 = input.nextInt(), y1 = input.nextInt(), x2 = input.nextInt(), y2 = input.nextInt();
            x1--;
            x2--;
            y1--;
            y2--;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if ((i + j) % 2 == (x1 + y1) % 2) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = 2;
                    }
                }
            }
            if ((x1 + y1) % 2 == (x2 + y2) % 2) {
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < M; j++) {
                        if (arr[i][j] == 2) {
                            arr[i][j] = 3;
                        }
                    }
                }
                arr[x2][y2] = 2;
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    sbuild.append(arr[i][j] + " ");
                }
                sbuild.append("\n");
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
        input.close();
    }

    public static void binarySearch(int arr[], int first, int last, int key) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Element is found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element is not found!");
        }
    }
}
