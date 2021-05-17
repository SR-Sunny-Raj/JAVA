import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter the number of elements you want in the array -: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements in the array -: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        search(arr);
        while (true) {
            System.out.println("Do you again want to search for any other element in the array (Y/N) -: ");
            String ch = input.next();
            if (ch.charAt(0) == 'Y' || ch.charAt(0) == 'y')
                search(arr);
            else
                break;
        }
    }

    private static void search(int[] arr) {
        System.out.print("Enter the element you want to search in the array -: ");
        int s = new Scanner(System.in).nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (s == arr[i])
                count++;
            else
                continue;
        }
        System.out.println(s + " occurs " + count + " times");
    }
}
