import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(autoBio(str));
    }

    public static int autoBio(String str) {
        int[] arr = new int[10];
        for (int i = 0; i < str.length(); i++) {
            arr[Integer.parseInt(str.charAt(i) + "")]++;
        }
        int flag = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Integer.parseInt(str.charAt(i) + "") != arr[i]) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            return 0;
        } else {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    count++;
                }
            }
            return count;
        }
    }
}
