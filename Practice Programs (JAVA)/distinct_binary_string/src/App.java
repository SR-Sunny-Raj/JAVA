import java.util.HashSet;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T != 0) {
            int N = input.nextInt();
            String str = input.next();
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < N; i++) {
                String nstr = str.substring(0, i) + str.substring(i + 1, N);
                int x = Integer.parseInt(nstr);
                set.add(x);
            }
            System.out.println(set.size());
            T--;
        }
        input.close();
    }
}
