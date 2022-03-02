import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            long R1 = input.nextLong(), R2 = input.nextLong(), R3 = input.nextLong(), V1 = input.nextLong(),
                    V2 = input.nextLong(), V3 = input.nextLong(), N = input.nextLong();
            // double w1 = (double) (V1 / R1), w2 = (double) V2 / R2, w3 = (double) V3 / R3;
            // double s1 = (double) (w1 * R1 * N) % 360, s2 = (double) (w2 * R2 * N) % 360,
            // s3 = (double) (w3 * R3 * N) % 360;
            long s1 = (V1 * N) % 360, s2 = (V2 * N) % 360, s3 = (V3 * N) % 360;
            if ((s1 == s2) && (s1 == s3)) {
                System.out.println("TRUE");
            } else {
                System.out.println("FALSE");
            }
        }
        input.close();
    }
}
