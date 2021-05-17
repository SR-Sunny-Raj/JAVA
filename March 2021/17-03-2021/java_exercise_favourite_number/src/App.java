import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter your favourite integer number -: ");
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextInt() + " is my favourite number too!!");
    }
}
