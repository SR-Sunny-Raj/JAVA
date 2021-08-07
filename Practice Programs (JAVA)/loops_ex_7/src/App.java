import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt(), prev = 1, next = 1, fiboNum = 1;
        for (int i = 2; i < num; i++) {
            fiboNum = prev + next;
            prev = next;
            next = fiboNum;
        }
        System.out.println(fiboNum);
        input.close();
    }
}
