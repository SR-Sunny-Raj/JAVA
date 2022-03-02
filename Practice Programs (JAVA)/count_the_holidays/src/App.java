import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T != 0) {
            int N = input.nextInt(), holidays = 8;
            for (int i = 0; i < N; i++) {
                int x = input.nextInt();
                if ((x % 7 != 6) && (x % 7 != 0))
                    holidays++;
            }
            System.out.println(holidays);
            T--;
        }
        input.close();
    }
}
