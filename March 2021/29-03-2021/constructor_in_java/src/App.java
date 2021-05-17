public class App {
    public static void main(String[] args) throws Exception {
        Box b1 = new Box();
        System.out.println("For Box-1\nLength is -: " + b1.getLength() + " , Breadth is -: " + b1.getBreadth()
                + " , Height is -: " + b1.getHeight());
        Box b2 = new Box(13, 21, 24);
        System.out.println("For Box-2\nLength is -: " + b2.getLength() + " , Breadth is -: " + b2.getBreadth()
                + " , Height is -: " + b2.getHeight());
    }
}
