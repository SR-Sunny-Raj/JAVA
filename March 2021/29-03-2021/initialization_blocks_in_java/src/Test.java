public class Test {
    private int x;
    {
        System.out.println("In initialization block : X = "+x ) ;
        x = 5;
    }

    public Test() {
        System.out.println("In constructor : x = " + x);
    }
}
