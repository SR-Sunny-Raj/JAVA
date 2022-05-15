import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), ans = 1, num = 1;
        while (n != 0) {
            if (num == 1 || num == 3) {
                n--;
                ans = num;
                num++;
            } else if (num % 2 != 0 && num % 3 != 0) {
                n--;
                ans = num;
                num++;
            } else {
                num++;
            }
        }
        System.out.println(ans);
        input.close();
    }
}
