import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        File f1 = new File("./file1.txt");
        f1.createNewFile();
        System.out.println("File Size -: " + f1.length());
        System.out.println("Is exist -: " + f1.exists());
        System.out.println("can read -: " + f1.canRead());
        System.out.println("File name -: " + f1.getName());
        f1.delete();
    }
}
