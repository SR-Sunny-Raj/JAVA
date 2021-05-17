public class App {
    public static void main(String[] args) throws Exception {
        B o1 = new B();
        o1.obj.fun();
    }
}

class A {
    public void fun() {
        System.out.println("Sunny Raj");
    }
}

class B {
    A obj = new A() {
        public void fun() {
            System.out.println("Anonymous Class");
        }
    };
}
