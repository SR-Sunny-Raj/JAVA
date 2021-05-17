public class App {
    public static void main(String[] args) throws Exception {
        byte b1 = 100;
        short s1 = 500;
        int i1 = 4000;
        long l1 = 10000, l2;
        l1 = b1 + s1 + i1;
        i1 = b1 + s1;
        l2 = 99999999999L;
        s1 = b1;
        System.out.println(l1);
        System.out.println(s1);
        System.out.println(i1);
        System.out.println(l2);
    }
}
