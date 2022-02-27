import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextLine();
        }
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            if (arr[i].length() < 8 || arr[i].length() > 30) {
                System.out.println("Invalid");
                flag = false;
            } else {
                for (int j = 0; j < arr[i].length(); j++) {
                    if (arr[i].codePointAt(0) < 65 || (arr[i].codePointAt(0) > 90 && arr[i].codePointAt(0) < 97)
                            || arr[i].codePointAt(0) > 122) {
                        System.out.println("Invalid");
                        flag = false;
                        break;
                    } else if (arr[i].codePointAt(j) < 48 || (arr[i].codePointAt(j) > 57 && arr[i].codePointAt(j) < 65)
                            || (arr[i].codePointAt(j) > 90 && arr[i].codePointAt(j) < 97)
                            || arr[i].codePointAt(j) > 122) {
                        if (arr[i].codePointAt(j) == 95) {
                            continue;
                        } else {
                            System.out.println("Invalid");
                            flag = false;
                            break;
                        }
                    }
                }
                if (flag == true) {
                    System.out.println("Valid");
                }
            }
        }
        input.close();
    }
}
