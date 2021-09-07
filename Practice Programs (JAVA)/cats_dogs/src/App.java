import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            long C = input.nextInt(), D = input.nextInt(), L = input.nextInt(),min=0L;
            if (C <= D * 2) {
                min = D * 4;
            } else {
                min = (C - D) * 4;
            }
            if (min <= L && L % 4 == 0 && L <= (C + D) * 4) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        input.close();
    }
}
