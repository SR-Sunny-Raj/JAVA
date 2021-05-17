public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 100; i >= 1; i--) {
            if (i % 2 == 1)
                continue;
            System.out.print(i + " ");
        }
    }
}
