import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int X = input.nextInt(), Y = input.nextInt(), A = input.nextInt(), B = input.nextInt(), count = 2;
            if (X == A || X == B)
                count--;
            if (Y == A || Y == B)
                count--;
            System.out.println(count);
        }
        input.close();
    }
}
