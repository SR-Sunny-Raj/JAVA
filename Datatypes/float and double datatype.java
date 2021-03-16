public class App {
    public static void main(String[] args) throws Exception {
        float f1 = 4.5F;
        double d1 = 10.21;
        float f2 = 11; // Compiler will treat it as 11.0
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(f2);
        System.out.println(f1 + f2);
        System.out.println(f1 + d1);
    }
}
