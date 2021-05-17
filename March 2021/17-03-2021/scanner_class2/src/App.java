import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter two integer to perform addition on them -: ");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int j = input.nextInt();
        System.out.println(i + j);
        // System.out.println(input.nextBoolean()); //It can read only true and false
    }
}
