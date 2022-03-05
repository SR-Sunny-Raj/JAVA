import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int X = input.nextInt(), Y = input.nextInt();
            if (((X % 2 == 0) && (Y % 2 == 0)) || ((X % 2 == 1) && (Y % 2 == 1)))
                System.out.println("Janmansh");
            else
                System.out.println("Jay");
        }
        input.close();
    }
}
