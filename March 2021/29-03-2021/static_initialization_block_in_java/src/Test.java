public class Test {
    private static int x;
    static {
        System.out.println("In static Initialization bolck : x = " + x);
        x = 11;
    }
}
