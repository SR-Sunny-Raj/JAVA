import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int N = input.nextInt(), M = input.nextInt();
            System.out.println(((N * 2) + (M * 4)));
        }
        input.close();
    }
}
