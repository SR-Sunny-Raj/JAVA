import java.io.BufferedWriter;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("./file1.txt", true);
        BufferedWriter bf = new BufferedWriter(fw);
        bf.write("Java Programming");
        bf.close();
    }
}
