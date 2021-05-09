import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter a number to get all the odd numbers till that number -: ");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        for (int i = 1; i <= x; i++) {
            if (i % 2 == 0)
                continue;
            System.out.print(i + "\t");
        }
    }
}
