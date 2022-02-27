import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int Q = input.nextInt();
        while (Q > 0) {
            Long n = input.nextLong();
            Long l = input.nextLong();
            Long r = input.nextLong();
            Long min = 0L, minbase = 0L;
            // for (Long b = l; b <= r; b++) {
            //     Long num = n, count = 0L;
            //     while (num != 0) {
            //         count += (num % b);
            //         num /= b;
            //     }
            //     if (b == l || count < min) {
            //         min = count;
            //         minbase = b;
            //     }
            // }
            Long num = n, count = 0L;
            for (Long b = l; b <= r && num!=0 ;) {
                    count += (num % b);
                    num /= b;
                    if (b == l || (count < min && num==0)) {
                        min = count;
                        minbase = b;
                    }
                    if (num == 0) {
                        count = 0L;
                        num = n;
                        b++;
                }
            }
            System.out.println(minbase);
            Q--;
        }
        input.close();
    }
}
