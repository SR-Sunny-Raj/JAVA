import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            String s = input.next(), t = input.next(), m = "";
            for (int i = 0; i < 5; i++) {
                if (s.charAt(i) == t.charAt(i)) {
                    m += 'G';
                } else {
                    m += 'B';
                }
            }
            System.out.println(m);
        }
        input.close();
    }
}
