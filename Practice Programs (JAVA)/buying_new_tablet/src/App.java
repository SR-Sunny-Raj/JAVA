import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T > 0) {
            int N = input.nextInt();
            int B = input.nextInt();
            int area = 0;
            for (int i = 0; i < N; i++) {
                int W = input.nextInt();
                int H = input.nextInt();
                int P = input.nextInt();
                if (P <= B && (W * H) >= area) {
                    area = W * H;
                }
            }
            if (area == 0) {
                System.out.println("no tablet");
            } else {
                System.out.println(area);
            }
            T--;
        }
        input.close();
    }
}
