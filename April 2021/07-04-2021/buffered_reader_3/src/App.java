import java.io.BufferedReader;
import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("file1.txt");
        BufferedReader br = new BufferedReader(fr);
        char[] ch = new char[20];
        br.read(ch, 15, 5);
        System.out.println(ch);
        br.close();
    }
}
