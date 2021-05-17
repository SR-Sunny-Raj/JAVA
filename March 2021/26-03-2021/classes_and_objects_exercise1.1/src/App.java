public class App {
    public static void main(String[] args) throws Exception {
        Rectangle r = new Rectangle();
        System.out.println(r.getWidth() + " , " + r.getHeight());
        System.out.println(r.getPerimeter());
        System.out.println(r.getArea());
        r.setWidth(2.5);
        r.setHeight(3.6);
        System.out.println(r.getPerimeter());
        System.out.println(r.getArea());
    }
}
