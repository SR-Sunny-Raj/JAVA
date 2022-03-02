import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T != 0) {
            int x1 = input.nextInt(), x2 = input.nextInt(), y1 = input.nextInt(), y2 = input.nextInt();
            double c1 = ((double) y1 / x1);
            double c2 = ((double) y2 / x2);
            if (c1 < c2)
                System.out.println(-1);
            else if (c1 == c2)
                System.out.println(0);
            else
                System.out.println(1);
            T--;
        }
        input.close();
    }
}
