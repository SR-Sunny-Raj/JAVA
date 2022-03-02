import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int D = input.nextInt();
        String ch1 = input.next(), ch2 = input.next();
        int r1 = input.nextInt(), r2 = input.nextInt();
        long val1 = (((int) ch2.charAt(0)) - ((int) ch1.charAt(0))) + 1;
        val1 = val1 * val1;
        long val2 = (r2 - r1) + 1;
        val2 = val2 * val2 * val2 * val2;
        long res = D * val1 * val2;
        System.out.println(res);
        input.close();
    }
}
