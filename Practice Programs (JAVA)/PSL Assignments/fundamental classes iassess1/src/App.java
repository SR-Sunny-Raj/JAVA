import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the code");
        String str = input.next();
        StringBuilder sb = new StringBuilder();
        String str1 = str.substring(2, str.length());
        if (str.contains("DH")) {
            str = str.replace('H', 'E');
            str = str.replace(str.charAt(2), 'L');
            String strx = str.substring(0, 3);
            sb.append(strx);
        } else if (str.contains("MB")) {
            str = str.replace('B', 'U');
            str = str.replace(str.charAt(2), 'B');
            String strx = str.substring(0, 3);
            sb.append(strx);
        } else if (str.contains("KL")) {
            str = str.replace('L', 'O');
            str = str.replace(str.charAt(2), 'L');
            String strx = str.substring(0, 3);
            sb.append(strx);
        }

        for (int i = 0; i < (5 - str1.length()); i++) {
            sb.append("0");
        }
        sb.append(str1);
        System.out.println("Formatted code\n" + sb);
        input.close();
    }
}
