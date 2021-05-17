import java.io.FileInputStream;

public class App {
    public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream(
                "e:/My Codes/JAVA Codes/April 2021/06-04-2021/file_output_stream/file.txt");
        int i;
        do {
            i = fin.read();
            if (i != -1)
                System.out.print((char) i);
        } while (i != -1);
        fin.close();
    }
}
