import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int start = input.nextInt(), end = input.nextInt(), count = 0;
        while (start <= end) {
            int temp = start, rev = 0;
            while (temp != 0) {
                int rem = temp % 10;
                temp /= 10;
                rev = (rev * 10) + rem;
            }
            if (start == rev) {
                count++;
            }
            start++;
        }
        System.out.println(count);
        input.close();
    }
}
