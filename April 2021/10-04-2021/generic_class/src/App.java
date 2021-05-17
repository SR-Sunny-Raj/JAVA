public class App {
    public static void main(String[] args) throws Exception {
        MyData<Integer> o1 = new MyData<Integer>();
        MyData<String> o2 = new MyData<String>();
        Integer k = new Integer(13);
        o1.add(k);
        o2.add("Sunny");
        System.out.println("o1 = " + o1.get() + "\no2 = " + o2.get());
    }
}

class MyData<G> {
    G i;

    public void add(G i) {
        this.i = i;
    }

    public G get() {
        return (i);
    }
}