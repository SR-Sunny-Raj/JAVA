import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt(), flag = 1;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = 0;
                break;
            }
        }
        if (flag == 1)
            System.out.println(num + " is a Prime number.");
        else
            System.out.println(num + " is not a Prime number");
        input.close();
    }
}
