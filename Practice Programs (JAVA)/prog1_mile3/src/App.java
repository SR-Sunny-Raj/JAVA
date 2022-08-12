import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int input1 = input.nextInt();
        int input2 = input.nextInt();
        int input3 = input.nextInt();
        int t = 0;

        if (input2 % 2 == 0 && isPrime(input2)) {
            t = input1 * input1;
            int sum = 0;
            for (int i = 2, j = 1; j <= input2; i++) {
                boolean x = isPrime(i);
                if (x) {
                    sum += i;
                    j++;
                }
            }
            t *= sum;
        } else if (input2 % 2 != 0 && isPrime(input2)) {
            t = input2 * input2;
            int sum = 0;
            for (int i = 2, j = 1; j <= input3; i++) {
                boolean x = isPrime(i);
                if (x) {
                    sum += i;
                    j++;
                }
            }
            t *= sum;
        } else if (input2 % 2 == 0 && !isPrime(input2)) {
            t = input3 * input3;
            int sum = 0;
            for (int i = 2, j = 1; j <= input2 + input3; i++) {
                boolean x = isPrime(i);
                if (x) {
                    sum += i;
                    j++;
                }
            }
            t *= sum;
        } else if (input2 % 2 != 0 && !isPrime(input2)) {
            int sum = 0;
            for (int i = 2, j = 1; j <= input1 + input2 + input3; i++) {
                boolean x = isPrime(i);
                if (x) {
                    sum += i;
                    j++;
                }
            }
            t = sum;
        }

        if (isPrime(t)) {
            System.out.println(t + input3);
        } else {
            System.out.println(t - input3);
        }
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
