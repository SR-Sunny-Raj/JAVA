import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int fp = 0, lp = str.length() - 1;
        char[] arr = str.toCharArray();
        while (fp < lp) {
            char temp = arr[fp];
            arr[fp] = arr[lp];
            arr[lp] = temp;
            fp++;
            lp--;
        }
        str = "";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
        }
        // str = Character.toString(arr);
        System.out.println(str);
        input.close();
    }
}
