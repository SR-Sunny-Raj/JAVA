import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int sum = input.nextInt();
            int max = (sum + 1) * -1;
            System.out.println(max);
        }
        input.close();
    }
}
