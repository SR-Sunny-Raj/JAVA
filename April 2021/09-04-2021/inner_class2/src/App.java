public class App {
    public static void main(String[] args) throws Exception {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.fun();
    }
}

class Outer {
    int x = 21;

    class Inner {
        public void fun() {
            System.out.println("Inner Class " + x);
        }
    }
}
