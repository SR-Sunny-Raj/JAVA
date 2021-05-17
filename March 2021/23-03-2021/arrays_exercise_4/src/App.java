import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter the number of elements you want in the array -: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array -: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        findMinMax(arr);
    }

    private static void findMinMax(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Min = " + min + " and Max = " + max);
    }
}
