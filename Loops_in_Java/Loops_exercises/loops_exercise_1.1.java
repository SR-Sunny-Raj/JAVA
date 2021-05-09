public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1)
                continue;
            System.out.print(i + " ");
        }
    }
}
