import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter a number -: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int max = x, min = x;
        boolean b1 = false;
        while (x >= 0) {
            b1 = true;
            if (x > max)
                max = x;
            if (x < min)
                min = x;
            System.out.print("Enter a number -: ");
            x = input.nextInt();
        }
        if (b1)
            System.out.println("Max = " + max + "\nMin = " + min);
        else
            System.out.println(x + " is Invalid");
    }
}
