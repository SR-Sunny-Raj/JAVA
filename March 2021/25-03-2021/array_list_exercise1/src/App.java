import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter the number of elements you want in your list -: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("Enter the elements in the list -: ");
        for (int i = 0; i < n; i++) {
            arr.add(input.nextInt());
        }
        System.out.println("Our arraylist is -: " + arr);
        Collections.sort(arr);
        ArrayList<Integer> brr = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            if (arr.get(i) != arr.get(i + 1))
                brr.add(arr.get(i));
        }
        brr.add(arr.get(n - 1));
        System.out.println("\nOur unique sorted elements are -: " + brr);
    }
}
