import java.io.BufferedReader;
import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {
        FileReader in = new FileReader("file1.txt");
        BufferedReader bf = new BufferedReader(in);
        int ch;
        while ((ch = bf.read()) != -1) {
            System.out.print((char) ch);
        }
        bf.close();
    }
}
