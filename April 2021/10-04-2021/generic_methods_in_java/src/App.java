public class App {
    public static void main(String[] args) throws Exception {
        A obj = new A();
        Integer[] arr = { 1, 2, 3, 4, 5 };
        String[] brr = new String[] { "Sunny", "Raj", "Funny" };
        obj.printArray(arr);
        obj.printArray(brr);
    }
}

class A {
    public <G> void printArray(G[] s) {
        for (G x : s) {
            System.out.println(x);
        }
    }
}
