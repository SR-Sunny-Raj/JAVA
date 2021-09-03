import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String[] arrstr = s.split("[\"!,?._'@\". ]+");
        System.out.println(arrstr.length);
        for (String a : arrstr) {
            System.out.println(a);
        }
        input.close();
    }
}
