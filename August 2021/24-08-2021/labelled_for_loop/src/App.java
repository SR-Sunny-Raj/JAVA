public class App {
    public static void main(String[] args) throws Exception {
        first: for (int i = 0; i < 3; i++) {
            if (i == 1) {
                continue first;
            }
            System.out.print(i + " ");
        }

        System.out.println();

        second: for (int i = 0; i < 3; i++) {
            if (i == 2) {
                break second;
            }
            System.out.print(i + " ");
        }
    }
}
