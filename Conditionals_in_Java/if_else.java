import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter a number -: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        if (x > 10)
            System.out.println("Greater than 10");
        else if (x == 10)
            System.out.println("Equal to 10");
        else
            System.out.println("Less than 10");
    }
}
