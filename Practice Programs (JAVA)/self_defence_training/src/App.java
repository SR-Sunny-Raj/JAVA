import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T != 0) {
            int N = input.nextInt(), count = 0;
            for (int i = 0; i < N; i++) {
                int age = input.nextInt();
                if (age >= 10 && age <= 60) {
                    count++;
                }
            }
            System.out.println(count);
            T--;
        }
        input.close();
    }
}
