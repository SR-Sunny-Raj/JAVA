import java.awt.Point;

public class App {
    public static void main(String[] args) throws Exception {
        // Creation of Circle Class
        Circle c1 = new Circle(new Point(1, 2), 3);
        System.out.println(c1.getArea());
    }
}
