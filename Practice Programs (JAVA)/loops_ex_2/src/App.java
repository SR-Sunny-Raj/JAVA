import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while (sum < 100) {
            sum += input.nextInt();
        }
        System.out.println("Done");
        input.close();
    }
}
