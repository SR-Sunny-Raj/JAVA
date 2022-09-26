import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt(), K = input.nextInt();
        int count = 0;
        while (N-- > 0) {
            if ((N ^ K) > (N & K)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
