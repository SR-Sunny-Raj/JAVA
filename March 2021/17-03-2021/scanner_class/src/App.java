import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter your Name :- ");
        Scanner input = new Scanner(System.in);
        // .next() method reads only till space
        // System.out.println("Your Name is -: " + input.next());
        // .nextLine() reads the whole string along with spaces
        System.out.println("Your Name is -: " + input.nextLine());
    }
}
