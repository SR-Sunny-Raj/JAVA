import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter the number of rows you want in your 2D array -: ");
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        System.out.print("Enter the number of columns you want in your 2D array -: ");
        int c = input.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the elements in row " + (i + 1) + " -: ");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Our 2D array is -: " + Arrays.deepToString(arr));
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println("Sum of Row " + (i + 1) + " -: " + sum);
        }
    }
}
