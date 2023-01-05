import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt(), B = input.nextInt();
        String C = input.next();
        if (C.charAt(0) == '+') {
            System.out.println(A + B);
        } else if (C.charAt(0) == '-') {
            System.out.println(A - B);
        } else if (C.charAt(0) == '*') {
            System.out.println(A * B);
        } else {
            System.out.println((float) A / B);
        }
        input.close();
    }
}
