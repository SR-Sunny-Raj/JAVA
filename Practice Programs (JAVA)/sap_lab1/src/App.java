import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String strsent = input.next();
        String strrec = input.next();
        // yha se likho
        char chlost = '9';
        int i = 0, j = 0;
        for (int index = 0; index < strsent.length(); index++) {
            if (j >= strrec.length() - 1) {
                chlost = strsent.charAt(i + 1);
            } else if (strsent.charAt(i) == strrec.charAt(j)) {
                i++;
                j++;
            } else {
                chlost = strsent.charAt(i);
            }
        }
        System.out.println(chlost);
        input.close();
    }
}
