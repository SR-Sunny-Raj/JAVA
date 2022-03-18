import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int[] brr = new int[arr.length];
        Arrays.sort(arr);
        int start = 0, end = arr.length - 1, flag = 1;
        if (arr.length % 2 == 0)
            flag = 0;
        for (int i = arr.length - 1; start <= end;) {
            if (flag == 0) {
                brr[i] = arr[end];
                i--;
                if (i < 0)
                    break;
                brr[i] = arr[start];
                i--;
                start++;
                end--;
            } else {
                brr[i] = arr[start];
                i--;
                if (i < 0)
                    break;
                brr[i] = arr[end];
                i--;
                start++;
                end--;
            }
        }
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
        input.close();
    }
}
