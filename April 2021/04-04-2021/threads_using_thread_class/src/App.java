class A extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread A : " + i);
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread B : " + i);
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Thread t1 = new A();
        Thread t2 = new B();
        t1.start();
        t2.start();
    }
}
