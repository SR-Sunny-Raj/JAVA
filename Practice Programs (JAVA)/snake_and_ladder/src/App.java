import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String[][] arr = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = input.next();
            }
        }
        String[] str = new String[100];
        int index = 0;
        for (int i = 9; i >= 0; i--) {
            if (i % 2 == 1) {
                for (int j = 0; j < 10; j++) {
                    str[index++] = arr[i][j];
                }
            } else {
                for (int j = 9; j >= 0; j--) {
                    str[index++] = arr[i][j];
                }
            }
        }
        // for (String i : str) {
        //     System.out.print(i + " ");
        // }

        ArrayList<Integer> num = new ArrayList<>();
        int x = input.nextInt();
        while () {
            num.add(e)
        }
    }
}
