import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            long N = input.nextLong();
            System.out.println((N + 1) / 7);
        }
        input.close();
    }
}
