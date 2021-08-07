import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int min = num, max = num;
        while (num >= 0) {
            if (num > max)
                max = num;
            else if (num < min)
                min = num;
            num = input.nextInt();
        }
        System.out.println("Min = " + min + " and Max = " + max);
        input.close();
    }
}
