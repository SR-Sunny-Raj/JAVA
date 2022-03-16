import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            Boolean b = true;
            String A = input.next(), B = input.next();
            int N = input.nextInt();
            String[] arr = new String[N];
            String child = "";
            for (int i = 0; i < N; i++) {
                arr[i] = input.next();
                child += arr[i];
            }
            String parent = A + B;
            int countp[] = new int[256];
            for (int i = 0; i < parent.length(); i++) {
                countp[parent.charAt(i)]++;
            }
            for (int i = 0; i < child.length(); i++) {
                if (countp[child.charAt(i)] > 0) {
                    countp[child.charAt(i)]--;
                } else {
                    b = false;
                    break;
                }
            }
            if (b) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        input.close();
    }
}
