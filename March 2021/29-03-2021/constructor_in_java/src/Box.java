public class Box {
    private int length, breadth, height;

    public Box() { // Constructor
        length = 10;
        breadth = 20;
        height = 30;
    }

    public Box(int l, int b, int h) { // Parameterised Constructor
        length = l;
        breadth = b;
        height = h;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getHeight() {
        return height;
    }
}
