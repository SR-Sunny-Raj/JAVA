import java.util.*;

public class MovingAverage {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int X = input.nextInt(), Y = input.nextInt();
        int N = input.nextInt();
        float[] arr = new float[N];
        for (int i = 0; i < N; i++) {
            arr[i] = input.nextFloat();
        }
        int size1 = N - X + 1, size2 = N - Y + 1;
        float[] arr1 = new float[size1];
        float[] arr2 = new float[size2];

        float sum1 = 0;
        for (int i = 0; i < X; i++) {
            sum1 += arr[i];
        }
        arr1[0] = (float) sum1;

        float win_sum = sum1;
        for (int i = X, j = 1; i < N; i++, j++) {
            win_sum += arr[i] - arr[i - X];
            arr1[j] = win_sum;
        }

        for (int i = 0; i < size1; i++) {
            arr1[i] = (float) arr1[i] / X;
        }
        // for second array
        float sum2 = 0;
        for (int i = 0; i < Y; i++) {
            sum2 += arr[i];
        }
        arr2[0] = (float) sum2;

        float win_sum1 = sum2;
        for (int i = Y, j = 1; i < N; i++, j++) {
            win_sum1 += arr[i] - arr[i - Y];
            arr2[j] = win_sum1;
        }

        for (int i = 0; i < size2; i++) {
            arr2[i] = (float) arr2[i] / Y;
        }
        // for (int i = 0; i < size1; i++) {
        // float sum = arr[i];
        // for (int j = i + 1; j < i + X; j++) {
        // sum += arr[j];
        // }
        // arr1[i] = (float) sum / X;
        // }

        // for (int i = 0; i < size2; i++) {
        // float sum = arr[i];
        // for (int j = i + 1; j < i + Y; j++) {
        // sum += arr[j];
        // }
        // arr2[i] = (float) sum / Y;
        // }

        // For checking Values of arr1 and arr2
        // for (int i = 0; i < size1; i++) {
        // System.out.print(arr1[i] + " ");
        // }
        // System.out.println();
        // for (int i = 0; i < size2; i++) {
        // System.out.print(arr2[i] + " ");
        // }

        int max, min;
        if (size1 < size2) {
            max = size2;
            min = size1;
        } else {
            max = size1;
            min = size2;
        }
        int diff = max - min;

        int[] trend = new int[min];
        for (int i = 0; i < min; i++) {
            if (arr[i] < arr[i + diff]) {
                trend[i] = 0;
            } else {
                trend[i] = 1;
            }
        }
        int count = 0;
        for (int i = 0; i < min - 1; i++) {
            if (trend[i] != trend[i + 1])
                count++;
        }
        System.out.println(count);
        input.close();
    }
}
