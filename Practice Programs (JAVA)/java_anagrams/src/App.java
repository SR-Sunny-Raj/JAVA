import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b = input.next();
        char[] arr = a.toCharArray();
        char[] brr = b.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(brr);
        if (Arrays.equals(arr, brr)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
        input.close();
    }
}
