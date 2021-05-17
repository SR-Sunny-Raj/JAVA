public class App {
    public static void main(String[] args) throws Exception {
        Outer.Inner obj = new Outer.Inner();
        obj.fun();
    }
}

class Outer {
    static int x = 21;

    static class Inner {
        public void fun() {
            System.out.println("Inner Class" + x);
        }
    }
}
