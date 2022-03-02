import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T != 0) {
            int N = input.nextInt();
            if (N % 4 == 0) {
                System.out.println("Good");
            } else {
                System.out.println("Not Good");
            }
            T--;
        }
        input.close();
    }
}
