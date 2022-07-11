import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt(), flag = 0;
        if (num == 1 || num == 2) {
            flag = 0;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    flag = 1;
                }
            }
        }
        if (flag == 0) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
        input.close();
    }
}
