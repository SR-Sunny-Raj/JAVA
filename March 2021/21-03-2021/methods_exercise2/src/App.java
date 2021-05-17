import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter numbers between which you want to get the prime numbers -: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }
        printPrimes(x, y);
    }

    public static void printPrimes(int x, int y) {
        int flag = 1;
        for (int i = x; i <= y; i++) {
            if (i == 1 || i == 2)
                System.out.print(i + "\t");
            else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        flag = 0;
                        break;
                    }
                }
                if (flag == 1)
                    System.out.print(i + "\t");
                flag = 1;
            }
        }
    }
}
