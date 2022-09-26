import java.util.*;

public class App {

    public static int createPin(int input1, int input2, int input3) {
        int arr[] = new int[10];
        Arrays.fill(arr, 0);
        while (input1 != 0) {
            int rem = input1 % 10;
            arr[rem]++;
            input1 /= 10;
        }
        while (input2 != 0) {
            int rem = input2 % 10;
            arr[rem]++;
            input2 /= 10;
        }
        while (input3 != 0) {
            int rem = input3 % 10;
            arr[rem]++;
            input3 /= 10;
        }
        int res = 0;
        int maxfre = -1, maxfreval = -1, minfre = Integer.MAX_VALUE, minfreval = Integer.MAX_VALUE, largedig = -1,
                smalldig = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > maxfreval) {
                maxfre = i;
                maxfreval = arr[i];
            }
            if (arr[i] > 0 && largedig == -1) {
                largedig = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minfreval && arr[i] != 0) {
                minfre = i;
                minfreval = arr[i];
            }
            if (arr[i] > 0 && smalldig == -1) {
                smalldig = i;
            }
        }
        res = (res * 10) + maxfre;
        res = (res * 10) + minfre;
        res = (res * 10) + largedig;
        res = (res * 10) + smalldig;
        // System.out.println(maxfre + " , " + minfre + " , " + largedig + " , " +
        // smalldig);
        // System.out.println();
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i] + " ");
        // }
        return res;
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int input1 = input.nextInt(), input2 = input.nextInt(), input3 = input.nextInt();
        int res = createPin(input1, input2, input3);
        System.out.println(res);
    }
}
